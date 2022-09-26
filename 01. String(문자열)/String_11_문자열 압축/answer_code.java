import java.util.*;
class Main {
	/* 1. cnt = 1로 시작해서 i와 i+1이 같은 문자이면 증가
	*  2. 다른 문자이면 i위치의 문자를 정답 문자에 추가하고 cnt도 추가한다. cnt는 1로 초기화
	*  3. 대신 다른 문자일 떄 cnt이 1이면 숫자 입력은 pass
	*  4. 맨 마지막 문자는 비교 할 대상이 없으므로 초기에 빈 문자를 추가해서 비교 대상 추가.
	*  5. 빈 문자가 추가된 맨 마지막 문자는 비교 대상이 아니므로 길이-1까지만 검색
	*/
	public String solution(String s){
		String answer = "";
		s = s + " ";
		int cnt=1;
		for(int i=0; i<s.length()-1; i++){
			if(s.charAt(i) == s.charAt(i+1)) {
				cnt++;
			} else {
				answer+=s.charAt(i);
				if(cnt>1) {
					answer += String.valueOf(cnt);
				}
				cnt = 1;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}