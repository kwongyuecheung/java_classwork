//**********************************
// �ۑ薼 : Kad16_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/16
//**********************************
import java.util.*;

public class Kad16_1{
	public static String runLength (String a){
		
		int count = 1; 
		int index = 0; 
		String outStr = ""; 
		String subStr; 
		
		subStr = a.substring(index,index+1);
		
		while(index < (a.length()-1)){
			
			if(subStr.equals(a.substring(index+1,index+2))){
				
				count++;
				
			}else{
				outStr = outStr +"$"+ subStr +":"+ count+" ";
				subStr = a.substring(index+1,index+2);
				count = 1;
			}
			index++;
		}
		outStr = outStr +"$"+ a.substring(index,index+1) +":"+ count;
		return outStr;
	}
	public static void main (String[] args){
		
			Scanner sc = new Scanner(System.in);
			System.out.println("----- ���������O�X�@ -----");
			System.out.print("��������́F");
			String inStr = sc.next();
			
			String hensu = runLength(inStr);
			System.out.print(hensu);
		
			
	}
}
