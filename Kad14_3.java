//**********************************
// 課題名 : Kad14_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/02
//**********************************
import java.util.*;
public class Kad14_3 {
	public static int check(int n,int ans) {
		int keika;
		if (n == ans){
		keika = 3;
		
		}
		else if(n>ans){
		keika = 1;
		
		}else{
	keika = 2;
		}
		return keika;
	}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rnd = new Random();
int ransu = rnd.nextInt(99);
System.out.println("数当てゲーム！(0~99)");
while (true){
		try{
			System.out.print("何番でしょう？：");	
			int num = sc.nextInt();
			int ans = check(num,ransu);
			if (ans == 3){
				System.out.println("正解！");
				System.out.print("終了します。");
				break;
			}else if (ans == 1){
				System.out.println("もっと小さいよ！");

			}else{
				System.out.println("もっと大きいよ！");
			
			}
		}catch(InputMismatchException e){
					System.out.println("入力値が不正です。");
					System.out.print("終了します。");
					break;
					}
}
	
}
}
