import java.util.*;

/*
 * [Stack] 어떤 방식을 써야 하는지 몰라서 못 풀었음
 */
class Main {	
	public String solution(String str){
		String answer = "";
		Stack<Character> stack = new Stack<>();

		for(char x : str.toCharArray()){
			if(x == ')') {
				// stack.pop() : 꺼내기도 하지만 꺼낸것을 return 받음
				while(stack.pop() != '('); // '('를 꺼내고 while 종료
			} else {
				stack.push(x); // 알파벳 or '('
			}
		}

		for(int i=0; i<stack.size(); i++){
			answer += stack.get(i);
		}

		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}