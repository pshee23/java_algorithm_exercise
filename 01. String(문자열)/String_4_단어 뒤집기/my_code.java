import java.util.Scanner;

public class String_4_mine {
	// time : 19:04 ~ 19:35
	// try : success
	// TODO : String[] 제대로된 초기화. Scanner nextInt 한 후 nextLine 할 떄 주의점(https://seeminglyjs.tistory.com/256)
	// Scanner 입력 값 처리하는게 어렵..
	// example : 
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int input1 = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i<input1;i++) {
			String str = in.nextLine();
			solution(str);
		}
		
		return ;
	}
  
	public static String solution(String str) {
		String result = new String();
		
		for(int i = str.length()-1; i >= 0; i--) {
			result += str.charAt(i);
		}
		
		System.out.println(result);
		return result;
	}
}
