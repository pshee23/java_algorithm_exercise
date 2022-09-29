import java.util.*;

/*
 * 이중 포문을 돌게 되면 O(n제곱)이 됨. O(N)으로 끝내도록 하자.
 * [two pointer] lt ~ rt 의 합. 
 * 1. 처음 rt + lt의 합을 sum에 저장. 저장 후 sum이 m 값인지 확인
 * 2. (반복1) rt를 증가 시키고 증가시킨 값을 sum에 저장. 저장 후 sum이 m 값인지 확인 (증가하고, 더하고, 확인 루틴)
 * 3. (반복2) sum이 m 보다 크게 되면, lt가 가리키는 값을 sum에서 빼고, lt를 증가시키고, sum이 m 값인지 확인
 */
class Main {	
	public int solution(int n, int m, int[] arr){
		int answer = 0;
		int sum = 0;
		int lt = 0;

		for(int rt=0; rt<n; rt++){ // 아래 작업 후 rt 위치 증가. 
			sum += arr[rt]; // sum에 현재 위치의 rt값을 더한다. lt부터 rt까지의 합.
			if (sum == m) { // rt값을 더하면 바로 값을 m과 비교.
				answer++;
			}
			
			while (sum >= m) { // sum이 m보다 크면. 아래 작업 후 sum이 계속 m보다 크다면 반복. 아니면 탈출
				sum -= arr[lt++]; // sum에서 lt위치의 값을 뺀다.
				if (sum == m) { // m이랑 같다면 값 증가. 
					answer++;
				} 
			} //sum이 m 미만이 되면 탈출
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	}
}