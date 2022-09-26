import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t = in.nextInt();
		Integer[] s = new Integer[t];
		for(int i=0;i<t;i++) {
			s[i] = Integer.parseInt(in.next());
		}
		System.out.println(solution(t, s));
		return ;
	}
  
	public static int solution(int t, Integer[] s) {
		int result = 1;
		int front = s[0];
		for(int i=1; i<t; i++) {
			if(front < s[i]) {
				result++;
				front = s[i];
			}
		}
		return result;
	}
}