//**********************************
// �ۑ薼 : Kad14_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/02
//**********************************
import java.util.*;
public class Kad14_3 {
	public static int check(int n,int ans) {
		int keika;
		if (n == ans){
		keika = 3;
		
		}
		else if(n>ans){
		keika = 1;
		
		}else{
	keika = 2;
		}
		return keika;
	}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rnd = new Random();
int ransu = rnd.nextInt(99);
System.out.println("�����ăQ�[���I(0~99)");
while (true){
		try{
			System.out.print("���Ԃł��傤�H�F");	
			int num = sc.nextInt();
			int ans = check(num,ransu);
			if (ans == 3){
				System.out.println("�����I");
				System.out.print("�I�����܂��B");
				break;
			}else if (ans == 1){
				System.out.println("�����Ə�������I");

			}else{
				System.out.println("�����Ƒ傫����I");
			
			}
		}catch(InputMismatchException e){
					System.out.println("���͒l���s���ł��B");
					System.out.print("�I�����܂��B");
					break;
					}
}
	
}
}
