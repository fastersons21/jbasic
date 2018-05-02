package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * ArrayListを使用して値を代入後、拡張for文を使用して値を順番に表示するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(1);
		num.add(2);
		num.add(3);

		for(int i = 0; i <=num.size(); i++) {
			System.out.println(num.get(i));

		}
	}

}
