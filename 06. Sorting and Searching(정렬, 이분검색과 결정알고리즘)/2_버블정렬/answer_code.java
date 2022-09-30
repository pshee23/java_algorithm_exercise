import java.util.*;

/*
 * 순서대로 이웃한 두 수를 비교해서 순서에 맞게 자리 교환. 
 * 그럼 가장 큰 숫자가 맨 뒤로 이동하게 된다.
 * 그 다음 맨 끝 위치 전까지 또 반복해서 자리 교환.
 */
class Main {	
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}	
		}
		return arr;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
}