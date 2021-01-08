//**********************************
// 課題名 : Kad11_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/25
//**********************************
 import java.util.Scanner;
class Kad11_2 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String str1 = "ECC";
	String str2 = "comp";
 	String entry; 
	System.out.println("文字列 1：" + str1);
	System.out.println("文字列 2：" + str2);
	str1 = str1 + str2;
	System.out.println("文字列連結："+ str1);
	
	
	System.out.println("文字列長：：" + str1.length());
	System.out.print("文字列入力：");
	entry = sc.next();
	if (str1.equals(entry)){
		System.out.println(str1 + " = " + entry);
	}else{
		System.out.println(str1 + " ≠ " + entry);
	}
	}
}