import java.util.*;
  
public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t = in.nextInt();
		String[] s = new String[t];
		for(int i=0;i<t;i++) {
			s[i] = in.next();
		}
		System.out.println(solution(t, s));
		return ;
	}
  
	public static String solution(int t, String[] s) {
		String result = "";
		result += s[0] + " ";
		for(int i=1; i<t; i++) {
			if(Integer.parseInt(s[i]) > Integer.parseInt(s[i-1])) {
				result += s[i] + " ";
			}
		}
		return result;
	}
}