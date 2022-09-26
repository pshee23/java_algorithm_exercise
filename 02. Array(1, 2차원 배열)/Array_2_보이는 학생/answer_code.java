import java.util.*;
class Main {
	/* 1. MAX의 값을 생성.
	*  2. 앞의 학생보다 키가 큰 값이 나오면 MAX에 저장하고 정답 값 count 증가.
	*  2. MAX보다 낮은 키가 나오면 PASS. 
	*/
	public int solution(int n, int[] arr){
		int answer = 1;
		int max = arr[0]; // 첫 번째 사람이 비교의 첫 기준이 되므로.

		for(int i=1; i<n; i++){
			if(arr[i] > max){
				max = arr[i];
				answer++;
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
		System.out.print(T.solution(n, arr));
	}
}