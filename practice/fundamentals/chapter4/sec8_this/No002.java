package fundamentals.chapter4.sec8_this;
/*
 * Bookクラスの引数なしコンストラクタに、thisキーワードを使用して引数ありコンストラクタを呼び出す処理を記述してください。
 * また、その際引数として本の名前を任意で指定してください。
 */
public class No002 {
	public static void main(String[] args) {
		Book b = new Book();
	}
}

class Book {
	Book() {
		this("炎炎ノ消防隊");//thisをつかって引数ありコンストラクタを呼び出す
	}
	Book(String title) {//thisの引数を指定したのでString titleに代入されている
		System.out.println(title);
	}
}