//**********************************
// �ۑ薼 : Kad13_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/02
//**********************************
import java.util.*;
public class Kad13_3 {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] data = {100, 200, 300};
int i = 0;
try{
	System.out.println("�z��̃f�[�^�͈ȉ��̒ʂ�ł��B");
	while(i < data.length){
	System.out.println("data["+i+"] = "+ data[i]);
	i++;
	}
	System.out.print("���Ԗڂ̃f�[�^�����o���܂����H�F");
	int num = sc.nextInt();
	System.out.print(data[num]+"�����o���܂����B");
}catch(ArrayIndexOutOfBoundsException e){
System.out.print("���̗v�f�Ƀf�[�^�͑��݂��܂���B");
}catch(InputMismatchException e){
System.out.print("���͒l���s���ł��B");
}




	}
}