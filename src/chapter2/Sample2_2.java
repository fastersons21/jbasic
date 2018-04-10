package chapter2;

public class Sample2_2 {
	public static void main(String[] args) {
		int num;
		
		System.out.println("後起きの場合");
		num = 10;
		System.out.println(num++);
		System.out.println(num);
		
		System.out.println("前置きの場合");
		num = 10;
		System.out.println(++num);
		System.out.println(num);
	}
}
