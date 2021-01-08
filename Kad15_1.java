//**********************************
// �ۑ薼 : Kad15_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/14
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
			System.out.print("���� 1 ���́F");
			int a = sc.nextInt();
			System.out.print("���� 2 ���́F");
			int b = sc.nextInt();
			System.out.print("�ő���񐔂�"+euclid(a,b)+"�ł��B");
			
		}catch(InputMismatchException e){
			System.out.print("���͒l���s���ł��B");
		}catch (ArithmeticException e) { 
	       	System.out.println("0 ���Z�͂ł��܂���B");
      	}

	}
}
