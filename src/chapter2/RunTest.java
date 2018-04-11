package chapter2;

//走行テスト
public class RunTest {
	public static void main(String[] args) {
		Car car = new Car();
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
