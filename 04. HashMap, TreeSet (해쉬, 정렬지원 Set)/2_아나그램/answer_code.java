import java.util.*;
class Main {	
	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map=new HashMap<>();

		for(char x : s1.toCharArray()){
			map.put(x, map.getOrDefault(x, 0)+1); // 첫번째 문자열을 hashmap화 해서 count 증가
		}

		for(char x : s2.toCharArray()){
			if(!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			} 
			map.put(x, map.get(x)-1); // 값이 있으면 count 감소
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String a=kb.next();
		String b=kb.next();
		System.out.print(T.solution(a, b));
	}
}