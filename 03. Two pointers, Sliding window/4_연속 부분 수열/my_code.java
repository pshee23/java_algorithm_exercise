import java.util.*;

/*
 * 시행 착오가 조금 있었지만 풀었음. 조금 오래 걸림
 */
class Main {	
	public int solution(int n, int k, int[] a){
		int answer = 0;

		int p1 = 0;
		int p2 = 1;
		
		int sum = a[p1] + a[p2];
		while(p2 < n) {
			if(sum > k) {
				sum -= a[p1];
				p1++;
			} else if(sum < k) {
				p2++;
				sum += a[p2];
			} else {
				answer++;
				sum -= a[p1];
				p1++;
				p2++;
				sum += a[p2];
			}
		}
		
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] a=new int[n+1];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, k, a));
	}
}