import java.util.*;

/*
 * [Sliding Window] : 길이가 n인 창문을 만들어서 배열을 진행
 * i를 하나씩 증가해서 더하면 O(n의 2승)이 된다. i의 반복문을 돌면서 또 n의 길이만큼 반복문을 돌아야함
 * Sliding window는 배열의 길이만큼만 돌면됨
 * 1. 초기에 n의 길이만큼 반복문을 돌아서 sum을 구함
 * 2. 이제 i 반복문을 돌면서 i+1을 더하고 i-1을 빼서 다음 배열의 합을 구한다.
 * 3. 기존 sum과 새로운 sum을 비교해서 최대값을 구함.
 */
class Main {	
	public int solution(int n, int k, int[] arr){
		int answer = 0;
		int sum = 0;
		for(int i=0; i<k; i++) { // 첫번째 window 생성
			sum += arr[i];
		} 

		answer = sum; // 첫번째 sum 값 삽입

		for(int i=k; i<n; i++){
			sum += (arr[i] - arr[i-k]); // 다음 위치값 i를 더하고, 이전 위치값 i-k을 뺀다.
			// 0 1 [2 3 4] 5 6 에서
			// 0 1 2 [3 4 5] 6 으로. i값 5를 더하고, i-k값 2를 뺀다.
			answer = Math.max(answer, sum);
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}
}