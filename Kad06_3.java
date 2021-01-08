//**********************************
// 課題名 : Kad06_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad06_3 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
int flag = 1;
do{

 System.out.print("整数を入力して下さい：");
  int num = sc.nextInt(); //整数格納用
  if(num%2 == 0){
  	System.out.println("入力した数は偶数です。");
  }else{
System.out.println("入力した数は奇数です。");
}
  System.out.print("もう一度実行しますか？[する…1/しない…0]：");
  flag = sc.nextInt();

 }while(flag == 1);
 System.out.print("終了します。");
}

}