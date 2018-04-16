package fundamentals.chapter4.sec2_class;
/*
 * No001とは別にクラスを定義してNo001クラスのmainメソッド内で定義したクラスをインスタンス化してください。
 * ※クラス名などは任意とする
 */

class A {
	String abc ="インスタンス化が";
	void xyz() {
		System.out.println("あんまりよくわかりません順番がよくわからない");
	}
}

public class No001 {
	public static void main(String[] args) {
		A a1 = new A();

		System.out.println(a1.abc);
		a1.xyz();
	}
}