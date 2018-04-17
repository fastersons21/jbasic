package other;

public class Beans {
	private String name; //フィールドの宣言はprivate

	public Pojo() {} //コンストラクタ(デフォルト)
	public Pojo(String name) {// コンストラクタ（オーバーロード）
		this.name= name;

	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
