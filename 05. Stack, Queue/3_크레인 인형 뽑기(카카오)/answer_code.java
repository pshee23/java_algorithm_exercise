import java.util.*;

class Main {	
	public int solution(int[][] board, int[] moves){
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int pos : moves) { // 열의 위치
			for(int i=0; i<board.length; i++) { // 행의 위치
				if(board[i][pos-1] != 0) { // 빈칸(0)이 아닌 값만
					int tmp = board[i][pos-1]; // 크레인이 집은 첫번째 값을 꺼내기
					board[i][pos-1] = 0; // 해당 위치를 빈칸(0)으로 만든다
					if(!stack.isEmpty() && tmp == stack.peek()) { // 인형 담을곳이 비어있지 않고, 담은 곳 위의 값과 같은 경우
						answer += 2; // 같은 인형 두개 count
						stack.pop(); // tmp를 넣지 않았으니 같았던 인형 하나 빼기
					} else {
						stack.push(tmp); // 바구니가 비어있거나, 바구니에 있는 값과 다른 경우
					}
					break; // 빈칸(0)이 아닌 하나의 값만 가져오고 탐색 종료 (크레인 1회)
				}
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++) {
				board[i][j] = kb.nextInt();
			}
		}

		int m = kb.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<m; i++) {
			moves[i] = kb.nextInt();
		}

		System.out.println(T.solution(board, moves));
	}
}