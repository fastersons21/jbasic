package other;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
	public static void main(String[] args) {
		//リストコレクションの生成
		List<String> list = new ArrayList<String>();
		/*String型をラッパークラスのintegerを入れれば数値を入れることが出来る
		 * neｗのあとはコンストラクタ
		 * デフォルトで１０個のリストが生成される
		 * ａｄｄメソッドを使うことによって値を格納
		 */

		//リストへの値格納
		list.add("リンゴ");
		list.add("ゴリラ");
		list.add("らっぱ");

		//リストサイズ取得
		System.out.println("コレクションのサイズ：" + list.size());//変換上手くいかなかった大文字になるなんなんこれ
		//リストの出力
		System.out.println(list);

		//for文による取り出し
		for(String s :list) {
			System.out.print(s);
			System.out.print("→");
		}
	}

}




