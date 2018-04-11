package chapter2;

//クラスブロックSTART
public class Sample2_10 {
	int x = 2;//インスタンス変数（フィールド）
	static int a = 10; //static変数
	//メソッドブロックSTART
	void add() {
		int y = 5; //ローカル変数
		System.out.println(x+y);
	}
	//メソッドブロックEND

	//メソッドブロックSTART
	void scopeSample() {
		for(int i = 0; i < x; i++) {
			System.out.println(i);
			//System.out.println(y); 変数yはここでは使用できない。
		}
	}
	//メソッドブロックEND

}
//クラスブロックEND
