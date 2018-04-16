package chapter2;

public class sample000 {
	public static void main(String[] args) {
		Pojo data = new Pojo();
		//画面から受け取ったデータをセット
		data.setName("山田");
		
			
		//セットしたデータを入力
		String name = data.getName();
		System.out.println(name);
	}

}
