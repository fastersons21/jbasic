package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * ArrayListクラスに値を代入し、サイズを出力するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		array.add(30);
		
		System.out.println(array.size());

	}

}
