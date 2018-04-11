package fundamentals.chapter2.sec3_array;

/*
 * 3人のテスト結果がそれぞれ84点、74点、92点でした。
 * 点数を配列に入れるため、配列の宣言と領域の確保、及び初期化を行って下記の様に出力するプログラムを作成してください。
 * ▼出力結果
 * 1人目：84
 * 2人目：74
 * 3人目：92
 */
public class No001 {
	public static void main(String[] args) {
		int[] test = new int[3];

		test[0] = 84;
		test[1] = 74;
		test[2] = 92;

		System.out.println("一人目：" + test[0]);
		System.out.println("二人目：" + test[1]);
		System.out.println("三人目：" + test[2]);
	}
}
