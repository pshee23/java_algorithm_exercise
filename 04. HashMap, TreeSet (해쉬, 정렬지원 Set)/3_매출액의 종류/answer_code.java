import java.util.*;

/*
 * [HashMap, Sliding Window]
 * 1. lt=0, rt=n-1. 
 * 2. for문 시작하면서 rt++하고 hashmap에 저장. 
 * 3. 현재 map의 size answer에 저장
 * 4. "그 다음" lt 값을 빼준다. 또한 0이 되면 map에서 제거
 * 5. 위의 반복문 반복
 * 내가 한것과 비슷하지만 값을 빼고 더하는 순서의 차이가 있다.
 */
class Main {	
	public ArrayList<Integer> solution(int n, int k, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();

		for(int i=0; i<k-1; i++){ // k의 전 까지만 map에 저장. 나머지는 for문에서 처리
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}

		int lt=0;
		for(int rt=k-1; rt<n; rt++){
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1);
            if(HM.get(arr[lt]) == 0) {
				HM.remove(arr[lt]);
			}
			lt++;
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
	}
}