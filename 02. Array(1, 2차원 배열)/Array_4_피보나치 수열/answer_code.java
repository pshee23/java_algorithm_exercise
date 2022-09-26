import java.util.*;
class Main {	
	/* 1. 맨 앞 1 1 은 항상 고정이므로 배열에 바로 추가.
	*  2. 앞에 두 개의 값을 더해서 현재 위치에 저장.
	*/
	public int[] solution(int n){
		int[] answer=new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i=2; i<n; i++){
			answer[i] = answer[i-2] + answer[i-1];
		}
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		for(int x :T.solution(n)) System.out.print(x+" ");
	}
}


/* 
*  배열을 쓰지않고 바로 출력할 때.
*/
class Main {	
	public void solution(int n){
		int a = 1;
		int b = 1;
		int c;
		System.out.print( a + " " + b + " ");

		for(int i=2; i<n; i++){
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		T.solution(n);
	}
}