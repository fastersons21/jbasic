package fundamentals.chapter4.sec2_class;
/*
 * No002とは別に「車」を表すクラスを定義してください。
 * フィールドやメソッドは任意に必ず1つ以上は定義するようにしてください。
 * また、No002クラスのmainメソッド内で車クラスをインスタンス化し、定義したメソッドを使用してみてください。
 */
class car {
	String x = "走る";

}
public class No002 {
	public static void main(String[] args) {
		car a = new car();
		System.out.println(a.x);
	}

}
