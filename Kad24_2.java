//**********************************
// �ۑ薼 : Kad24_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/09/03
//**********************************
import java.util.*;
public class Kad24_2{
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
				if(card[i][j] == 0){
					System.out.print("  |  " + "x" + "  |  ");
				}else{
					System.out.print("  |  " + card[i][j] + "  |  ");
				}
			}
			System.out.println("\n");
		}
		System.out.println("-----------------------------------\n");
	}
	public static void checkHit(int[][] card, int ball){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(card[i][j] == ball){
					card[i][j] = 0;
				}
			}
		}
	}
	public static boolean checkBingo(int[][] card){
		int sum1;
		int sum2;
		int sum3 = 0;
		int sum4 = 0;
		for(int i = 0; i < card.length; i++){
			sum3 += card[i][i];
			sum4 += card[2-i][i];
			sum1 = sum2 = 0;
			for(int j = 0; j < card.length; j++){
				sum1 += card[i][j];
				sum2 += card[j][i];
			}
			if(sum1 == 0 || sum2 == 0){
				return true;
			}
		}
		if(sum3 == 0 || sum4 == 0){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		int bingoCard[][] = createCard();
		int bingoBall;
		Scanner sc = new Scanner(System.in);
		System.out.println("BINGO �Q�[���I���Ȃ��̃J�[�h�͂�����ł��B");
		showCard(bingoCard);
		while(true){
			try{
				System.out.print("��׶�׶��...���Ԃ̋ʂ��o�܂������H�F");
				bingoBall = sc.nextInt();
				
				checkHit( bingoCard, bingoBall);
				showCard(bingoCard);
				
				if(checkBingo(bingoCard) == true){
					break;
				}
			}catch(InputMismatchException e){
				System.out.println("���͒l���s���ł��B\n");
				sc.next();
			}
		}
		System.out.print("BINGO!!!!!!!!!!!!!!!!!!");
	}
	
}
