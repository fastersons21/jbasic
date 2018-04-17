 package fundamentals.chapter4.sec2_class;
/*
 * No004クラスとは別に以下内容で本クラスを作成してください
 * また、mainメソッドから本クラスのオブジェクトを1つ生成してそれぞれの本の情報を表示するプログラムを作成してください。
 *
 * <フィールド>
 * ・本のタイトル
 * ・著者
 * ・価格
 *
 * <メソッド>
 * ・本のタイトル取得
 * ・著者情報取得
 * ・価格取得
 *
 */

class Book {
	String title;
	String name;
	int price;

	public void getTitle(String x) {
		title= x;
	}
	public void getName(String y) {
		name = y;
	}
	public void setPrice(int i) {
	}
}
public class No004 {
	public static void main(String[] args) {
		Book n = new Book();

		n.getTitle("かくれんぼ");
		n.getName("山田");
		n.setPrice(1000);

		System.out.println(n.setPrice());

	}

}
