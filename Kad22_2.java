//**********************************
// �ۑ薼 : Kad22_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/08/27
//**********************************
import java.util.*;

public class Kad22_2{
	public static void main (String[] args){
		
			Random rand = new Random();
			Scanner sc = new Scanner(System.in);
			final int STONE = 20; //�����̐΂̐�
			final int TAKEMAX = 4; //����ő吔
			int remStone = STONE; //�c��̐΂̐�
			int takeStone= 0; //������΂̐�
			int turnFlag = 0; //�^�[���t���O(0:�R���s���[�^ 1:�v���C���[)
			int com;
			String[] flag = {"�R���s���[�^", "�v���C���["}; 
			System.out.println("�R���s���[�^�ƐΎ�菟���I");
			
			int ran = rand.nextInt(4)+1;
			System.out.print("�c��F");
			for(int i = 0; i < remStone; i++){
				System.out.print("��");
			}	
			System.out.println("");
			System.out.println("�R���s���[�^�̃^�[���I�R���s���[�^��"+ 4 +"������I");
			System.out.println("");
			remStone = remStone - 4;
			turnFlag = 1;
			while(remStone > 0){	
				while (turnFlag == 0){
					if (remStone <= 5){
						com = remStone -1;
					}else{
						com = 5 - takeStone;
					}
					System.out.print("�c��F");
					for(int i = 0; i < remStone; i++){
						System.out.print("��");
					}	
				System.out.println("");
				System.out.println("�R���s���[�^�̃^�[���I�R���s���[�^��"+ com +"������I");
				System.out.println("");
				remStone = remStone - com;
				if (remStone < 1){
						break;
					}
				turnFlag = 1;
				}
				while (turnFlag == 1){
					System.out.print("�c��F");
					for(int i = 0; i < remStone; i++){
						System.out.print("��");
					}
					System.out.println("");
					System.out.print("�v���C���[�̃^�[���I�����܂����H(1~4)�F");
					try{	
						takeStone = sc.nextInt();
					}catch(InputMismatchException e){
						System.out.println("���͒l���s���ł��B");
						sc.next();
						break;
					}
					if (takeStone < 1 || takeStone > 4){
						System.out.println("���͒l���s���ł��B");
						System.out.println("");
						break;
					}
					remStone = remStone - takeStone;
					System.out.println("");
					if (remStone < 1){
						break;
					}
					turnFlag = 0;
						
					}
			}
			System.out.println("�����F"+flag[turnFlag]+"�̕����I");
	}
}
