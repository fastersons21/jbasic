package fundamentals.chapter4.sec4_constractor;
/*
 * No002とは別に人間クラス「Human」を作成し、mainメソッド内でインスタンス化してください。
 * インスタンス化の際に「あなたのIDは1です。」と表示されるようにコンストラクタを追加してください。
 * また、表示されるID番号はインスタンス化するたびに1ずつインクリメントされるようにしてください。
 */
//インクリメント　スタティック変数の使い方
class Human {// static変数はメソッドのそとにあってもそのまま変数を呼び出して使うことが出来る。他のクラスでは使えない？

	static int num = 1;//staticを付けるとまたこのクラスに戻ってきたときに初期化をしないので一回だけ初期化したいときに使う
	Human(){
		System.out.println(num++);//戻り値はつけない、戻すことはできない
	}
}

public class No003 {
	public static void main(String[] args) {
		Human Id = new Human();
		//System.out.println(Id.num());
		Human Id1 = new Human();
	}

}