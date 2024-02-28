
public class Main {

	public static int add(int x, int y) {
	int ans = x + y;
	return ans;
	}
	public static void main(String[] args) {
		System.out.println(add(add(10, 20), add(30, 40))); 
		//中の２つのaddが計算されて、add(30, 70)になる。
		//つまりSystem.out.println(100);
	}
}	