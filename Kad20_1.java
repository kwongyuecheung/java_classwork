//**********************************
// �ۑ薼 : Kad20_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/30
//**********************************
import java.util.*;

public class Kad20_1{
	public static int func (int i){
		if(i > 1){
			int x = func(i - 1);
			return i * x;
		}else{
			return 1;
		}	
	}
	public static void main (String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("-----�K��v�Z����-----");
			System.out.print("���l����͂��Ă�������(0~10)�F");
			int inNum = sc.nextInt();
			if(inNum > 10 || inNum < 0){
				System.out.println("���͒l���͈͊O�ł��B");
			}else{
				System.out.print(inNum + "�̊K���" + func(inNum) +"�ł��B");
			}
		}catch(InputMismatchException e){
			System.out.print("���͒l���s���ł��B");
		}
	}
}
