package fundamentals.chapter4.sec1_method;
/*
 * int型の配列を受け取り、すべての要素の合計を返すメソッドを定義してください。
 * mainメソッドから、そのメソッドに配列を渡して合計を表示してください。
 * ※配列の要素数や値は任意とする
 */
public class No006 {
	public static void main(String[] args) {
		int[] array = {16,28,1,2,8,41,52};
		int total = sum(array);
		System.out.println("合計=" + total);
	}

	public static int sum(int [] x) {
		int t =0;
		for(int  a : x) {
			t += a;
		}
		return t;
	}

}
