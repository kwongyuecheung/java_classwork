//**********************************
// �ۑ薼 : Kad12_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/30
//**********************************
public class Kad12_3 {
 public static void main(String[] args) {
 	System.out.println("�u���N�� 1 �N�撣�邼�I�I�v");

	for (Month myVar : Month.values()) {
		if (myVar.ordinal()==11){
			System.out.print((myVar.ordinal()+1)+"���F");
			System.out.print(myVar.getMsg());
			System.out.println("���N����{�C���o���B");
		}else{
			System.out.print((myVar.ordinal()+1)+"���F");
			System.out.print(myVar.getMsg());
			System.out.println("��������{�C���o���B");
		}
	
}
 }
 enum Month{
 	JANUARY("�����[�����΂��ƌ�Ńo�e��B"),
	 FEBRUARY("�܂��܂������B����ł͂��C���o�Ȃ��B"),
	 MARCH("�N�x�̏I���Ń^�C�~���O�������B"), 
	 APRIL("�G�߂̕ς��ڂ͑̒�������₷���B"),
	MAY("��؂�̗ǂ� 4 ���𓦂��Ă��܂����B"),
	JUNE("�~�J�ŋC�����������ށB�~�J������"), 
	JULY("���ꂩ��ǂ�ǂ�C�����㏸���Ă����B�̗͉����̂���"), 
	AUGUST("�������ċC�͂��������B"),
	SEPTEMBER("�x�݃{�P�������Ȃ��B�������Ă����ʂ������̂�"), 
	OCTOBER("���r���[�Ȏ����B�����͎����̎��B"), 
	NOVEMBER("�}�ɗ₦�Ă����B�������������������͋֕��B"), 
	DECEMBER("�������N�͏I���B���N�̓`�����X�����������B");
	
	private String msg;
	private Month(String msg){
		this.msg = msg;
	}
	public String getMsg(){
		return msg;
	}
	} 

}