//**********************************
// �ۑ薼 : Kad11_4
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/25
//**********************************
 import java.util.*;
class Kad11_4 {
	
	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	int thisYear = Calendar.getInstance().get(Calendar.YEAR);
	
	System.out.println("���݂�"+ thisYear + "�N�ł��B");
	String[] wareki = {"�吳", "���a", "����", "�ߘa"};
	int[] nen = {1912,1925,1989,2019};
	System.out.print("���a���N�𐼗�œ���(0 �ŏI��):");
	int year = sc.nextInt();
	while(year != 0){
	
	System.out.println("�N��F"+(thisYear-year)+"��");
	int i = 0;
	while (year>= nen[i]&& i < nen.length){
		i++;
	}
	System.out.println("�a��:" +wareki[i-1]+(year - nen[i-1]+1)+"�N" );
	System.out.print("���a���N�𐼗�œ���(0 �ŏI��):");
	year = sc.nextInt();
	
	}
	System.out.println("���肪�Ƃ��������܂����B");
	}
		
	
}