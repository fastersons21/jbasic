package fundamentals.chapter4.sec5_overload;
/*
 * 同一の名前を持つメソッドを定義し、それぞれ任意の処理をするプログラムを作成してください。
 */

class OLTes {
	void metTest(int a) {
		System.out.println(a);
	}
	void metTest(int a, int b) {
		System.out.println(a + b);
	}
}
public class No002 {
	public static void main(String[] args) {
		OLTes ol = new OLTes();

		ol.metTest(1);
		ol.metTest(1,2);
	}
}
