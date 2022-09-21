import java.util.Scanner;

public class String_1_mine {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
    	String str = in.next();
    	char ch = in.next().charAt(0);
    	System.out.println(solution(str, ch));
    	return ;
	}
	
  public static int solution(String str, char ch){
	  str = str.toLowerCase();
	  ch = Character.toLowerCase(ch);
	  
	  int answer = 0;
	  
	  for(int i = 0; i < str.length(); i++) {
		  if(str.charAt(i) == ch) {
			  answer++;
		  }
	  }
	  
	return answer;
  }
}
