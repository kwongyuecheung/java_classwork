//**********************************
// �ۑ薼 : Kad09_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/18
//**********************************
import java.util.Scanner; 
class Kad09_3 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[ ] data = {10,3,1,4,2,5,7,8,9,6}; 
	int i = 0;
	int j = 0;
	System.out.print("�����Ώۂ̔z��f�[�^�́A");
	for(int a : data){
		
		System.out.print( a + " ");
		
	}
	System.out.println("�ł��B");
	System.out.print("1 ���� 10 �܂ł̌����l����͂��Ă��������F");
	int	findIndex = sc.nextInt();
	
	for (i = 0; i < data.length; i++){
		if (findIndex == data[i]){
			j = i;
		}
	}
	
	
	System.out.print("�����l "+findIndex+" �� "+ (j+1) +" �Ԗڂɂ���܂��B");
	
 }
}