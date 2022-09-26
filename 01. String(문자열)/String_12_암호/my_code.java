import java.util.*;
  
public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t = in.nextInt();
		String s = in.next();
		System.out.println(solution(t, s));
		return ;
	}
  
	public static String solution(int t, String s) {
		String result = "";
		
		s = s.replaceAll("#", "1");
		s = s.replaceAll("[*]", "0");
		
		List<String> strArr = new ArrayList<>();
		int i = 0;
		for(int j=0; j<t; j++) {
			int next = i+7;
			strArr.add(s.substring(i, next));
			i = next;
		}
		
		for(String str : strArr) {
			result += (char)Integer.parseInt(str, 2);
		}
		return result;
	}
}