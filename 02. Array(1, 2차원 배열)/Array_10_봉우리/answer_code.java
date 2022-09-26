import java.util.*;
class Main {
	 // 위치값. dx, dy를 함께 사용하며, 순서대로 12시, 3시, 6시, 9시 방향이다.
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};

	public int solution(int n, int[][] arr){
		int answer=0; // 봉오리 개수

		for(int i=0; i<n; i++){ // 행
			for(int j=0; j<n; j++){ // 열
				boolean flag = true;

				for(int k=0; k<4; k++){ // 상하좌우 탐색
					int nx = i + dx[k]; // 행좌표
					int ny = j + dy[k]; // 열좌표
					// arr[nx][ny] >= arr[i][j] : 내 위치[i][j] 보다 큰 값이 있으면 봉우리아님
					// 0으로 채워진 경계선 처리가 필요함. 바깥쪽 못보게
					// nx, ny는 0보다 커야하며, n보다 작아야하며
					// 경계선 처리 조건은 상하좌우 비교 구문보다 앞에서 미리 걸러내야함. 
					if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}

				if(flag) {
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}