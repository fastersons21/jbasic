package fundamentals.chapter0;
/*
 * 電話の抽象クラスを作成し、それを継承したiPhoneクラスとAndroidクラスを作成してください。
 * 電話の抽象クラス内で1つ以上のabstractメソッドを定義し、iPhone、Android側でオーバーライドしてください。
 * また、iPhone、Androidクラスでそれぞれ1つ以上オーバーライドしたメソッドを定義してください。
 * 最後にmainメソッドでそれぞれに定義したメソッドを使用して画面に出力するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {

	}

}

abstract class Phone {
	abstract void phone(String str);

}

public class Iphone extends Phone {

	@Override
	void phone(String str) {
		// TODO 自動生成されたメソッド・スタブ
		str = "ipod";
		System.out.println(str);
	}

}

public class Android extends Phone{

	@Override
	void phone(String str) {
		// TODO 自動生成されたメソッド・スタブ
		str = "Xperia";
		System.out.println(str);
	}

}