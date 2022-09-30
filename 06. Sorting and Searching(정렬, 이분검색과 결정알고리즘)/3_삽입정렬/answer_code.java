import java.util.*;

/* 
 * ex) 11 7 5 6 10 9
 * 1. i = 1에서 시작. tmp=7, j=0, arr[j] = 11, arr[j] > tmp이므로 위치 교환. [11 11] 5 6 10 9
 * 2. for문이 멈춘 j = -1 + 1 = 0 지점에다가 tmp 삽입. [7 11] 5 6 10 9
 * 3. 다음 i = 2에서 시작. j = 1, 0. tmp=5
 * 4. j=1, arr[1] = 11은 tmp보다 크므로 복사. 7 [11 11] 6 10 9
 * 5. j=0, arr[0] = 7은 tmp보다 크므로 복사. [7 7] 11 6 10 9
 * 6. j=-1. for문 종료. j=0위치에 tmp=5를 삽입. [5 7 11] 6 10 9
 * 7. 다음 i = 3에서 시작. j = 2, 1, 0. tmp=6 [5 7 11] 6 10 9
 * 8. j=2, arr[2] = 11는 tmp보다 크므로 복사. 5 7 [11 11] 10 9
 * 9. j=1, arr[1] = 7는 tmp보다 크므로 복사. 5 [7 7] 11 10 9
 * 10.j=0, arr[0] = 5은 tmp보다 작으므로 for문 종료. j=0+1위치에 tmp 복사. 5 [6] 7 11 10 9
 */
class Main {	
	public int[] solution(int n, int[] arr) {
		for(int i=1; i<n; i++) {
			int tmp = arr[i]; // 현재 위치 값 tmp
			int j;
			for(j=i-1; j>=0; j--){
				if(arr[j] > tmp) { // tmp 위치보다 이전에 있는 j가 tmp 보다 값이 크면
					arr[j+1] = arr[j]; // arr[j] 값을 뒤로 미뤄라
				} else {
					break;
				}
			}
			arr[j+1] = tmp; // j for문이 멈춘 지점의 다음 위치에다가 tmp를 삽입
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x+" ");
		}
	}
}