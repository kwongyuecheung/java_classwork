//**********************************
// �ۑ薼 : Kad11_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/25
//**********************************
 import java.util.Scanner;
class Kad11_2 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String str1 = "ECC";
	String str2 = "comp";
 	String entry; 
	System.out.println("������ 1�F" + str1);
	System.out.println("������ 2�F" + str2);
	str1 = str1 + str2;
	System.out.println("������A���F"+ str1);
	
	
	System.out.println("�����񒷁F�F" + str1.length());
	System.out.print("��������́F");
	entry = sc.next();
	if (str1.equals(entry)){
		System.out.println(str1 + " = " + entry);
	}else{
		System.out.println(str1 + " �� " + entry);
	}
	}
}