package chapter5;

import java.util.ArrayList;

public class Sample4_4 {
	public static void main(String[] args) {
		ArrayList<Integer>num =new ArrayList<Integer>();//初期値なし
		/*Integerとは
		 * ラッパークラスであり、通常は使えないデータ型の変数（int)でも使えるようになる
		 * int = Integer
		 * double = Double  等p152参照
		 */
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);

	 	num.remove(2);// APIからコードを検索してとってきて削除する事が出来る


		for(int i = 0; i < num.size(); i++) { //ArrayListは.lengthではなく.size()
			System.out.println(num.get(i));
		}
	}

}
