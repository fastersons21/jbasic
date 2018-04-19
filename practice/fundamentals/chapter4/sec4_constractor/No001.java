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
	int gas;//ガソリン ←フィールドとはクラスの中のメソッドの外に記述してある変数のことで何個でも作ることが出来る。
	Car(){
		gas = 60;//コンストラクタ←フィールドを作ったのでそれをメインメソッドでインスタンス化して他のメソッドでも使えるように初期値を入れる為のもの。
	}
	void run(int gas) {
		this.gas -= gas;
		System.out.println(gas + "リットル消費して" + gas * 10 + "キロ走行できます。");//ガソリンを使用して走る機能
		System.out.println("残りのガソリンの量は" + this.gas +"リットルです。");//現在の残りガソリンを確認する機能
	}
	void putGas(int gas2) {
		this.gas += gas2;
		System.out.println("給油した結果" + this.gas + "リットルです。");//給油する機能
	}


}

public class No001 {//動かす為だけのクラス
	public static void main(String[] args) {
		Car run1 = new Car();
		run1.run(20);//走った時に使ったガソリンの量を入力);
		run1.putGas(10);//給油する量を入力
	}

}//メソッドは動詞が入る動きがはいる、フィールドは名詞が入る
//voidでreturnを使わないときは機能を設定したいだけの時ってこと？
