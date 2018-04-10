package chapter2;

public class Sample1_4 {
	public static void main(String[] args) {
	 int[] intArray = new int[5]; //配列の宣言

	 intArray[0] = 12; //配列の初期化
	 intArray[1] = 3; //異なるデータ型の代入は、コンパイルエラーになります。
	 intArray[2] = 28; //intArray[2] = 2.25
	 intArray[3] = 427;// 確保した領域外への代入は、実行時エラーになります。
	 intArray[4] = 33; //intArray[5] = 15

	 System.out.println("intArray[0]の値は" + intArray[0] + "です。"); //表示
	 System.out.println("intArray[1]の値は" + intArray[1] + "です。");
	 System.out.println("intArray[2]の値は" + intArray[2] + "です。");

	String[] sarray = {"one","two","three" };

	System.out.println("sarray[0]の値は" + sarray[0] + "です。");
	System.out.println("sarray[1]の値は" + sarray[1] + "です。");
	System.out.println("sarray[2]の値は" + sarray[2] + "です。");
	int len = sarray.length;

	System.out.println("配列のsarrayの要素の数は" + len + "です。");
	}
}
