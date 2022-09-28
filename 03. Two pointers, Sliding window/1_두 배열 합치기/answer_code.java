import java.util.*;

/*
 * [Two Pointers Algorithm]을 사용해서 문제를 풀자.
 * 시간 복잡도가 o(nlogn)이 아니라 o(n)으로 되도록. 
 * 1. P1과 P2를 비교해서 더 작은 쪽을 answer에 add 하자.
 * 2. 값을 넣은 쪽을 +1 증가시키자. 
 * 3. 둘 중에 하나가 끝까지 가면, while문을 나와서 남아있는 쪽을 answer에 모두 넣자.
 */
class Main {	
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0; // p : 포인터
		int p2 = 0;

		while(p1 < n && p2 < m) { // p1과 p2의 길이가 n이나 m이 되면 거짓이 되므로 while 탈출.
		// &&는 둘중에 하나만 false가 되면 모두 false
			if(a[p1] < b[p2]) {
				answer.add(a[p1++]); // 후위++이면, answer.add(a[p1])가 된 후, p1++이 진행.
			} else {
				answer.add(b[p2++]);
			}
		}
		
		while(p1 < n) { // p1의 배열이 남은 경우
			answer.add(a[p1++]);
		}
		
		while(p2 < m) { // p2의 배열이 남은 경우
			answer.add(b[p2++]);
		}

		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		int n=kb.nextInt();
		
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i] = kb.nextInt();
		}
		
		int m=kb.nextInt();
		int[] b=new int[m];
		for(int i=0; i<m; i++){
			b[i] = kb.nextInt();
		}

		for(int x : T.solution(n, m, a, b)) {
			System.out.print( x + " ");
		}
	}
}