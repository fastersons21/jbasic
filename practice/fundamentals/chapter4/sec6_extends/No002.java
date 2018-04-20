package fundamentals.chapter4.sec6_extends;
/*
 * Animalクラスを継承したcatクラスを作成してください。
 * また、Catクラスには、鳴き声のフィールドを作成し、ニャーとなくメソッドを定義してください。
 * mainメソッドでCatクラスをインスタンス化して、猫の名前と「ニャー」を表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		Cat animal = new Cat();
		Animal animal2 = new Animal();
		System.out.println(animal2.getName() + "「" + animal.maw + "」");
	}
}//p109継承

class Animal {//スーパークラス
	String name = "ニャース";

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name ="";
		System.out.println(this.name);
	}
}

class Cat extends Animal {//サブクラス class + サブクラス名 + extends + スーパークラス名
	String maw;
	Cat() {
		maw = "ニャー";
	}

}
