import java.util.*;
  
public class Main {

    // StringBuilder 이용해서 문자열 뒤집기
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        // 문자열을 뒤집어서 array에 add
        for(String x : str) {
            // x 단어로 StringBuilder 객체 생성
            // reverse() 문자열 뒤집기
            String tmp = new StringBuilder(x).reverse().toString(); 
            answer.add(tmp);
        }

        return answer;
    }

    // 직접 문자열 뒤집기
    public ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            char[] s = x.toCharArray(); // x 단어를 char 배열화

            int lt = 0;             // 문자열의 시작 index
            int rt = x.length - 1;  // 문자열의 끝 index

            while(lt < rt) {        // 양쪽의 index가 마주치기 전까지, 문자 교환
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(s); // char 배열을 String 화
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n]; // String 배열 n의 크기로 초기화

        for(int i=0; i<n; i++) {
            str[i] = in.next();
        }

        for(String x : solution(n, str)) {
            System.out.println(x);
        }
    }
}