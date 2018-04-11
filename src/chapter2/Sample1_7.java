package chapter2;

import java.util.Scanner;

public class Sample1_7 {
	public static void main(String[] args) {
		
		System.out.println("1～5までの数値を入力してください");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		int i =scan.nextInt();
		
		int a = i* 10;
			

		//出力
		System.out.println(str);
		System.out.println(a);

		scan.close();

	}

}
