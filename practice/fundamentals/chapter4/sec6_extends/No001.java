package fundamentals.chapter4.sec6_extends;
/*
 * No001クラスにBookクラスを継承してください。
 * また、No001クラス内でsetTitleメソッドを使用して本のタイトルを設定後、
 * getTitleメソッドを使用して設定した本のタイトルを出力するプログラムを作成してください。
 */
public class No001 extends Book {//extendsで継承の宣言、サブクラス
	public static void main(String[] args) {
		Book aim = new Book();
		aim.setTitle("羅生門");
		System.out.println(aim.getTitle());
	}

}

class Book {//スーパークラス
	String title;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
