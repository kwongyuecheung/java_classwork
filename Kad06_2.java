//**********************************
// 課題名 : Kad06_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad06_2 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("目標金額を入力してください：");
 int target = sc.nextInt();
 int sav = 1;
 int day = 0;
 int sum = 0;
 while(sum < target){
 
 sav += sav ;
 day++ ;
 	
sum = sav;
 }
 System.out.print(day+"日で"+sum+"円貯金できます。");
}
}