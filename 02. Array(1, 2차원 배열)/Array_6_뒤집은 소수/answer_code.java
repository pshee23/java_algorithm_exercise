import java.util.*;

/*
 * 숫자 뒤집기 ex) 1230 . res = 뒤집힌 결과 저장
 * 1) while문 시작. tmp = 1230, res = 0
 *   2) t   = tmp % 10 = 1230 % 10 = 0 // 숫자를 10으로 나눈 나머지는 1의 자리 숫자를 의미 
 *   3) res = res * 10 + t = 0 * 10 + 0 = 0 // 결과를 한 자리 올린 뒤 1의 자리를 추가
 *   4) tmp = tmp / 10 = 1230 / 10 = 123 // 숫자를 10으로 나는 몫은 1의 자리를 제거한 값
 * 5) while문 시작. tmp = 123, res = 0
 *   6) t	  = 123 % 10 = 3
 *   7) res = 0 * 10 + 3 = (0)3
 *   8) tmp = 123 / 10 = 12
 * 9) while문 시작. tmp = 12, res = 3
 *   10) t  = 12 % 10 = 2
 *   11) res = 3 * 10 + 2 = (0)32
 *   12) tmp = 12 / 10 = 1
 * 13)while문 시작. tmp = 1, res = 32
 *   14) t  = 1 % 10 = 1
 *   15) res = 32 * 10 + 1 = (0)321
 *   16) tmp = 1 / 10 = 0
 * 17) tmp가 0이 넘었으므로 반복문 탈출
*/
class Main {	
	public ArrayList<Integer> solution(int n, int[] arr) { // 숫자 뒤집기
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0; 
			while(tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}

			if(isPrime(res)) { // 소수 판별
				answer.add(res);
			} 
		}
		return answer;
	}

	public boolean isPrime(int num) {
		if(num == 1) { // 1은 소수 아님
			return false; 
		}

		for(int i = 2; i < num; i++) {
			if(num % i == 0) { // 1과 본인이 아닌 숫자 중에 나머지가 0인 수가 있으면 소수가 아님
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}

		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}