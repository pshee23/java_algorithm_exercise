import java.util.Scanner;

public class String_9 {
	// time : 
	// try : success
	// example : 
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str = in.next();
		System.out.println(solution(str));
		return ;
	}
  
	public static int solution(String str) {
		String answer = "";
		
		for(char s : str.toCharArray()) {
			if(!Character.isAlphabetic(s)) {
				answer += Character.toString(s);
			}
		}
		
		return Integer.valueOf(answer);
	}
}