//**********************************
// �ۑ薼 : Kad09_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/18
//**********************************
import java.util.Scanner; 
class Kad09_1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[ ] str = new String[3];
	
	System.out.println("--- ���� ---");
	
	for ( int i = 0 ; i < str.length ; i ++){
			System.out.print("�z�� str[" + i + "] = ");
			str[i] = sc.next();
	}
	
	System.out.println("--- �g�� for ���ɂ��\�� ---");
	int i = 0;
	for (String j : str){
			System.out.println("�z�� str[" + i + "] = " + j);
			i++;
	}
 }
}