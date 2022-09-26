import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t = in.nextInt();
		int[][] tt = new int[t+2][t+2];
		for(int i=0; i<t+2; i++) {
			for(int j=0; j<t+2	; j++) {
				if(i==0 || i == t+1 || j==0 || j == t+1) {
					tt[i][j] = 0;
					continue;
				}
				tt[i][j] = in.nextInt();
			}
		}
		solution(t+2, tt);
		return ;
	}
  
	public static void solution(int t, int[][] tt) {
		int result = 0;
		
		for(int i=1; i<t-1; i++) {
			for(int j=1; j<t-1; j++) {
				if(tt[i-1][j] >= tt[i][j]) {
					continue;
				}
				if(tt[i+1][j] >= tt[i][j]) {
					continue;
				}
				if(tt[i][j-1] >= tt[i][j]) {
					continue;
				}
				if(tt[i][j+1] >= tt[i][j]) {
					continue;
				}
				result++;
			}
		}
		
		System.out.println(result);
	}
}