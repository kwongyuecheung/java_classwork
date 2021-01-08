//**********************************
// 課題名 : Kad15_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/14
//**********************************
import java.util.*;

public class Kad15_1{
	public static int euclid (int a, int b){
		int temp;
		do{
			temp = a % b;
			a = b;
			b = temp;
		}while(temp!=0); 
		return a;
	}
	
	public static void main (String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("整数 1 入力：");
			int a = sc.nextInt();
			System.out.print("整数 2 入力：");
			int b = sc.nextInt();
			System.out.print("最大公約数は"+euclid(a,b)+"です。");
			
		}catch(InputMismatchException e){
			System.out.print("入力値が不正です。");
		}catch (ArithmeticException e) { 
	       	System.out.println("0 除算はできません。");
      	}

	}
}
