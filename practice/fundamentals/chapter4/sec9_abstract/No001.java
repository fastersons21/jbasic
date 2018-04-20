package fundamentals.chapter4.sec9_abstract;
/*
 * 抽象クラスとして動物クラスを定義し、動物クラス内に鳴くというメソッド作成してください。
 * 作成した抽象クラスを使用して、鳴き声を出力するプログラムを作成してください。
 */
class No001 extends Animal {
	public static void main(String[] args) {
		System.out.println(bark);
	}

}



abstract class Animal {
	static String bark = "grrrrrrr";
	String getBark() {
		return bark;
	}
}
