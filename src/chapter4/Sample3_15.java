package chapter4;
class StaffTs{
	StaffTs(){
		this("佐藤");
	}
	StaffTs(String name){
		System.out.println("名前:"+ name);
	}
	void methodM1() {
		System.out.println("メソッドM1");
	}
	void methodM2() {
		this.methodM1();
		System.out.println("メソッドM2");
	}
}

public class Sample3_15 {
	public static void main(String[] args) {
		StaffSp s1 =new StaffSp();
		System.out.println("------スーパークラス------");
		System.out.println("名前:" + s1.getName());

		System.out.println();
		ManagerSp m1 =new ManagerSp();
		System.out.println("------サブクラス------");
		System.out.println("名前:" + m1.getName());
		System.out.println("給与:" + m1.getSalary());
	}
}
