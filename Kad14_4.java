//**********************************
// 課題名 : Kad14_4
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/07
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
System.out.println("西暦を入力してください：");
int year = sc.nextInt();
System.out.println("月を入力してください：");
int month = sc.nextInt();
if (month>12 || month < 1){
	System.out.println("入力値が不正です。");
	System.exit(1);
}
int day = getDayOfMonth(year,month);
System.out.println(year+"年"+month+"月の日数は"+day+"日です。");
}catch(InputMismatchException e){
					System.out.println("入力値が不正です。");
				
				
				}

}
}
