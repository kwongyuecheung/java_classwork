//**********************************
// 課題名 : Kad14_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/02
//**********************************
import java.util.*;
public class Kad14_1 {
	public static void show(String str, int cnt) {
		for (int i = 0; i<= cnt; i ++){
		System.out.println(str);
		}

}

 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try{
System.out.print("表示文字：");
String str = sc.next();
System.out.print("表示回数：");
int cnt = sc.nextInt();
show(str,cnt);
}catch
	(InputMismatchException e){
System.out.print("入力値が不正です。");

}

	}
}