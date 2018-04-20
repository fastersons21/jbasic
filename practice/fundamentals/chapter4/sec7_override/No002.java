package fundamentals.chapter4.sec7_override;

/*
 * Bookクラスを継承した漫画クラス、小説クラス、雑誌クラスを作成してください。
 * showPriceメソッドをオーバーライドして、それぞれ以下の価格で表示されるようにメソッド内の処理を書き換えてください。
 * 最後に、mainメソッド内でそれぞれの価格を表示させてください。
 *
 * <価格設定>
 * 漫画：Bookの価格 - 200
 * 小説：Bookの価格 - 100
 * 雑誌：Bookの価格 + 100
 */
public class No002 {//書き換えて出力
	public static void main(String[] args) {
		Comic getPrice1 = new Comic();
		Novel getPrice2 = new Novel();
		Magazine getPrice3 = new Magazine();
		System.out.println(getPrice1.showPrice() + "円");
		System.out.println(getPrice2.showPrice() + "円");
		System.out.println(getPrice3.showPrice() + "円");
	}
}

class Book {//super
	int price = 500;  // 価格
	int showPrice() {
		//System.out.println(price + "円");
		return price;
	}
}

class Comic extends Book {//sub
	int price1 = 200;
	int showPrice() {
		price -= price1;
		return price;
	}
}
class Novel extends Book {//sub
	int price2 = 100;
	int showPrice() {
		price -= price2;
		return price;
	}
}

class Magazine extends Book {//sub
	int price3 = 100;
	int showPrice() {
		price += price3;
		return price;
	}
}






