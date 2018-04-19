package fundamentals.chapter4.sec5_overload;
/*
 * 足し算クラスを作成し、mainメソッド内でインスタンス化してください。
 * この際、インスタンス時の引数によって「数値の足し算」「小数点数の足し算」「文字列の結合」を行うように
 * 足し算クラスのコンストラクタを定義してください。
 */

class Sample {
	Sample (int i, int m){
		System.out.println(i + m);
	}
	Sample (double d, double b) {
		System.out.println(d + b);
	}
	Sample (String s, String t) {
		System.out.println(s + t);
	}
}
public class No003 {
	public static void main(String[] args) {
		Sample sum = new Sample(2.0 ,2.5);
	}

}
