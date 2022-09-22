import java.util.*;

class Main {
    // solution1 : split() 사용
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE; // 최대값 갱신용 변수. 가장 작은 값으로 초기화됨

        String[] s = str.split(" "); // 공백을 기준으로 분리

        for(String x : s) {
            int len = x.length(); // 단어의 길이
            if(len > m) { // 참이면 현재 단어가 저장된 값 보다 더 크다.
                m = len; // 저장 공간에 현재 단어의 길이 저장
                answer = x; // 현재 단어를 정답값에 저장
            }
        }
    }


    // solution2 : indexOf(), subString 사용
        public String solution2(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE; // 최대값 갱신용 변수. 가장 작은 값으로 초기화됨
        int pos; // 띄어쓰기의 위치 리턴

        while((pos = str.indexOf(' ')) != -1) { // 띄어쓰기를 발견하면 위치 return. 발견 못하면 -1.
            String tmp = str.subString(0, pos); // 띄어쓰기 발견한 pos 까지 문자열 자르기.
            int len = tmp.length();
            if(len > m) { // 같은 길이 단어 갱신 안하도록 같은 길이는 pass
                m = len;
                answer = tmp;
            }
            str = str.subString(pos+1); // 앞에 분석한 단어를 제외하고 기준 문자열 갱신
        }

        // 마지막 단어는 남아있는 공백이 없으므로, while문을 pass하게 된다. 
        if(str.length() > m) { // while pass 하게 된 마지막 단어 검증하는 로직
            answer = tmp;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}