//**********************************
// �ۑ薼 : Kad21_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/08/5
//**********************************
import java.util.*;

public class Kad21_2{
	public static void main (String[] args){
		try{
			Random rand = new Random();
			Scanner sc = new Scanner(System.in);
			final int WIN = 0, LOSE = 1, DROW = 2;
			int[][] result = {{2,0,1},{1,2,0},{0,1,2}}; //�v���C���[���_�̌���
			int playHand, comHand, comHand2; //���ꂼ�ꂪ���o������
			int i = 0;
			int res;
			String[] textHand = {"�O�[", "�`���L","�p�["};
			String[] textResult = {"���������I","������������I","���������I" };
			System.out.println("���̃R���s���[�^�Ƃ���񂯂񏟕��I(3 ���ŏI��)");
			while(i < 3){
				System.out.print("�ǂ̎���o���H(0:�O�[ 1:�`���L 2:�p�[)�F");
				System.out.println("�v���C���[�F"+ textHand[playHand = sc.nextInt()]);
				System.out.println("�R���s���[�^ 1�F"+textHand[comHand = rand.nextInt(3)]);
				System.out.println("�R���s���[�^ 2�F"+textHand[comHand2 = rand.nextInt(3)]);
				if ((comHand == comHand2)||(playHand == comHand2)){
					res = result[playHand][comHand];
				}else if(playHand == comHand){
					res = result[playHand][comHand2];
				}else{
					res = 2;
				}
				System.out.print(textResult[res]);
				if(res == 0){
					i++;
				}
				System.out.println("("+ i + "��"+")");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.print("���͒l���s���ł��B");
		}catch(InputMismatchException e){
			System.out.print("���͒l���s���ł��B");
		}
	}
}
