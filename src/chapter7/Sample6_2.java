package chapter7;

public class Sample6_2 {
	public static void main(String[] args) {
		int x = 15;
		int y = 0;
		try {
			System.out.println("x/y:" + x/y);
			System.out.println("x*y:" + x*y);
		}catch (ArrayIndexOutOfBoundsException oe) {
			System.out.println("An exception occurred:" + oe);
		}finally {
			System.out.println("finaly block must be executed!必ず実行される！");
		}//ここまで実行されるcatchからfinallyまで

		System.out.println("x - y:" + (x - y) );//ここは処理されない
	}

}
