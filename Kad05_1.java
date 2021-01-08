//**********************************
// ‰Û‘è–¼ : Kad05_1
// ƒNƒ‰ƒX : SE1A
// ì¬Ò : Kwong Yue CheungƒRƒEƒ†ƒEƒVƒ‡ƒE
// ì¬“ú : 2020/05/26
//**********************************

import java.util.Scanner; 

class Kad05_1 {
 public static void main(String[] args) {
 	
	 System.out.println("l‘¥ŒvZ‚ğ‚µ‚Ü‚·");
	 System.out.println("®”“ñ‚Â‚ğ‚¢‚ê‚Ä‚­‚¾‚³‚¢");
	 Scanner sc = new Scanner(System.in);
	 
		
		System.out.print("®”1 = ");
		int num1 = sc.nextInt();
		
		System.out.print("®”2 = ");
		int num2 = sc.nextInt();
		
		System.out.print("[1:‰ÁZ/2:Œ¸Z/3:æZ/4:œZ] ==>");
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
				System.out.print(num1+ " € "+ num2 + " = " + r);
					break;
				default:
				System.out.println("error‚Å‚·B");
				
				}
	}
}