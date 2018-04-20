package fundamentals.chapter4.sec7_override;
/*
 * 次のプログラムを実行すると、「山田」と表示されました。
 * ManagerクラスにgetNameメソッドをオーバーライドし、「【マネージャー】山田」と表示されるようにしてください。
 */
public class No001 {//戻り値の型、インスタンスメソッド名、引数の型、引数の数がスーパークラスと一緒でなければならない
	public static void main(String[] args) {
		Manager m = new Manager();
		m.getName();
	}
}

class Employee {//スーパークラス
	String name = "山田";  // 社員名
	int id;  // 社員ID
	public void getName() {
		System.out.println(name);
	}
}

class Manager extends Employee {//サブクラス
	String name1 = "【マネージャー】";
	public void getName() {
		System.out.println(name1 + name);
		
	}
}