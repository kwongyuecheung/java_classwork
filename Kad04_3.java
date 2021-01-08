//**********************************
// 課題名 : Kad04_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/18
//**********************************
import java.util.Scanner; 
class Kad04_3 {
 public static void main(String[] args) {
 System.out.println("3 つの整数を入力して下さい。");
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
System.out.println("1つの入力："+a);
System.out.println("2つの入力："+b);
System.out.println("3つの入力："+c);
if(a==b&&b==c){
System.out.println("全部同じ値です。");

 }else if(a==b||a==c||b==c){
 System.out.println("2 つの値が同じです。");
 }else if(a!=b&&a!=c&&b!=c){
 System.out.println("3 つの値は異なります。");
 }
 }
}