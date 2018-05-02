package fundamentals.chapter10.sec1_list;

/*
 * 買い物リストクラスを作成し、「No」と「名称」と「価格」をメンバ変数に持たせ、コンストラクタで各メンバ変数の値を設定するようにしてください。
 * また、メソッドには各メンバの値を設定するメソッド（setter）と、取得するメソッド（getter）を作成してください。
 * No002クラスで買い物リストを完成させ、100円以上のものと100円より下のもので分けて表示するようにしてください。
 */
public class No002 {
	public static void main(String[] args) {
		buyList shop1 = new buyList(1,"リンゴ",100);
		buyList shop2 = new buyList(2,"ミカン",90);
		buyList shop3 = new buyList(3,"ブドウ",300);
//		shop.setNum(1);
//		shop.setName("リンゴ");
//		shop.setPrice(100);		
		
		if(shop1.getPrice() >=100) {
		System.out.println("No:" + shop1.getNum() + ",名称:" + shop1.getName() + ",価格:" + shop1.getPrice() + "円");
	}else if (shop2.getPrice() >=100) {
		System.out.println();
	}
		
	}


}

class buyList {
	private int num;
	private String name;
	private int price;

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public buyList() {

	}

	public buyList(int num,String name, int price) {
		this.num= num;
		this.name= name;
		this.price= price;

	}
}