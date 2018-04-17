package chapter4;
class Trainer{
	String name; //コンストラクタの定義 インスタンス変数
	Trainer(){ // コンストラクタ
		name= "名無し";
	}
	Trainer(String n){// コンストラクタのオーバーロード
		name = n;
	}
}

public class Sample3_10 {
	public static void main(String[] args) { //mainメソッドが一番先に参照される
		//名無しオブジェクトをインスタンス化
		Trainer s1 = new Trainer();
		//田中さんオブジェクトをインスタンス化
		Trainer s2 = new Trainer("田中さん");
		//名前を表示
		System.out.println("名前:" + s1.name);
		System.out.println("名前:" + s2.name);
	}
}
	/*ネットで調べて分からないものがあったらとりあえず書いてみて
	 *ここをこうしたらいいのではないかと自分でいろいろやってみる
	 */
