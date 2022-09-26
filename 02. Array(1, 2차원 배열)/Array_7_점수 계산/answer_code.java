import java.util.*;
class Main {
	/* 
	 * 1. 1 만나면 cnt에 1증가, answer에 cnt값을 누적 증가
	 * 2. 0 만나면 cnt는 0으로 초기화. pass
	 * 3. 다시 1만나면 cnt 1증가, answer에 cnt 값 누적 증가
	 * 4. 또 1 만나면 cnt 1증가, answer에 증가된 cnt값을 누적 증가
	*/
	public int solution(int n, int[] arr){
		int answer = 0;
		int cnt = 0;
		for(int i=0; i<n; i++){
			if(arr[i] == 1){
				cnt++;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}	
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
}