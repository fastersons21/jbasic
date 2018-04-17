package fundamentals.chapter4.sec2_class;
/*
 * No003クラスとは別に、四角形を表すクラスを定義してください。
 * フィールドに縦と横の長さをint型で持つようにします。
 * メソッドとして面積を返すメソッドを定義してください。
 * No003クラスのmainメソッドで四角形クラスをインスタンス化し、面積を表示させるプログラムを作成してください。
 */
class Quadrangle{

	private int width;
	private int height;

	public void setSize(int w , int h) {
		width =w;
		height = h;
	}
	public int getArea() {
		return width * height;
	}
}
public class No003 {
	public static void main(String[] args) {
		Quadrangle x = new Quadrangle();

		x.setSize(100 , 50);
		System.out.println("四角形の面積は" + x.getArea());
	}
}
//機能を使う場合に使う側に選ばせるために引数を使う
//クラス名　変数　= new クラス名();
//Rectangle r = new Rectangle();