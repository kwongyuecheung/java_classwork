//**********************************
// 課題名 : Kad04_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/18
//**********************************
import java.util.Scanner; 
class Kad04_1 {
 public static void main(String[] args) {
 System.out.println("あなたの名前を入力してください。");
 Scanner sc = new Scanner(System.in);
 String a = sc.next();
 System.out.println(a+"さんこんにちは。");
 System.out.println("歳を入力してください。");
 int b = sc.nextInt();
 System.out.println(b+"歳とすると、10 年後は"+(b+10)+"ですね。");
 }
}