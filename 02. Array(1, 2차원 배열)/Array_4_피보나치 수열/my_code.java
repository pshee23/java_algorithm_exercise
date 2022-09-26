import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t = in.nextInt();
		solution(t);
		return ;
	}
  
	public static void solution(int t) {
		String result = "";

		Integer[] arr = new Integer[t+2];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<t+1; i++) {
			int tmp = arr[i-2] + arr[i-1];
			arr[i] = tmp;
		}
		
		for(int i=1;i<arr.length-1; i++) {
			result += arr[i] + " ";
		}
		System.out.println(result);
	}
}