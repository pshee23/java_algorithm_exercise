import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t = in.nextInt();
		int[] tt = new int[t];
		for(int i=0; i<t; i++) {
			tt[i] = in.nextInt();
		}
		solution(t, tt);
		return ;
	}
  
	public static void solution(int t, int[] tt) {
		String answer = "";
		
		for(int i=0; i<t; i++) {
			int count = 1;
			for(int j=0; j<t; j++) {
				if(tt[i] < tt[j]) {
					count++;
				}
			}
			answer += count + " ";
		}
		System.out.println(answer);
	}
}