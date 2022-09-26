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
		int result = 0;
		
		int count = 0;
		for(int i=0; i<t; i++) {
			if(tt[i] == 1) {
				result++;
				if(i == 0) {
					continue;
				}
				
				if(tt[i-1]== 1) {
					count++;
					result += count;
				} else {
					count = 0;
				}
			} else {
				count = 0;
			}
		}
		
		System.out.println(result);
	}

}