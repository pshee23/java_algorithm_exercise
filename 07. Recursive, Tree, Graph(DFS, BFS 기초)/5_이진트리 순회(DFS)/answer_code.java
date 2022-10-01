import java.util.*;

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
    public void DFS(Node root) {
        if(root == null) { // 말단 노드
            return;
        } else {
            System.out.print(root.data + " "); // 전위 순회
            DFS(root.lt); // 왼쪽 노드로
            System.out.print(root.data + " "); // 중위 순회
            DFS(root.rt); // 오른쪽 노드로
            System.out.print(root.data + " "); // 후위 순회
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
        tree.DFS(tree.root);
    }
}