import java.util.Scanner;

public class String_3_mine {
	// 18:46 ~ 19:00
	// fail success
	// TODO String 초기 선언과 값 삽입에 대해서 다시 알아오기
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
	    String input1 = in.nextLine();
	   
	    System.out.println(solution(input1));
	    return ;
	}
	
	public static String solution(String str) {
		String result = new String();
		int count = 0;
		for(String s : str.split(" ")) {
			if(count == 0 || count < s.length()) {
				count = s.length();
				result = s;
			}
		}
		return result;
	}
}
