//**********************************
// �ۑ薼 : Kad21_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/08/5
//**********************************
import java.util.*;

public class Kad21_1{
	
	public static void main (String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			final int WIN = 0, LOSE = 1, DROW = 2;
			int[][] result = {{DROW,WIN,LOSE},{LOSE,DROW,WIN},{WIN,LOSE,DROW}}; //�v���C���[���_�̌���
			int playHand, comHand; //���ꂼ�ꂪ���o������
			
			String[] textHand = {"�O�[", "�`���L","�p�["};
			String[] textResult = {"���������I","������������I","���������I" };
			
			Random rand = new Random();
			int ran = rand.nextInt(3);
			
			System.out.println("�R���s���[�^�Ƃ���񂯂񏟕��I");
			
			System.out.print("�ǂ̎���o���H(0:�O�[ 1:�`���L 2:�p�[)�F");
			System.out.println("�v���C���[�F"+ textHand[playHand = sc.nextInt()]);
			System.out.println("�R���s���[�^�F"+textHand[comHand = ran]);
			System.out.println(textResult[result[playHand][comHand]]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.print("���͒l���s���ł��B");
		}catch(InputMismatchException e){
			System.out.print("���͒l���s���ł��B");
		}
	}
}
