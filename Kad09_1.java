//**********************************
// 課題名 : Kad09_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/18
//**********************************
import java.util.Scanner; 
class Kad09_1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[ ] str = new String[3];
	
	System.out.println("--- 入力 ---");
	
	for ( int i = 0 ; i < str.length ; i ++){
			System.out.print("配列 str[" + i + "] = ");
			str[i] = sc.next();
	}
	
	System.out.println("--- 拡張 for 文による表示 ---");
	int i = 0;
	for (String j : str){
			System.out.println("配列 str[" + i + "] = " + j);
			i++;
	}
 }
}