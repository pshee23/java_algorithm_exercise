import java.util.Scanner;

// 전체 문자열 길이의 절반까지만 검사하면 된다. 
// 짝수, 홀수 동일. 홀수 중간은 검사 안해도 되기 때문
public class Main {

    // 방법1
    public String solution(String str) {
        String answer = "YES";
        
        str = str.toUpperCase();

        int len = str.length(); // 문자열 길이

         for(int i=0; i<len/2; i++) { // 전체 길이의 절반만 검사
            if(str.charAt(i) != str.charAt(len - i - 1)) {
                answer = "NO";
                break;
            }
         }
        return answer;
    }

    // 방법2 
    // StringBuilder로 문자열을 뒤집은 후
    // 대소문자 구분 없이 비교하는 equalsIgnoreCase 사용
    public String solution2(String str) {
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(tmp)) {
            return "YES";
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