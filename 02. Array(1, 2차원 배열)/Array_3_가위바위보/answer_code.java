import java.util.*;
class Main {
	/* 1. 한명을 기준으로 승리하는 case 정리
	*
	*/
	public String solution(int n, int[] a, int[] b){
		String answer="";
		for(int i=0; i<n; i++){
			if(a[i] == b[i]) { // 비기는 경우
				answer += "D";
			} else if(a[i]==1 && b[i]==3) { // A가 이기는 case
				answer+="A";
			} else if(a[i]==2 && b[i]==1) { // A가 이기는 case
				answer+="A";
			} else if(a[i]==3 && b[i]==2) { // A가 이기는 case
				answer+="A";
			} else { // 나머지는 B가 이기는 case
				answer+="B";
			}
		}
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		for(int i=0; i<n; i++){
			b[i]=kb.nextInt();
		}
		for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
	}
}