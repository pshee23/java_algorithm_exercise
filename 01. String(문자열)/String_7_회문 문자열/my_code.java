import java.util.Scanner;

public class String_7 {
	// time : 20:08 ~ 20:17
	// try : success
	// example : gooG

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String input1 = in.next();
		System.out.println(solution(input1));
		return ;
	}
  
	public static String solution(String input1) {
		String result = "NO";
		input1 = input1.toLowerCase();
		for(int i = 0; i < input1.length(); i++) {
			if(input1.charAt(i) == input1.charAt(input1.length() -1 - i)) {
				result = "YES";
			} else {
				result = "NO";
				break;
			}
		}
		
		return result;
	}
}

