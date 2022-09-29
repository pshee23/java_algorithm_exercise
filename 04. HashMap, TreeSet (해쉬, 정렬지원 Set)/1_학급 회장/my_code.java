import java.util.*;

class Main {	
	public String solution(int n, String a){
		HashMap<String, Integer> hash = new HashMap<>();
		for(char ch : a.toCharArray()) {
			hash.put(String.valueOf(ch), hash.getOrDefault(String.valueOf(ch), 0)+1);
		}
		
		return Collections.max(hash.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		String a = kb.next();
		System.out.print(T.solution(n, a));
	}
}