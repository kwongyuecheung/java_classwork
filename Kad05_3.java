//**********************************
// �ۑ薼 : Kad05_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad05_3 {
 	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
 	System.out.println("** �����v�Z�����܂� **");

 	System.out.print("�艿�F");
	int price = sc.nextInt();
	System.out.print("����(5%->1,10%->2,15%->3)�F");
	int discount = sc.nextInt();
	double a;

				switch(discount){
					case 1:
					a = price*0.95;
						break;
					case 2:
					a = price*0.9;
						break;
					case 3:
					a = price*0.85;
						break;
					default:
				   	a = price;
				}
			System.out.print("�̔����i�F"+ a +" �~�ł�");	
		}
}