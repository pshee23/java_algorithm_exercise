import java.util.*;

/*
 * [결정알고리즘] 
 * 이분검색을 활용해서 푸는것. 원하는 답이 lt ~  rt 사이에 찾고자 하는 답이 있다는것을 확신할 때 사용.
 * 확실한 답이 아닌, 최대한 답에 가까운 값을 찾아내는것. 답을 좁혀나가는것.
 *
 *  최소 용량은 배열중에서 값이 가장 큰 9이다. lt = 9 / 최대 용량은 모든 곡이 다 담긴 45. rt = 45
 *  mid = (9 + 45) / 2 = 27 . DVD 한장의 용량이 27일때 3장 이내에 다 담길 수 있나?
 *  가능하므로 mid 이후 검색을 제외. rt = mid - 1 = 26
 *  mid = (9 + 26) / 2 = 17 -> 3장 가능. rt = mid - 1 = 16
 *  mid = (9 + 16) / 2 = 12 -> 5장이 나옴 불가능. lt = mid + 1 = 13
 *  mid = (13 + 16) / 2 = 18 ... lt <= rt 가 될때까지 검색
 */
class Main {
	public int count(int[] arr, int capacity) {
		int cnt = 1;
        int sum = 0;
		for(int x : arr) {
			if(sum+x > capacity) {
				cnt++;
				sum = x;
			} else {
                sum += x;
            }
		}
		return cnt;
	}

	public int solution(int n, int m, int[] arr){
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(count(arr, mid) <= m) {
				answer = mid;
				rt = mid - 1;
			} else {
                lt = mid + 1;
            }
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}