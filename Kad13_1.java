//**********************************
// 課題名 : Kad13_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/02
//**********************************
import java.util.Scanner;
public class Kad13_1 {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

try{
	System.out.print("数値 1 を入力：");
	String str = sc.next();
	int num1 = Integer.parseInt(str);
	System.out.print("数値 2 を入力：");
	str = sc.next();
	int num2 = Integer.parseInt(str);
	System.out.println(num1+" + "+num2+" = "+(num1+num2));
}catch(NumberFormatException e) {
System.out.println("数値型変換エラーが発生しました。");
}





	}
}