//**********************************
// �ۑ薼 : Kad15_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/14
//**********************************
import java.util.*;

public class Kad15_2{
	public static boolean[] eratosthenes (int n){
		
		boolean[] flag = new boolean[n+1];
		for (int i = 2; i <= n; i++){
			flag[i] = true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++){
			for (int j = i*2 ; j <= n; j+=i){
						flag[j] = false;
						
					
			}
		}
		return flag;
	}
	
	public static void main (String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("������܂ł̑f�������߂܂����H�F");
			int x = sc.nextInt();
			
			boolean[] primeNumFlag = eratosthenes(x);
			
			for(int i = 2;i <= x ; i++){
				 if(primeNumFlag[i] == true){
 					System.out.print(i+" ");
				}
			}
			}catch(InputMismatchException e){
			System.out.print("���͒l���s���ł��B");
			}catch (ArithmeticException e){ 
	        System.out.println("0 ���Z�͂ł��܂���B");
      	}

	}
}
