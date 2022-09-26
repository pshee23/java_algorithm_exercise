import java.util.*;
class Main {	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]); // 첫번째 값은 바로 추가
		for(int i=1; i<n; i++){
			if(arr[i] > arr[i-1]) { // 앞에 값보다 현재 값이 크면 array에 추가
				answer.add(arr[i]);
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)){
			System.out.print(x+" ");
		}
	}
}


