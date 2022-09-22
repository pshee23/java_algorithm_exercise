import java.util.Scanner;

public class String_6 {
	// time : 20:03 ~ 20:07
	// try : success
	// example : ksekkset

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String input1 = in.next();
		
		System.out.println(solution(input1));
		return ;
	}
  
	public static String solution(String input1) {
		String result = new String();
		
		for(char ch : input1.toCharArray()) {
			if(!result.contains(String.valueOf(ch))) {
				result += ch;
			}
		}
		
		return result;
	}
}
