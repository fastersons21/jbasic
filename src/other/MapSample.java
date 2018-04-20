package other;

import java.util.HashMap;
import java.util.Map;
//マップコレクション生成
public class MapSample {
	public static void main(String[] args) {
		//マップへのキーと値格納
		Map<Integer,String> map = new HashMap<Integer,String>();

		map.put(1,"カレー");
		map.put(2,"うどん");
		map.put(1,"オムライス");
		
		//マップサイズ取得
		System.out.println("コレクションのサイズ:" + map.size());
		//マップの出力
		System.out.println(map);
		//for文による取り出し（値のみ）
		for(String value : map.values()) {
			System.out.println(value);
		}
		//for文による取り出し()
		for(Map.Entry<Integer, String> entry : map.entrySet()) {

			System.out.println("キー:" + entry.getKey() + "値:" + entry.getValue());

		}
	}

}
