import java.util.Scanner;

public class String_2_mine {
  public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String input1 = in.next();
	System.out.println(solution(input1));
	return ;
  }
  
  public static String solution(String input) {
    String lowerScoreStr = input.toLowerCase();
    String result = "";

    for(int i=0; i<input.length(); i++) {
        if(Character.toString(input.charAt(i)).equals(Character.toString(lowerScoreStr.charAt(i)))) {
            result += Character.toString(input.charAt(i)).toUpperCase();
        } else {
            result += Character.toString(lowerScoreStr.charAt(i));
        }
    }
	return result;
  }
}
