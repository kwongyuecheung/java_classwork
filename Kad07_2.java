//**********************************
// 課題名 : Kad07_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/04
//**********************************
import java.util.Scanner;
class Kad07_2 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 System.out.println("**** 1 から n までの和を計算します ****");
 System.out.print("n を入力して下さい：");
 
 int n = sc.nextInt();
 	if (n <= 0){
 		System.out.print("1 より大きい整数を入力してください。");
		System.exit(1);
	 }
 int i;
 int sum = 0;
 	for ( i = 1 ; i <= n ; i++){
		System.out.print(i + " ");
		sum = i + sum;
 	}
		
		System.out.println("\n");
		System.out.println("1から"+ n +"までの和は" + sum );
		
 	}
 }
 