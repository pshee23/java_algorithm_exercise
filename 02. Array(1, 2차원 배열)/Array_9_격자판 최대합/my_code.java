import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t = in.nextInt();
		int[][] tt = new int[t][t];
		for(int i=0; i<t; i++) {
			for(int j=0; j<t; j++) {
				tt[i][j] = in.nextInt();
			}
		}
		solution(t, tt);
		return ;
	}
  
	public static void solution(int t, int[][] tt) {
		int[] arr = new int[t*2 + 2];
		int index = 0;
		for(int i=0; i<t; i++) {
			int tmp = 0;
			for(int j=0; j<t; j++) {
				tmp += tt[i][j];
			}
			arr[index] = tmp;
			index++;
		}
		
		for(int i=0; i<t; i++) {
			int tmp = 0;
			for(int j=0; j<t; j++) {
				tmp += tt[j][i];
			}
			arr[index] = tmp;
			index++;
		}
		
		int tmp = 0;
		for(int i=0; i<t; i++) {
			tmp += tt[i][i];
		}
		arr[index] = tmp;
		index++;
		
		int tmp1 = 0;
		for(int i=0; i<t; i++) {
			tmp1 += tt[t-i-1][i];
		}
		arr[index] = tmp1;
		
		int result = 0;
		for(int a : arr) {
			if(result == 0) {
				result = a;
				continue;
			}
			
			if(result < a) {
				result = a;
			}
		}
		System.out.println(result);
	}
}