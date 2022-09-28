import java.util.*;

public class Main {
	public static String solution(int[] arr1, int[] arr2) {
		String answer = "";

		int[] newArr = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, newArr, 0, arr1.length);
		System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
		
		Arrays.sort(newArr);
		
		for(int a : newArr) {
			answer += a + " ";
		}
		return answer;
	}

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);

		int input1 = in.nextInt();

		int[] arr1 = new int[input1];
		for(int i=0; i<input1; i++) {
			arr1[i]= in.nextInt();
		}

		int input2 = in.nextInt();
		int[] arr2 = new int[input2];
		for(int i=0; i<input2; i++) {
			arr2[i]= in.nextInt();
		}
		
		System.out.println(solution(arr1, arr2));
		return ;
	}
  
}