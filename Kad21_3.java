//**********************************
// �ۑ薼 : Kad21_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/08/6
//**********************************
import java.util.*;

public class Kad21_3{
	public static void main (String[] args){
		try{
			Random rand = new Random();
			Scanner sc = new Scanner(System.in);
			final int WIN = 0, LOSE = 1, DROW = 2;
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
				int result = ((playHand + comHand + comHand2) % 3);
				if (result == 0){
					res = 2;
				}else if(((result == 1) && (comHand != comHand2))||((result == 2) && (comHand == comHand2))){
					res = 0;
				}else{
					res = 1;
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
