//**********************************
// �ۑ薼 : Kad23_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/09/01
//**********************************
import java.util.*;
public class Kad23_1{
	public static Random rnd = new Random(); //�N���X�ϐ�
	public static void shuffle(int[] data){
		int i, j, tmp; //�J�E���^�E�ޔ�ϐ�
		for(i = (data.length - 1); i >= 1; i--){
			j = rnd.nextInt(i);
			tmp = data[j];
			data[j] = data[i];
			data[i] = tmp;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int MAXNUMBER = 5; //�ő吔
		int lackNumber = 0; //���b�N�i���o�[�i�[�ϐ�
		int[] numbers = new int[MAXNUMBER]; //���l�i�[�z��
		int ans;
		while(true){
			try{
				for(int i = 0; i < MAXNUMBER; i++){
					numbers[i] = i + 1;
				}
				shuffle(numbers);
				lackNumber = numbers[0];
				
				System.out.println("���b�N�i���o�[�T�[�`�I");
				for(int i = 1; i < MAXNUMBER; i++){
					System.out.print(numbers[i] + " ");
				}
				System.out.println(" ");
				System.out.print("�����Ă��鐔�l����͂��Ă�������(1~" +MAXNUMBER + ")�F");
				ans = sc.nextInt();
				if(ans == lackNumber){
					System.out.println("�����I");
					break;
				}else{
					System.out.println("�s�����I\n");
				}
			
			}catch(InputMismatchException e){
				System.out.println("���͒l���s���ł��B\n");
				sc.next();
			}
		}
	}
}
