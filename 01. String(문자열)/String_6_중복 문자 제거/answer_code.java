import java.util.Scanner;

// indexOf로 하나씩 index와 indexOf로 검색한 값을 출력하다보면
// 중복 문자가 있을 경우 index는 현재 위치값을 리턴하지만
// indexOf로 검색한 값은 처음 발견된 문자의 위치를 리턴한다.
public class Main {

    public String solution(String str) {
        String answer = "";
        
        for(int i=0; i<str.length; i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
        return ;
    }
}