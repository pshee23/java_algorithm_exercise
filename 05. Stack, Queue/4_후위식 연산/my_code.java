import java.util.*;

class Main {	
	public int solution(String n){
		Stack<Integer> stack = new Stack<>();
		for(char ch : n.toCharArray()) {
			if(!Character.isDigit(ch)) {
				int num2 = stack.pop();
				int num1 = stack.pop();
				switch (Character.toString(ch)) {
					case "+":
						stack.push(num1 + num2);
						break;
					case "-":
						stack.push(num1 - num2);
						break;
					case "*":
						stack.push(num1 * num2);
						break;
					case "/":
						stack.push(num1 / num2);
						break;
					default:
						break;
				}
			} else {
				stack.push(Integer.decode(Character.toString(ch)));
			}
		}

		return stack.get(0);
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String n = kb.next();
		System.out.print(T.solution(n));
	}
}