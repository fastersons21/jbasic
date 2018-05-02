package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * 次のBookをインスタンス化した際にコンストラクタでタイトルと価格を設定して3冊の本を作成してください。
 * ただし、今回はArrayListのaddメソッド内でコンストラクタを呼び出すようにしてください。
 * その後、3冊のタイトルと価格を出力するプログラムを作成してください。
 */
public class No008 {
	public static void main(String[] args) {
//		Book book1 = new Book("吾輩は猫である",700);
//		Book book2 = new Book("羅生門",750);
//		Book book3 = new Book("金持ち父さん、貧乏父さん",1200);

		ArrayList<Book> books = new ArrayList<Book>();

		books.add(new Book("吾輩は猫である",700));
		books.add(new Book("羅生門",750));
		books.add(new Book("金持ち父さん、貧乏父さん",1200));

		for(int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).getTitle() + books.get(i).getPrice() );
		}
	}

}

class Book {
	String title;    // タイトル
	int price;       // 価格

	// コンストラクタ
	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	// getter/setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}