import java.util.*;

/*
 * 1. D(5)
 * 2. else return 5 * DFS(4);
 * 3.   else return 4 * DFS(3);
 * 4.       else return 3 * DFS(2);
 * 5.           else return 2 * DFS(1);
 * 6.               return 1;
 * 7.           -> else return 2 * 1;
 * 8.       -> return 3 * 2;
 * 9.   -> return 4 * 6;
 * 10. -> return 5 * 24;
 * 11.120
 */ 
class Main {
    public void DFS(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        System.out.println(T.DFS(5));
    }
}