//**********************************
// �ۑ薼 : Kad11_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/25
//**********************************
 import java.util.Scanner;
 import java.util.Random; //Random �N���X���g�p���邽�߂̃C���|�[�g��
class Kad11_3 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();
	
	String[] kuji = {"��g", "�g", "���g", "���g", "���g", "��"};
	
	System.out.println("�����݂����������i�����o����I���j1:���s�A0:�I��");
	int flag = sc.nextInt();
	int n = rnd.nextInt(6);	
	while (flag == 1 && n!=5){
		
		
		System.out.println("���݂����̌���:"+ kuji[n]);
		
		System.out.println("�����݂����������i�����o����I���j1:���s�A0:�I��");
		flag = sc.nextInt();
		n = rnd.nextInt(6);	
	}
	if(flag == 1 && n == 5){
		System.out.println("���݂����̌���:"+ kuji[n]);
		System.out.println("�����o���̂ŏI�����܂��B");
		
	}
		
	}
}