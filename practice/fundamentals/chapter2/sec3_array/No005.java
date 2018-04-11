package fundamentals.chapter2.sec3_array;

/*
 * 要素型がintの配列を生成して、一番最後の要素を表示するプログラムを作成してください。
 * 要素数は3以上であること。
 */
public class No005 {
	public static void main(String[] args) {
		int[] x = new int[3];

		x[0] = 12;
		x[1] = 56;
		x[2] = 83;

		System.out.println(x[2]);
	}

}
