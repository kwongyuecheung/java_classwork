//**********************************
// �ۑ薼 : Kad07_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/04
//**********************************
import java.util.Scanner;
class Kad07_2 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 System.out.println("**** 1 ���� n �܂ł̘a���v�Z���܂� ****");
 System.out.print("n ����͂��ĉ������F");
 
 int n = sc.nextInt();
 	if (n <= 0){
 		System.out.print("1 ���傫����������͂��Ă��������B");
		System.exit(1);
	 }
 int i;
 int sum = 0;
 	for ( i = 1 ; i <= n ; i++){
		System.out.print(i + " ");
		sum = i + sum;
 	}
		
		System.out.println("\n");
		System.out.println("1����"+ n +"�܂ł̘a��" + sum );
		
 	}
 }
 