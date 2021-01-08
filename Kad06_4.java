//**********************************
// 課題名 : Kad06_4
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad06_4 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int num; //整数格納用
 int total = 0; //合計格納用
 int count = 0; //入力回数カウンタ
 System.out.println("整数を入力して下さい：");
 System.out.print((count+1)+" 個目：");
 num = sc.nextInt(); //整数格納用

 while(num != -1){
 	 total= total + num;
	  count ++;
 	System.out.print((count+1)+" 個目：");
	 num = sc.nextInt(); //整数格納用

}

 if (count != 0){
 System.out.print("合計＝"+ total+", 平均＝"+(total/count));
}
}
}