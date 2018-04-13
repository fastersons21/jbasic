package fundamentals.chapter2.sec6_if;

/*
 * int型変数x、yに対し、x÷yの演算が割り切れるかどうかを判定するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {

		int x = 9;
		int y = 3;

		if(x %y==0) {
			System.out.println("割り切ることが出来る");
		}else {
			System.out.println("割り切ることが出来ない");
		}
	}

}
