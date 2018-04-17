package fundamentals.chapter4.sec2_class;

/*
 * No002とは別に「車」を表すクラスを定義してください。
 * フィールドやメソッドは任意に必ず1つ以上は定義するようにしてください。
 * また、No002クラスのmainメソッド内で車クラスをインスタンス化し、定義したメソッドを使用してみてください。
 */
public class No002 {
	public static void main(String[] args) {
		Car car = new Car(); //インスタンス化
		car.run(10);
		System.out.println(car.check());
		Car car1 =new Car();
		System.out.println(car1.check());
	}
}

//車
class Car{
	int gas = 60; //ガソリン

	public void run(int gas) {
		this.gas -= gas;
		System.out.println(gas*10+"キロ走行しました。");
	}

	public int check() {
		return this.gas;
	}
}