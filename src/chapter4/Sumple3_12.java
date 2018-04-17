package chapter4; //オーバーライド

class StaffOv{//スーパークラス
	String name = "名無し";
	String getName() {
		return name;
	}
}
class ManagerOv extends StaffOv{ //サブクラス
	int salary = 5000000;
	int getSalary() {
		return salary;
	}
	String getName() { //オーバーライド
		return"【マネージャー】" + name;

	}
}

public class Sumple3_12 {
	public static void main(String[] args) {
		StaffOv s1 =new StaffOv(); //インスタンス化
		System.out.println("------スーパークラス------");
		System.out.println("名前:" + s1.getName()); //スーパークラスで定義した

		System.out.println();
		ManagerOv m1 =new ManagerOv(); //インスタンス化
		System.out.println("------サブクラス-------");
		System.out.println("名前" + m1.getName()); //サブクラスで定義した
		System.out.println("給与" + m1.getSalary());
	}

}
