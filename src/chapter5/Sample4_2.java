package chapter5;

public class Sample4_2 {
	public static void main(String[] args) {
		int[][] array = new int [2][3];//配列の宣言

		array[0][0] = 1; //配列の初期化
		array[0][2] = 3; //立方体がつながっている
		array[1][0] = 4; //3次元配列の場合はx、y、z軸の関係になる
		array[1][1] = 5; //次元の数だけfor文を波括弧の中に作っていく
		array[1][2] = 6; //for文の中の条件式は一つ前に作ったfor文の配列名[変数名].lengthで取得できる。

		for(int i = 0; i< array.length; i++) {
			for(int j = 0; j <array[i].length; j++){
				System.out.println("array[" + i + "] [" + j +"] = " + array[i][j]);
			}
		}
	}

}
