import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t = in.nextInt();
		Integer[] a = new Integer[t];
		for(int i=0;i<t;i++) {
			a[i] = Integer.parseInt(in.next());
		}
		Integer[] b = new Integer[t];
		for(int i=0;i<t;i++) {
			b[i] = Integer.parseInt(in.next());
		}
		solution(t, a, b);
		return ;
	}
  
	public static void solution(int t, Integer[] a, Integer[] b) {
		for(int i=0; i < t; i++) {
			if(a[i] == b[i]) {
				System.out.println("D");
				continue;
			}
			
			if((a[i]==1 && b[i]==3) || (a[i]==2) && (b[i]==1) || (a[i]==3 && b[i]==2)) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		}
	}
}