package fundamentals.chapter2.sec5_for;
/*
 * 2 の 1 乗から 8 乗までを計算し表示するプログラムを作成してください。
 */
public class No006 {
	public static void main(String[] args) {
		int x = 1;

		for(int i = 1; i <=8; i++) {
			x*=2;
			System.out.println(x);
		}
	}

}
