//**********************************
// �ۑ薼 : Kad10_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/23
//**********************************
import java.util.Scanner; 
class Kad10_1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[ ][ ] fare = {{0,140,200,280},{140,0,180,240},{200,180,0,160},{280,240,160,0}};
 	int i, j; 
	
	System.out.println("�o�X��R�[�h(1-4)�� �s�i��ԉw�j����͂��Ă��������F");
	i = sc.nextInt();
	System.out.println("�o�X��R�[�h(1-4)�� ��i�~�ԉw�j����͂��Ă��������F");
	j = sc.nextInt();
	
	if(i == j || i > 4 || i < 1 || j > 4 || j < 1){
	System.out.println("���̓G���[�ł�");
	}else{
	System.out.println("�o�X��" + i + "����"+ j + "�܂ł̗�����"+ fare[i-1][j-1] + "�~�ł��B");
	}
 }
}