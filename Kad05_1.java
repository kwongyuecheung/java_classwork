//**********************************
// �ۑ薼 : Kad05_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/05/26
//**********************************

import java.util.Scanner; 

class Kad05_1 {
 public static void main(String[] args) {
 	
	 System.out.println("�l���v�Z�����܂�");
	 System.out.println("�����������Ă�������");
	 Scanner sc = new Scanner(System.in);
	 
		
		System.out.print("����1 = ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 = ");
		int num2 = sc.nextInt();
		
		System.out.print("[1:���Z/2:���Z/3:��Z/4:���Z] ==>");
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
				System.out.print(num1+ " �� "+ num2 + " = " + r);
					break;
				default:
				System.out.println("error�ł��B");
				
				}
	}
}