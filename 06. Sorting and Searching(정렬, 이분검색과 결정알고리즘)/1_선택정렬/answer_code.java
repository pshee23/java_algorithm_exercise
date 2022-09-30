import java.util.*;

/*
 * 1. i = 0, j = 1 에서 시작. 끝까지 가면서 최소 값이 있는 위치의 index를 저장.
 * 2. 현재 위치와 해당 위치를 교환
 * 3. i = 1, j = 2으로 이동해서 계속 반복
 */
class Main {	
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) {
			int idx = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[idx]) {
                    idx = j;
                }
			}
			int tmp = arr[i]; 
			arr[i] = arr[idx]; // 가장 작은 값과 현재 위치와 교환
			arr[idx] = tmp;
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