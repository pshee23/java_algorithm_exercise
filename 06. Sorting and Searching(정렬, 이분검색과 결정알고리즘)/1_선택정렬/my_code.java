import java.util.*;

class Main {	
	public String solution(int n, int[] arr){
		String result = "";
		
		for(int i=0; i<n; i++) {
			int min = Integer.MAX_VALUE;
			int index = 0;
			for(int j=i; j<n; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			int tmp = arr[i];
			arr[i] = min;
			arr[index] = tmp;
		}
		
		for(int i=0; i<n; i++) {
			result += arr[i] + " "; 
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