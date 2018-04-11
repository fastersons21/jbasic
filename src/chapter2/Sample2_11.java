package chapter2;

public class Sample2_11 {
	public static void main(String[] args) {
		Staff s =new Staff();//インスタンス化
		String name= s.getName();
		System.out.println("スタッフ名:" + name);
	}

}
//スタッフクラス
class Staff{
	String name = "山田";//インスタンス変数

	public String getName() {
		return name;
	}
}