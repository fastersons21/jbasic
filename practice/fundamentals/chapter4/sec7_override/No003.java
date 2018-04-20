package fundamentals.chapter4.sec7_override;

/*
 * ユーザクラスを継承した一般ユーザクラスと管理者クラスを作成し、showメソッドをオーバーライドしてください。
 * また、オーバーライドしたshowメソッド内でidとnameに任意の値を代入するように修正してください。
 * 最後に、mainメソッド内でそれぞれのクラスをインスタンス化し、showメソッドを実行するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		PubUser user = new PubUser();
		ManagerN user1 = new ManagerN();
		user.show();
		user1.show();

	}
}

class User {//スーパークラス
	String name;
	int id;
	void show() {
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);//サブクラスでオーバーライドするとメソッド内は初期化されるのでこの中は意味がない
	}
}

class PubUser extends User {//サブクラス
	void show() {
		name = "player1";
		id = 1;
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}
class ManagerN extends User {//サブクラス
	void show() {//Managerですでに定義されていますとなったので、パーッケージを超えているということ？
		name = "nintendo";
		id = 99;
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}