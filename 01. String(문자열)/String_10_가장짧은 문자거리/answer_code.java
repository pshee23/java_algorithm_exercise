import java.util.*;
class Main {
    /*
    * 0. 초기값을 높게 잡는다 p = 1000
    * 1. 왼쪽에서 오른쪽으로 증가하면서 마주치는 A와의 거리를 계산. A를 만나면 위치 리셋(0).
    * 2. 오른쪽에서 왼쪽으로 감소하면서 마주치는 A와의 거리를 계산. A를 만나면 위치 리셋(0).
    * 3. 2를 진행하면서 1의 배열의 위치에 있는 값과 비교하면서 더 작은 값을 배열에 저장.
    * 배열 1 : [1001, 0, 1, 2, 3, 0, 1, 2, 3, 4, 0]
    * 배열 2 : [  1 , 0, 3, 2, 1, 0, 4, 3, 2, 1, 0]
    * 결과   : [  1 , 0, 1, 2, 1, 0, 1, 2, 2, 1, 0]
    */
	public int[] solution(String s, char t){
		int[] answer=new int[s.length()];
		int p=1000;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==t){
				p=0;
				answer[i]=p;
			}
			else{
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int i=s.length()-1; i>=0; i--){
			if(s.charAt(i)==t) p=0;
			else{
				p++;
				answer[i]=Math.min(answer[i], p);
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		char c=kb.next().charAt(0);
		for(int x : T.solution(str, c)){
			System.out.print(x+" ");
		}
	}
}