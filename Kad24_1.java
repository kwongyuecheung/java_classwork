//**********************************
// �ۑ薼 : Kad24_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/09/03
//**********************************
import java.util.*;
public class Kad24_1{
	public static Random rnd = new Random(); //�N���X�ϐ�
	
	public static int[][] createCard(){
		int card[][] = new int[3][3]; //���l�i�[�z��
		int ransu = 0; //�����i�[�ϐ�
		boolean[] ransuFlag = new boolean[9]; //�����t���O(true:�g�p�� false:���g�p)
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				do{
					ransu = rnd.nextInt(9);
				}
				while(ransuFlag[ransu]);
				card[i][j] = ransu + 1;
				ransuFlag[ransu] = true;
				
			}
		}
		return card;
	}
	public static void showCard(int[][] card){
		for(int i = 0; i < 3; i++){
			System.out.print("\n");
			System.out.println("-----------------------------------\n");
			for(int j = 0; j < 3; j++){
				System.out.print("  |  " + card[i][j] + "  |  ");
			}
			System.out.println("\n");
		}
		System.out.println("-----------------------------------\n");
	}
	public static void main(String[] args){
		int bingoCard[][] = createCard();
		System.out.println("BINGO �Q�[���I���Ȃ��̃J�[�h�͂�����ł��B");
		showCard(bingoCard);
		
	}
	
}
