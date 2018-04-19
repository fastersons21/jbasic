package fundamentals.chapter4.sec4_constractor;
/*
 * インスタンス化した際に、「Hello」と表示するクラス「Hello」を作成し、
 * mainメソッド内でインスタンス化してください。
 */

class Greet {
	String hello() {
		String i = "Hello";
		return i;
	}

}

public class No002 {
	public static void main(String[] args) {
		Greet Sup = new Greet();
		System.out.println(Sup.hello());
	}
}