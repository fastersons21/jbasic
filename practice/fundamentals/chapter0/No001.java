package fundamentals.chapter0;

import java.time.LocalDate;
import java.util.Date;

/*
 * APIを使用して日時(XXXX年XX月XX日)を表示するプログラムを作成してください。
 * ※APIは自身で探してみてください
 */
public class No001 {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		LocalDate date = new LocalDate(2018,05,02);
		System.out.println(date);

	}

}
