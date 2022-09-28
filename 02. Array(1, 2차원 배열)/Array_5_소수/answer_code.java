import java.util.*;

/*
 * 에라토스테네스 체 방법으로 풀이한다. 
 * 이중 for문 돌리면 time over됨
 * 1. 시작 배열은 모두 0의 값을 가짐
 * 2. 해당 index의 값이 0이면 cnt 증가, 그 이후 index 숫자로 for문을 돌면서 n의 배수를 1로 만든다.
 * 3. 다음 index로 넘어가면서 값이 0이면 cnt 증가, index n의 배수
 * 4. index의 값이 1이면 소수가 아니므로 패스
*/
class Main {	
	public int solution(int n){
		int cnt=0;
		int[] ch = new int[n+1]; // index number가 +1 해야 원하는 n번의 index를 가질 수 있음
		for(int i=2; i<=n; i++){
			if(ch[i] == 0){ // 0 이면 소수
				cnt++;
				for(int j=i; j<=n; j=j+i) {
					ch[j] = 1; // i의 배수를 1로 만든다
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		System.out.println(T.solution(n));
	}
}