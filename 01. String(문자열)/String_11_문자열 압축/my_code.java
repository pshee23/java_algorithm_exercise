import java.util.Scanner;
  
public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s = in.next();
		solution(s);
		return ;
	}
  
	public static void solution(String s) {
		String result = "";
		int count = 1;
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i) == s.charAt(i-1)) {
				count++;
			} else {
				result += s.charAt(i-1);
				if(count != 1) {
					result += count;
				}
				count = 1;
			}
			if(i == s.length()-1) {
				result += s.charAt(i);
				if(count != 1) {
					result += count;
				}
			}
		}
		System.out.println(result);
	}
}