//**********************************
// �ۑ薼 : Kad05_4
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad05_4 {
	public static void main(String[] args) {


	System.out.println("������2���͂��ĉ�����");
	Scanner sc = new Scanner(System.in);
	 
	
	System.out.print("����1 = ");
	int num1 = sc.nextInt();
	
	System.out.print("����2 = ");
	int num2 = sc.nextInt();
	
	System.out.print("[1:���Z/2:���Z/3:��Z/4:�������Z/5:��]] ==>");
	int rule = sc.nextInt();
	long ans = 0;
		switch(rule){
			case 1:
			ans = (num1+num2);
			break;
			case 2:
			ans = (num1-num2);
			break;
			case 3:
		    ans = (num1*num2);
			break;
			case 4:
			if(num2 == 0){
				System.out.print("�G���[�F�[�����Z�ł�");
				System.exit(1);
			}else{
			int r = num1/num2;
			ans = r;
			}
			break;
			case 5:
			ans = (num1%num2);
			break;
			default:
			System.out.println("���̓G���[(1�`5 �̐�������͂��ĉ�����) ");
			System.exit(1);
			}	
		System.out.print("����" + ans);
	}
}