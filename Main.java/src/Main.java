
public class Main {

	public static void methodA() {
		System.out.println("methodA");
		methodB();  //methodBメソッドの呼び出し
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {	//ここがmainメソッド
		methodA();  //methodAメソッドの呼び出し
	}
}