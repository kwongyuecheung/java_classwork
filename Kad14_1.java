//**********************************
// �ۑ薼 : Kad14_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/02
//**********************************
import java.util.*;
public class Kad14_1 {
	public static void show(String str, int cnt) {
		for (int i = 0; i<= cnt; i ++){
		System.out.println(str);
		}

}

 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try{
System.out.print("�\�������F");
String str = sc.next();
System.out.print("�\���񐔁F");
int cnt = sc.nextInt();
show(str,cnt);
}catch
	(InputMismatchException e){
System.out.print("���͒l���s���ł��B");

}

	}
}