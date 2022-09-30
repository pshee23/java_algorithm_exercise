import java.util.*;

class Main {	
	public int solution(int n, int[][] arr, int[] pos){
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		HashMap<Integer, Stack<Integer>> hashMap = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			Stack<Integer> tmpStack = new Stack<>();
			for(int j=n-1; j>=0; j--) {
				if(arr[j][i] != 0) {
					tmpStack.push(arr[j][i]);
				}
			}
			hashMap.put(i+1, tmpStack);
		}
		
		for(int p=0; p<pos.length; p++) {
			Stack<Integer> tmp = hashMap.get(pos[p]);
			if(tmp.size() != 0) {
				int poped = tmp.pop();
				if(stack.peek() == poped) {
					answer += 2;
					stack.pop();
				} else {
					stack.push(poped);
				}
			}
			
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 크레인 n * n
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		int m = kb.nextInt(); // 뽑을 위치
		int[] pos = new int[m];
		for(int i=0; i<m; i++) {
			pos[i] = kb.nextInt(); 
		}
		
		System.out.print(T.solution(n, arr, pos));
	}
}