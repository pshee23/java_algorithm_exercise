
import java.util.*;

/* 
 * 1번 학생, 1학년을 index로 가지도록 한다. [1][0], [2][0] -> 학생 번호
 * [n+1] : n학생 + 1(학생 index 저장 공간)
 * [6] : 1 ~ 5학년 + 1(학년 index 저장 공간)
 * [학생][학년]
 */
class Main {	
	public int solution(int n, int[][] arr){
		int answer = 0;
		int max = 0;
		
		for(int i=1; i<=n; i++){ // 1 ~ n : i학생
			int cnt = 0; // 자기자신도 count 하므로 0에서 시작
			for(int j=1; j<=n; j++) { // 1 ~ n : j학생
				for(int k=1; k<=5; k++) { // 1 ~ 5 : k 학년
					System.out.println(k + "학년 " + i + "학생= " + arr[i][k] + "반/  " + j + "학생="+arr[j][k]+"반");
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						System.out.println(arr[i][k] + " / cnt=" + cnt);
						break; // A학생과 B학생이 한번 같은 반이였으면 다른 학년은 검사할 필요없음!
						// 한번이라도 같은 반이였으면 한번으로 count 한다. 문제를 자세히 읽도록
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i; // 학생 번호 return
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[][] arr=new int[n+1][6];
		for(int i=1; i<=n; i++){
			for(int j=1; j<=5; j++){
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}