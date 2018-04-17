package other;

//拡張for文

public class Ex014_ExtensionFor {
	public static void main(String[] args) {
		// 配列を定義
		int[] intArray = {1,2,3,4,5};

		// 拡張for文
		for (int i : intArray) {//配列の要素分処理が繰り返される
			i = i * 3;  // 要素に処理を加えたい場合などに使用
			System.out.println(i);
		}
	}
}
