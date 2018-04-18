package fundamentals.chapter4.sec4_constractor;
/*
 * No001クラスとは別に下記のような車クラスを作成してください。
 *
 * <フィールド>
 * ・ガソリン
 *
 * <メソッド>
 * ガソリンを使用して走る機能
 * 現在の残ガソリンを確認する機能
 * 給油する機能
 *
 * <コンストラクタ>
 * ・ガソリンの初期値を指定する
 */

class Car {//機能を付けるクラス
	int gas;//ガソリン
	Car(){
		gas = 60;
	}
	void run(int gas) {
		this.gas -= gas;
		System.out.println(gas * 10 + "キロ走行できた機能");
		System.out.println(this.gas -= );
	}

}

public class No001 {//動かす為だけのクラス
	public static void main(String[] args) {
		Car run = new Car();
		car.run(10);


	}

}
