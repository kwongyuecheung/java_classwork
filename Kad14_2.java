//**********************************
// �ۑ薼 : Kad14_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/02
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
					System.out.print("���l 1 ����́F");
					int n1 = sc.nextInt();
					
					System.out.print("���l 2 ����́F");
					int n2 = sc.nextInt();
					
					System.out.print("�v�Z���@(�����Z:1 �����Z:2)�F");
					
					int operation = sc.nextInt();
					if (operation < 1||operation >2){
						System.out.println("�v�Z���@�� 1 �� 2 ����͂��Ă��������B");
						break;
					}
					
					goukei = calc(n1,n2,operation);
					
					System.out.println("�v�Z���ʁF"+ goukei);
				
				
				
				}catch(InputMismatchException e){
					System.out.println("���͒l���s���ł��B");
					break;
				
				}System.out.print("�����܂����H(0:YES ��:NO)�F");
				flag = sc.nextInt();
		
}while (flag != 0){
	break;
}

System.out.print("�I�����܂��B");
}
	
}
