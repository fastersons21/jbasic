package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * クラス SeitoScore をつくり、名前と、点数をメンバー変数に持たせてください。
 * メソッドには名前と点数を出力するメソッドを作り、コンストラクタで生徒名と点数を設定するようにしてください。
 * No001を使って５人の生徒の情報を管理し、５０点以上の生徒だけを表示するプログラムを作成してください。
 * ※Listクラスを必ず使用すること
 */
public class No001 {
	public static void main(String[] args) {
		SeitoScore student1 = new SeitoScore("田中",15);//コンストラクタで名前と点数を入力したい
		SeitoScore student2 = new SeitoScore("高橋",51);
		SeitoScore student3 = new SeitoScore("佐藤",99);
		SeitoScore student4 = new SeitoScore("山田",59);
		SeitoScore student5 = new SeitoScore("白石",3);

		ArrayList<SeitoScore> array = new ArrayList<SeitoScore>();
		array.add(student1);
		array.add(student2);
		array.add(student3);
		array.add(student4);
		array.add(student5);

		for(int i =0 ; i < array.size(); i++) {
			if(student1.getScore() >=50){
				System.out.println(array.get(i).getScore());
			}

		}



	}
}


class SeitoScore {
	String name;
	int score;

	SeitoScore() {//名前と点数を出力したい
//		System.out.println(name + score);
//		return;
	}

	public int getScore(){//getterをつくって
		return score;
	}

	public SeitoScore(String name,int score) {
		this.name = name;
		this.score = score;
		System.out.println(name + ":" + score + "点");
	}
}


