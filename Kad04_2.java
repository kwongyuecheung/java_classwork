//**********************************
// 課題名 : Kad04_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/18
//**********************************
import java.util.Scanner; 
class Kad04_2 {
 public static void main(String[] args) {
 System.out.println("2つの整数を入力して下さい。");
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
System.out.println("整数1の入力："+a);
System.out.println("整数2の入力："+b);
if(a>b){
	int sub = a*b ;
	int mul = a-b ;
System.out.println(a+"x"+b+"="+sub);
System.out.println(a+"-"+b+"="+mul);
 }else if(a<=b){
 	int div = b/a ;
	int rem = b%a ;
	int add = a+b ;
 System.out.println(b+"÷"+a+"="+div +"..."+rem);
 System.out.println(a+"+"+b+"="+add);
 }
 }
}