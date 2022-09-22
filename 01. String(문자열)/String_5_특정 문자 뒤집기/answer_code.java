import java.util.Scanner;
  
// 시작과 끝지점의 값을 서로 비교하면서
// 둘다 알파벳이면 swap
// 둘다 특수문자면 pass
// 둘이 다르면 특수문자인 경우는 한칸 이동, 아니면 그대로 대기, 둘 다 알파벳일때까지 이동
// lt < rt : lt가 rt보다 작을때만 반복문 실행. 중간에 만나는 지점임
public class Main {

    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while(lt < rt) {
            if(!Character.isAlphabetic(s[lt]) {
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
        return ;
    }
}