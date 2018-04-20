package fundamentals.chapter4.sec6_extends;
/*
 * 好きなスーパークラスと、そのスーパークラスを継承したサブクラスを作成してください。
 * また、それぞれに好きなフィールドとメソッドを追加してください。
 * 最後にNo004クラスのmainメソッドでサブクラスをインスタンス化して処理を実行するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		IDs a = new IDs();
		a.name();
	}
}

class Human {//super
	String name;
	public void name() {
		this.name= "nick";
		System.out.println(this.name);
	}
}

class IDs extends Human {//sub
	int men;//コンストラクタはクラス名.メソッド名で呼び出す事はできない、インスタンス化したときに実行されるだけだから
	IDs () {
		men = 1;
		System.out.println(men);
	}
}