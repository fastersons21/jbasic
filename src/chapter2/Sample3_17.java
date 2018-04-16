package chapter2;
/*
 * サブクラスをインスタンス化
 */

abstract class AbsStaff{
	String name="名無し";
	String getName() {
		return name;
	}
	abstract int getSalary();

}
class ManagerAbs extends AbsStaff{
	int salary=5000000;
	@Override
	int getSalary() {
		return salary;
	}
	@Override
	String getName() {
		return"【マネージャー】" + super.getName();//上のgetNameを読んでいる
	}
}

public class Sample3_17 {
	public static void main(String[] args) {
		ManagerAbs m1=new ManagerAbs();
		System.out.println("名前" + m1.getName());
		System.out.println("給与" + m1.getSalary());
	}
}
