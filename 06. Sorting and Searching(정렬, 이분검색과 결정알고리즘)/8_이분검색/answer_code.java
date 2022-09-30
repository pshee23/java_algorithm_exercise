import java.util.*;

/*
 * [이분검색 binary search]
 * 정렬된 상탱서 이분 검색 해야 함. arr : 12 23 32 57 65 81 87 99
 * lt : 시작 index :0 , rt 끝 index : n-1, mid : 중앙 index : (0 + 7) / 2
 * mid를 기준으로 m이 mid보다 작으면 검색범위를 lt ~ mid로 변경, 그 반대인 경우 범위를 mid ~ rt로 변경
 * 검색 범위를 계속 줄여나가는 것이다. 
 */
class Main {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr); // 오름차순 정렬
		
		int lt = 0;
		int rt = n-1;
		while(lt <= rt) { // 검색 범위가 같아지거나 바뀌어지면 검색 끝
			int mid = (lt + rt) / 2;
			if(arr[mid] == m){
				answer = mid + 1;
				break;
			}
			
			if(arr[mid] > m) { // m값이 중앙보다 작다. 그럼 rt 쪽은 검색범위에서 제거. 중앙 index인 mid-1위치로 rt를 변경
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}
}