import java.util.Scanner;

public class Main {

    // ASCII
    public int solution(String str) {
        int answer = 0;
        
        // '0' ~ '9'의 ASCII : 48 ~ 57
        for(char x : str.toCharArray()) {
            if(x >= 48 && x <= 57) { // 해당되는 값은 숫자
                answer = answer * 10 + (x - 48);
            }
        }
        // 0 = 0 x 10 + (48 - 48)
        // 1 = 0 x 10 + (49 - 48)
        // 12 = 1 x 10 + (50 - 48)
        // 120 = 12 x 10 + (48 - 48)
        // 1205 = 120 x 10 + (53 - 48)

        return answer;
    }

    // String
    public int solution2(String str) {
        String answer = ""0"";
        
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
        return ;
    }
}