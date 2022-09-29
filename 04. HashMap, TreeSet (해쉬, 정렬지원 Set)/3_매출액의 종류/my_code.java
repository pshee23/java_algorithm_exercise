import java.util.*;

/*
 * [Time Limit Exceeded]
 * result 작성을 String이 아니라 ArrayList add를 이용해서 출력하니까 Time Limit 발생하지 않음...
 * 왜...?
 */
// 오류 수정한거
class Main {	
	public ArrayList<Integer> solution(int a, int b, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i=0; i<b; i++) {
			hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
		}
		answer.add(hashMap.size());

		for(int i=b; i<a; i++) {
			if(hashMap.get(arr[i-b]) == 1) {
				hashMap.remove(arr[i-b]);
			} else {
				hashMap.put(arr[i-b], hashMap.get(arr[i-b])-1);
			}
			hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
			
			answer.add(hashMap.size());
		}
		
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int[] arr = new int[a];
		for(int i=0; i<a; i++) {
			arr[i] = kb.nextInt(); 
		}
		
		for(int answer : T.solution(a, b, arr)) {
			System.out.print(answer + " ");
		}
	}
}


/* 오류난거
class Main {	
	public String solution(int a, int b, int[] arr){
		String result = "";
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i=0; i<b; i++) {
			hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
		}
		result += hashMap.size() + " ";

		for(int i=b; i<a; i++) {
			if(hashMap.get(arr[i-b]) == 1) {
				hashMap.remove(arr[i-b]);
			} else {
				hashMap.put(arr[i-b], hashMap.get(arr[i-b])-1);
			}
			hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
			
			result += hashMap.size() + " ";
		}
		
		return result;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int[] arr = new int[a];
		for(int i=0; i<a; i++) {
			arr[i] = kb.nextInt(); 
		}
		System.out.print(T.solution(a, b, arr));
	}
}
*/