package chapter2;

/*
 * break文
 *
 */
public class Ex017_Break {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i ++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
}
/*
 * Note
 * iが５の場合はループを抜ける
 * 移行の処理は実行されない
 */
