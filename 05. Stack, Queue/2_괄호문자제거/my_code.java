import java.util.*;

class Main {	
	public String solution(String str){
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			stack.push(x);
			if(x == ')') {
				while(true) {
					if(stack.peek() == '(') {
						stack.pop();
						break;
					}
					stack.pop();
				}
			}
		}
		
		for(int i=0; i<stack.size(); i++) {
			answer += stack.get(i);
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