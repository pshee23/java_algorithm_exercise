import java.util.*;

/*
 * [Time Limit Exceeded]
 * 답은 맞으나 대량의 데이터 처리 과정에서 시간 초과 됨.
 * n의 길이만큼의 반복문과 추가로 k의 길이만큼의 반복문이 진행되므로 시간초과 발생. n x k 
 */
class Main {	
	public int solution(int n, int k, int[] a){
		int answer = 0;

		for(int i=k; i<n+1; i++) {
			int tmp = 0;
			for(int j=i-k; j<i; j++) {
				tmp += a[j];
			}
			if(tmp > answer) {
				answer = tmp;
			}
		}
		
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, k, a));
	}
}