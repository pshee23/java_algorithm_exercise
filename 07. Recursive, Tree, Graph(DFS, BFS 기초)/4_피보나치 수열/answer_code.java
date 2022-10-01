import java.util.*;

/*
 * 그림으로 그려보자
 * 재귀보다는 for문이 효율이 좋다. 재귀는 스택 프레임을 계속 생성하므로
 */ 
/* 이대로 하면 모든 번호의 DFS번호를 다 거쳐야 하므로 무거워짐
class Main {
    public void DFS(int n) {
        if(n == 1) {
            return 1;
        } else if(n ==2) {
            return 1;
        } else {
            return DFS(n-2) + DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        int n = 5;
        for(int i=1; i<=n; i++) {
            System.out.print(T.DFS(i) + " ");
        }
    }
}
*/
/* 위 보다 더 효율적인
class Main {
    static int[] fibo; // DFS 결과값을 저장하기 위한 배열
    public void DFS(int n) {
        if(n == 1) {
            return fibo[n] = 1;
        } else if(n ==2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        int n = 45;
        fibo = new int[n+1];
        T.DFS(n);
        for(int i=1; i<=n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
*/
// 더 효율적인 방법 : [메모이제이션]
// 배열에 0보다 큰 값이 저장되어 있으면 저장된 값을 return하고 그 아래로 DFS 진행 X
class Main {
    static int[] fibo; 
    public void DFS(int n) {
        if(fibo[n] > 0) { // 배열에 값이 있는지 확인해서 그 아래의 DFS로 진행을 막음
            return fibo[n];
        }

        if(n == 1) {
            return fibo[n] = 1;
        } else if(n ==2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        int n = 45;
        fibo = new int[n+1];
        T.DFS(n);
        for(int i=1; i<=n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}