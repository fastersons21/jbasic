package fundamentals.chapter0;
/*
 * 以下のフィールドを保持したユーザクラスを作成し、getter/setterを定義してください。
 * また、mainメソッド内で各フィールドに任意の値をセットして画面へ出力するプログラムを作成してください。
 * <フィールド>
 *  ・ユーザID
 * ・ユーザ名
 * ・パスワード
 */

class Member {
	public static void main(String[] args) {
		No002 mem1 = new No002(1,"田中","123");
		No002 mem2 = new No002(2,"高橋","456");
		No002 mem3 = new No002(3,"渡辺","789");

//		System.out.println(mem1);
//		System.out.println(mem2);
//		System.out.println(mem3);


	}

}
public class No002 {
	private int userID;
	private String userName;
	private String pass;

	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	No002(int userID, String userName, String pass){
		System.out.println("ID:" + userID + "名前:" + userName + "パスワード:" + pass);

	}

}
