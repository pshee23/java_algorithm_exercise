import java.util.*;
class Main {	
	public int solution(int n, int[][] arr){
		int answer = -2147000000; // 정답값 초기화
		int sum1 = 0;  // 행의 합
		int sum2 = 0;  // 열의 합

		// 행의 합, 열의 합
		for(int i=0; i<n; i++){
			sum1 = 0; // i의 행의 합
			sum2 = 0; // i의 열의 합
			for(int j=0; j<n; j++){
				sum1 += arr[i][j]; 
				sum2 += arr[j][i]; 
			}
			answer = Math.max(answer, sum1); // i의 행의 합과 최댓값과 비교
			answer = Math.max(answer, sum2); // i의 열의 합과 최댓값과 비교
		}

		sum1 = 0; // 왼쪽 위에서 오른쪽 아래 대각선 합
		sum2 = 0; // 오른쪽 위에서 왼쪽 아래 대각선 합
		for(int i=0; i<n; i++){
			sum1 += arr[i][i];
			sum2 += arr[i][n-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}