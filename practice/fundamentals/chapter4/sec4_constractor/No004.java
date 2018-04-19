package fundamentals.chapter4.sec4_constractor;
/*
 * 次のようなフルーツクラスを作成してください。
 * <フィールド>
 * ・甘さ
 * ・色
 * ・大きさ
 *
 * <メソッド>
 * ・甘さを表示する
 * ・色を表示する
 * ・大きさを表示する
 *
 * このフルーツクラスをインスタンス化した際に、甘さ、色、大きさをコンストラクタによって初期化し、
 * その後甘さ、色、大きさをそれぞれ表示するプログラムを作成してください。
 *
 */

class Apple {
	String sweet;
	String color;
	int size;

	Apple(String sweet, String color, int size){
		System.out.println("このフルーツは" + sweet + "です。");
		System.out.println("このフルーツの色は" +color + "です。");
		System.out.println("このフルーツの大きさは" + size + "センチです。");

	}
}
public class No004 {
	public static void main(String[] args) {
		Apple getFruit = new Apple("甘い", "赤", 10);

	}

}
