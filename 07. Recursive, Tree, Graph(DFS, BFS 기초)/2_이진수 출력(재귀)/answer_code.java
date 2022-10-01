import java.util.*;

/*
 * 10 진수를 2진수로 : 2로 나눠서 나머지를 마지막 결과부터 출력
 */ 
class Main {
    public void DFS(int n) {
        if(n == 0) {
            return ;
        } else {
            System.out.print(n + " "); // 11 5 2 1
            System.out.print(n%2 + " "); // 1 1 0 1
            DFS(n/2);
            System.out.print(n%2 + " "); // 1 0 1 1
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(11);
    }
}