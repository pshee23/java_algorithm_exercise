import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "NO";
        
        // replaceAll을 이용해 특수문자, 숫자 제거
        // ^ : not -> A-Z가 아닌 것을을 ""로 치환
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
     
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)) {
            answer = "YES";
        }
        
        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
        return ;
    }
}