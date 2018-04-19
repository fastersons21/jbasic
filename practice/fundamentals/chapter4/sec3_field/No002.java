package fundamentals.chapter4.sec3_field;
/*
 * クラス内でint型のインスタンス変数、static変数、ローカル変数を定義し、
 * メソッド内でそれぞれ定義した変数の和を表示させるプログラムを作成してください。
 */
public class No002 {
	int a = 10;//インスタンス変数←クラスの中でメソッドの外に宣言した変数

	static int b = 20;//スタティック変数(クラス変数とも呼ばれる。）


	int method() {

		int i = 99;//ローカル変数 ←メソッドの中で宣言した変数
		return i;//データ型の整数しか入らない　void以外のメソッドを作った時はreturnしなくてはならない
	}
	public static void main(String[] args) {
		No002 num = new No002();//インスタンス化
		int i =99;
		System.out.println(num.a + b + i+ num.method());

		int z =num.method();//メソッドを呼び出して返り値ｚに格納している
		System.out.println(z);


	}


}
