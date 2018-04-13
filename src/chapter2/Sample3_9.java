package chapter2; //オーバーロード
class OLTest{
	void metTest(int a , int b) { //メソッドテスト
		System.out.println("metTest(int a,int b) =" + a + "&" + b);
	}
	void metTest(int a) {
		System.out.println("metTest(int a) =" + a);
	}
	void metTest(double a, double b) {
		System.out.println("metTest(double a) =" + a + "&"+ b);
	}
}
public class Sample3_9 {
	public static void main(String[] args) {
		OLTest ot = new OLTest(); // オーバーロードテストをインスタンス化

		ot.metTest(25,45); //
		ot.metTest(123);
		ot.metTest(2.5,4.5);
	}
}
/*
 * インスタンス化とは？
 */
