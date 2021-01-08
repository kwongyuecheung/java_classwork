//**********************************
// �ۑ薼 : Kad16_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/16
//**********************************
import java.util.*;

public class Kad16_2{
	public static int bruteForce (String search, String data){
		int x = -1;
		int dc = 0; 
		int sc = 0; 
		
		while(dc < data.length() && sc < search.length()){
			if(data.charAt(dc)== search.charAt(sc)){
				
				sc++;
				
			}else{
				
				sc = 0;
				
			}
			dc++;
		}
		if (sc > 0){
			return dc - sc + 1;
		}else{
			return x;
		}
	
	}
	public static void main (String[] args){
			Scanner sc = new Scanner(System.in);
			
			final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			System.out.println("------------ �͔C���@ ------------");
			System.out.println("�f�[�^�FABCDEFGHIJKLMNOPQRSTUVWXYZ");
			System.out.print("�������������͂��Ă��������F");
			String findword = sc.next();
			
			int result = bruteForce(findword,ALPHABET);
			if (result > 0){
				System.out.print(findword+"��"+result+" �����ڂɌ�����܂����B");
			}else{
				System.out.print(findword+"�͌�����܂���ł����B");
			}

	}
			
	}

