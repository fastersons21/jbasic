package fundamentals.chapter5.sec2_arraylist;

import java.util.ArrayList;

/*
 * データ数が5以上のArrayListを作成し、もしArrayListのサイズが3より大きい場合は、
 * 要素数1~3以外に入っているデータをすべて出力するプログラムを作成してください。
 *
 */
public class No005 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);//要素数０
		num.add(2);//1
		num.add(3);//2
		num.add(4);//3
		num.add(5);//4

		System.out.println(num.get(0));
		for(int i =4; i <=num.size(); i++) {
			System.out.println(num.get(i));
		}
	}

}
