package fundamentals.chapter4.sec1_method;
/*
 * double型を引数に取る割り算メソッド作成してください。
 * mainメソッドからそのメソッドを使っていくつかの割り算を実行させて結果を表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		Calcu(1000,100);
	}

	public static void Calcu(double x,double y) {
		System.out.println(x + "を"+ y +"で割ると" + x/y);
	}
}
