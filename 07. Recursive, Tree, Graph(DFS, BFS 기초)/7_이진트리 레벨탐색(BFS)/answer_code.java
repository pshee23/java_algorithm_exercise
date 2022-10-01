import java.util.*;

/* 
 * 1. root에서 시작. root를 queue에 넣는다. [ 1 ]
 * 2. 1을 poll하고 1에 있던 2, 3을 queue에 삽입 1 <- [ 2, 3 ]
 * 2. 2를 poll하고 2에 있던 4, 5를 queue에 삽입 2 <- [ 3, 4, 5]
 * 3. 3를 poll하고 3에 있던 6, 7을 queue에 삽입 3 <- [ 4, 5, 6, 7]
 * 4. 나머지는 연결된 것이 없으므로 순서대로 queue에서 빼서 출력
 */
class Node {
    int data; // 값
    Node lt;  // 왼쪽 자식의 노드 주소
    Node rt;  // 오른쪽 자식의 노드 주소

    public Node(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}

public class Main {
    Node root;
    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root); // root 삽입

        int L = 0; // 레벨
        while(!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for(int i=0; i<len; i++) { // 해당 레벨의 원소 순회
                Node cur = Q.poll();
                System.out.print(cur.data + " ");

                if(cur.lt != null) { // null이면 말단 노드
                    Q.offer(cur.lt);
                }
                if(cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            L++; //레벨 증가
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}