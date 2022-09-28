import java.util.*;

/*
 * 일부는 1_두 배열 합치기 정리 내용 참고
 */
class Main {	
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		
		Arrays.sort(a);
		Arrays.sort(b);

		int p1 = 0;
		int p2 = 0;

		while(p1 < n && p2 < m) { // 아무 쪽이나 하나가 끝나면, 비교 할 배열이 더이상 없으므로 그대로 비교 종료
			if(a[p1] == b[p2]) { // answer에 넣고 위치 값을 둘 다 증가. 둘은 이미 비교 했고, 해당 값은 정답에 포함되었기 때문.
				answer.add(a[p1++]);
				p2++;
			} else if(a[p1] < b[p2]) { // 작은 쪽이 증가. 오름차순으로 정렬되었기 때문에 작은 쪽에 비교할 내용이 더 있을수도 있기 때문이다.
				p1++;
			} else {
				p2++;
			}
		} 
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = kb.nextInt();
		}

		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++) {
			b[i] = kb.nextInt();
		}

		for(int x : T.solution(n, m, a, b)) {
			System.out.print(x + " ");
		}
	}
}