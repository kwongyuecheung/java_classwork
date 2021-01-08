//**********************************
// 課題名 : Kad20_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/30
//**********************************
import java.util.*;

public class Kad20_1{
	public static int func (int i){
		if(i > 1){
			int x = func(i - 1);
			return i * x;
		}else{
			return 1;
		}	
	}
	public static void main (String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("-----階乗計算処理-----");
			System.out.print("数値を入力してください(0~10)：");
			int inNum = sc.nextInt();
			if(inNum > 10 || inNum < 0){
				System.out.println("入力値が範囲外です。");
			}else{
				System.out.print(inNum + "の階乗は" + func(inNum) +"です。");
			}
		}catch(InputMismatchException e){
			System.out.print("入力値が不正です。");
		}
	}
}
