import java.util.*;

/*
 * [Stack] 어떤 방식을 써야 하는지 몰라서 못 풀었음
 */
class Main {	
	public String solution(String str){
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x == '(') {
				stack.push(x);
			} else {
				if(stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		if(!stack.isEmpty()) {
			return "NO";
		}
		
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}