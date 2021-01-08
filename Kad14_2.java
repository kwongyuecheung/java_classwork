//**********************************
// 課題名 : Kad14_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/02
//**********************************
import java.util.*;
public class Kad14_2 {
	public static int calc(int n1, int n2, int operation) {
		int keika;
		if (operation == 1){
		keika = n1 + n2;
		
		}
		else {
		keika = n1 - n2;
		
		}
		return keika;
	

}


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int flag = 0;
int goukei;
while (flag == 0){
				try{
					System.out.print("数値 1 を入力：");
					int n1 = sc.nextInt();
					
					System.out.print("数値 2 を入力：");
					int n2 = sc.nextInt();
					
					System.out.print("計算方法(足し算:1 引き算:2)：");
					
					int operation = sc.nextInt();
					if (operation < 1||operation >2){
						System.out.println("計算方法は 1 か 2 を入力してください。");
						break;
					}
					
					goukei = calc(n1,n2,operation);
					
					System.out.println("計算結果："+ goukei);
				
				
				
				}catch(InputMismatchException e){
					System.out.println("入力値が不正です。");
					break;
				
				}System.out.print("続けますか？(0:YES 他:NO)：");
				flag = sc.nextInt();
		
}while (flag != 0){
	break;
}

System.out.print("終了します。");
}
	
}
