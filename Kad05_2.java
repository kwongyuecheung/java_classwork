//**********************************
// �ۑ薼 : Kad05_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad05_2 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("���A�����ł����H�F");

 


int month = sc.nextInt();


switch(month){
		case 1:
		case 12:
		case 2:
	System.out.print("�~�ł��B�����̂͌����ł��I");
	break;
		case 3:
		case 4:
		case 5:
	System.out.print("�t�ł��B�ǂ��G�߂ł��I");
	break;
		case 6:
		case 7:
		case 8:
	System.out.print("�Ăł��B���������ł��I");
	break;
		case 9:
		case 10:
		case 11:
	System.out.print("�H�ł��B�H�ו������������G�߂ł��I");
	break;
	
	default:
	System.out.println("���� 1�`12 �܂łł��B");
	
}
}
}