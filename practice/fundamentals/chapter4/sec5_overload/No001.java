package fundamentals.chapter4.sec5_overload;
/*
 * 2つのint型a,bの最小値、3つのint型abcの最小値を求める以下のメソッドを定義して、
 * mainメソッドで使用するプログラムを作成してください。
 * ・int min(int a,int b)
 * ・int min(int a,int b,int c)
 */
class OLTest {

	int a;
	int b;
	int c;
	public int min(int a, int b) {
		int x = Math.min(a, b);
		return x;
	}
	public int min(int a , int b , int c) {
		int y = Math.min(a,b,c);
	}

}

public class No001 {
	public static void main(String[] args) {
		OLTest ot = new OLTest();
		System.out.println(ot.min(1, 5));
		System.out.println(ot.min(1, 7, 9));

		//System.out.println(Math.min(1, 5)); 結果を出力するだけならこれでよい
		//今回はメソッドを作っているのでややこしい
	}

}
