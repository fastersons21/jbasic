package fundamentals.chapter2.sec6_if;

/*
 * int型の変数xに対し、xに代入された数値が正か負かを判定するプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		int x = 0;

		if(x >= 0) {
			System.out.println("正");
		}else if(x <= 0) {
			System.out.println("負");
		}
	}
}

