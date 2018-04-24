package fundamentals.chapter5.sec2_arraylist;

import java.util.ArrayList;

/*
 * ArrayListのコンストラクタ「ArrayList(int initialCapacity) 」を使用して、要素数5の配列を作成してください。
 * 作成したArrayListに、任意の値を6個代入して、拡張for文を使用して1つづつ表示するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
	ArrayList<Integer> num = new ArrayList<Integer>();

	num.add(10);
	num.add(20);
	num.add(30);
	num.add(40);
	num.add(50);
	num.add(60);

	 for (int i = 0 ; i < num.size() ; i++){
	      Integer getNum = num.get(i);
	      System.out.println(getNum);
	 }
	}

}
