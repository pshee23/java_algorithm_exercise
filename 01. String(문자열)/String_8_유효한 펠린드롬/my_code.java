import java.util.Scanner;

public class String_8 {
	// time : 20:31 ~ 20:40
	// try : success
	// example : found7, time: study; Yduts; emit, 7Dnuof
	// TODO : 특수 문자 제거(https://developer-talk.tistory.com/663)
	// replaceAll을 써야 한다는것을 미리 알아버림..
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String input1 = in.nextLine();
		System.out.println(solution(input1));
		return ;
	}
  
	public static String solution(String input1) {
		String result = "NO";
		input1 = input1.toLowerCase();
		String replacedStr = input1.replaceAll("[^a-zA-Z]", "");
		
		for(int i = 0; i < replacedStr.length(); i++) {
			if(replacedStr.charAt(i) == replacedStr.charAt(replacedStr.length() -1 - i)) {
				result = "YES";
			} else {
				result = "NO";
				break;
			}
		}
		
		return result;
	}
}

