//**********************************
// �ۑ薼 : Kad12_4
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/30
//**********************************
import java.util.Scanner;
public class Kad12_4 {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int action; //�s���i�[�ϐ�
//int i = 0; //�s���J�E���^
int[] power = {100, 90, 20, 50}; //�e�L�����̒ʏ�U���_���[�W
int[] magic = {80, 80, 120, 90}; //�e�L�����̖��@�U���_���[�W
int hitPoint = 360; //�����̗̑�

System.out.println("�����~�J���������ꂽ�I��");
System.out.println("�u���O����i���ɗ��N�����Ă��I�v��");
System.out.println("�u�P�ʂ��~�����Ύ���|���Ă݂�I�v");

for(Character bt: Character.values()){
	System.out.print(bt+ "�҂͂ǂ�����H�i1:�ʏ�U�� 2:���@�U�� ��:������j��");
	action = sc.nextInt();
	switch(action){
	case 1:System.out.println(bt+"�̒ʏ�U���I" + power[bt.ordinal()]+"�_���[�W�I");
		hitPoint = hitPoint-  power[bt.ordinal()];
		break;
	case 2:System.out.println(bt+"�̒ʏ�U���I" + magic[bt.ordinal()]+"�_���[�W�I");
		hitPoint = hitPoint-  magic[bt.ordinal()];
		break;
	default:
		System.out.println(bt +"�͓����������I ��������荞�܂ꂽ�I��");
		System.out.println("�u���̊w�Z���瓦���o����Ǝv���ȁI�v��");
	}
	if (hitPoint <= 0){
		break;
	}
}
if (hitPoint <= 0){
	System.out.println("�����~�J������|�����I��");
	System.out.println("�P�ʂ���ɓ��ꂽ�I��");
	System.out.println("�u���΂��c�����Ɛi������񂾂��c�v");
	System.out.println("------------ GAME CLEAR -------------");
}else{
	System.out.println("�����~�J���� �� �|���Ȃ������I��");
	System.out.println("�u���N���P�N�����J��Ԃ��������I�v");
	System.out.println("-------------- BAD END --------------");
}












	} 
enum Character{
�E��, ����, ���@�g��, �m��
};


}