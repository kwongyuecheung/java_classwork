//**********************************
// �ۑ薼 : Kad17_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/21
//**********************************
import java.util.*;

public class Kad17_1{
	public static int linearSearch (String[] data, String key){
		for(int i = 0; i < data.length; i++){
			if(key.substring(0,3).equals(data[i])){
				return i;
			}
		}
		
		return -1;
	}
	public static void main (String[] args){
			Scanner sc = new Scanner(System.in);
			String[] fruitsArray = {"�����S", "������", "������", "�o�i�i", "�C�`�S" };
			System.out.println("�z��̃f�[�^�͈ȉ��̒ʂ�ł��B");
			for(String i: fruitsArray){
				System.out.println(i);
			}
			System.out.print("�T����������͂��Ă��������F");
			String key = sc.next();
			int x = linearSearch(fruitsArray, key);
			if(x == -1){
				System.out.println(key +"��"+"�͌�����܂���ł����B");
			}else{
				System.out.println(key +"��"+ (x+1)+" �ԖڂɌ�����܂����B");
			}
	}
}
