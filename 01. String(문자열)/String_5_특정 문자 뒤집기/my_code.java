import java.util.Scanner;

public class String_5 {
	// time : 19:42 ~ 20:01
	// try : success
	// 중간에 값 저장하는것에서 저장 순서를 잘못 해버림
	// example : a#b!GE*T@S

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String input1 = in.next();
		System.out.println(solution(input1));
		return ;
	}
  
	public static String solution(String input1) {
		String result = new String();
		String tmp = new String();
		for(int i = input1.length()-1; i >= 0; i--) {
			if(Character.isAlphabetic(input1.charAt(i))) {
				tmp += input1.charAt(i);
			}
		}

		int j = 0;
		for(int i = 0; i < input1.length(); i++) {
			if(Character.isAlphabetic(input1.charAt(i))) {
				result += tmp.charAt(j);
				j++;
			} else {
				result += input1.charAt(i);
			}
		}
		
		return result;
	}
}

