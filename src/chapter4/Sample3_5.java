package chapter4;

class StaticCodeExample{
	static int counter = 0;// static変数
	static { //staticイニシャライザ
		counter++;
		System.out.println("Static Code block: counter:" + counter);
	}
	StaticCodeExample(){ //コンストラクタ
		System.out.println("Constructor:counter : + counter");

	}
}

public class Sample3_5 {
	public static void main(String[] args) {
		StaticCodeExample sce1 =new StaticCodeExample();
		StaticCodeExample sce2 =new StaticCodeExample();

	}
}//staticイニシャライザはmainメソッドよりも前に呼び出される。
