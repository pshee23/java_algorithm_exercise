import java.util.*;
  
public class Main {
  	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		solution(s, t);
		return ;
	}
  
	public static void solution(String s, String t) {
		String result = "";
		int firstTPos = s.indexOf(t);
		
		for(int i=0; i<s.length(); i++) {
			int nextTPos = s.indexOf(t, firstTPos+1);
			if(nextTPos == -1) {
				result += Math.abs(firstTPos-i) + " ";
				continue;
			}
			
			if(Math.abs(firstTPos - i) <= Math.abs(nextTPos - i)) {
				result += Math.abs(firstTPos-i) + " ";
			} else {
				result += Math.abs(nextTPos-i) + " ";
			}
			
			if(i == nextTPos) {
				firstTPos = i;
			}
		} 
		System.out.println(result);
	}
}