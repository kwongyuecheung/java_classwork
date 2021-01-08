//**********************************
// �ۑ薼 : Kad14_4
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/07
//**********************************
import java.util.*;
public class Kad14_4 {
	public static boolean isLeapYear(int year) {
		boolean leap;
		if (year%4 == 0 && year%100 !=0){
			leap = true;
		}else if (year%400 == 0){
			leap = true;
		}else{
			leap = false;
		}
		return leap;
	}
	public static int getDayOfMonth(int year, int month) {
		int day;
		int[] lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		boolean leap = isLeapYear(year);
		if (leap == true){
		lastDay[1] = lastDay[1]+1;
		}
		day = lastDay[(month-1)];
		return day;
	}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try{
System.out.println("�������͂��Ă��������F");
int year = sc.nextInt();
System.out.println("������͂��Ă��������F");
int month = sc.nextInt();
if (month>12 || month < 1){
	System.out.println("���͒l���s���ł��B");
	System.exit(1);
}
int day = getDayOfMonth(year,month);
System.out.println(year+"�N"+month+"���̓�����"+day+"���ł��B");
}catch(InputMismatchException e){
					System.out.println("���͒l���s���ł��B");
				
				
				}

}
}
