//**********************************
// �ۑ薼 : Kad13_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/02
//**********************************
import java.util.Scanner;
public class Kad13_1 {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

try{
	System.out.print("���l 1 ����́F");
	String str = sc.next();
	int num1 = Integer.parseInt(str);
	System.out.print("���l 2 ����́F");
	str = sc.next();
	int num2 = Integer.parseInt(str);
	System.out.println(num1+" + "+num2+" = "+(num1+num2));
}catch(NumberFormatException e) {
System.out.println("���l�^�ϊ��G���[���������܂����B");
}





	}
}