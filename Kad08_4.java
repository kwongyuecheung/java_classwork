//**********************************
// �ۑ薼 : Kad08_4
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/16
//**********************************
import java.util.Scanner; 
class Kad08_4 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int dec;
	int[] bit = new int[256] ;
	int i ;
	
	System.out.print("���̐�������͂��ĉ������F");
	dec = sc.nextInt();
	
	for(i = 0; dec > 0 ; i++){
	bit[i] = dec % 2;
	dec = dec/2;
	}
	System.out.print("2 �i���ɕϊ��F");
	while(i > 0){
		System.out.print(bit[i-1]);
		i--;
	}
 }
}