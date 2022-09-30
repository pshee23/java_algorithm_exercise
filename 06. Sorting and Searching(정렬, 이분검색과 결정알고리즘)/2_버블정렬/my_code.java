import java.util.*;

class Main {	
	public String solution(int n, int[] arr){
		String result = "";
		for(int end=n-1; end>0; end--) {
			for(int i=0; i<end; i++) {
				if(arr[i] > arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
		for(int a : arr) {
			result += a + " ";
		}
		return result;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]= kb.nextInt(); 
		}
		System.out.print(T.solution(n, arr));
	}
}