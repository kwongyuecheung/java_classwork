//**********************************
// 課題名 : Kad05_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/26
//**********************************

import java.util.Scanner; 

class Kad05_1 {
 public static void main(String[] args) {
 	
	 System.out.println("四則計算をします");
	 System.out.println("整数二つをいれてください");
	 Scanner sc = new Scanner(System.in);
	 
		
		System.out.print("整数1 = ");
		int num1 = sc.nextInt();
		
		System.out.print("整数2 = ");
		int num2 = sc.nextInt();
		
		System.out.print("[1:加算/2:減算/3:乗算/4:除算] ==>");
		int rule = sc.nextInt();
	
			switch(rule){
				case 1:
				System.out.print(num1+ " + "+ num2 + " = " + (num1+num2));
					break;
				case 2:
				System.out.print(num1+ " - "+ num2 + " = " + (num1-num2));
					break;
				case 3:
				System.out.print(num1+ " x "+ num2 + " = " + (num1*num2));
					break;
				case 4:
				double r = num1/num2;
				System.out.print(num1+ " ÷ "+ num2 + " = " + r);
					break;
				default:
				System.out.println("errorです。");
				
				}
	}
}