package chapter2;
class FinTest{
	final int a = 15; //final指定のインスタンス変数です。
	static final int b =25; //final指定のstatic変数です
	static int c= 35; //static変数です（変更可能）
	int d = 45; //インスタンス変数です
	int e; //インスタンス変数です（デフォルト値で初期化）

	void method() {
		int f;  //ローカル変数（初期化されてません）
		System.out.println("a" + a);
		System.out.println("b" + b);
		System.out.println("c" + c);
		System.out.println("d" + d);
		System.out.println("e" + e);
        //System.out.println("f" + f);
	}
}

public class Sample3_6 {
	public static void main(String[] args) {
			// FinTest.b = 50;  //bはfinalなので変更不可です。
		FinTest.c = 50; //cは変更可能

		FinTest f = new FinTest();
		f.method();

	}
}
