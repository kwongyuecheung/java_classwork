//**********************************
// �ۑ薼 : Kad13_4
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/02
//**********************************
import java.util.*;
public class Kad13_4 {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] data =new int [3];
int i = 0;
try{
	while(true){
	System.out.print((i+1)+"�ڂ̐��l����́F");
    data[i] = sc.nextInt();
	i++;
	}
}catch(ArrayIndexOutOfBoundsException e){
System.out.println(e+"���������܂����B");
}catch(InputMismatchException e){
System.out.println(e+"���������܂����B");
}finally{
System.out.print("�I�����܂��B");
}




	}
}