package fundamentals.chapter2.sec5_for;
/*
 * 自分の名前を3回表示させるプログラムをfor文を使用して作成してください。
 */
public class No005 {
	public static void main(String[] args) {
		String[] names = new String[] {"鈴木","鈴木","鈴木"};

		for(int i =0;i<names.length;i++) {
			System.out.println(names[i] );
		}
	}

}
