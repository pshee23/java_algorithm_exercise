import java.util.*;

/*
 * 재귀함수 : 자기 자신을 다시 호출하는것
 * D(3) -> D(2) -> D(1) -> D(0) .....
 *
 * 재귀함수는 Stack Frame을 사용한다.
 * Stack 1번에 D(3)의 정보가 들어간다. 지역변수, 매개변수, 복귀 주소 정보가 들어있다.
 * 그 다음 Stack 2번에 D(2)의 정보가 들어가는데, 복귀 주소 정보가 D(3)이 들어있다.
 *
 * DFS(n-1)에 닿으면 그 아래에 있는것은 아직 하지 않고 해당 라인 정보를 저장하고 DFS(n-1)로 넘어간다.
 * 나중에 돌아오면 그때서야 해당 라인부터 작동한다.
 * D(3) - D(2) - D(1) 순으로 Stack 상태로 저장되므로 마지막에 return이 되는 순간 상단에 있던 D(1)부터 pop한다.
 * 그러므로 n==1부터 print 하게 되는 것이다. 
 */ 
class Main {
    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            System.out.print(n + " "); // 3 2 1
            DFS(n-1);
            System.out.print(n + " "); // 1 2 3
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(3);
    }
}