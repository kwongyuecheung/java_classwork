//**********************************
// 課題名 : Kad09_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/18
//**********************************
import java.util.Scanner; 
class Kad09_2 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double[ ] num = new double[5];
	double total = 0;
	int i;
	
	System.out.println("--- 入力 ---");
	
	for ( i = 0 ; i < num.length ; i ++){
			System.out.print("配列 num[" + i + "] = ");
			num[i] = sc.nextDouble();
			total = total + num[i];
	}
	double max = num[0];
	double min = max;
	
	for (double j: num){
	
		if (j > max){
			max = j;
		
		}
		if (j < min){
			min = j;
		
		}
	}
	System.out.println("--- 拡張 for 文による計算結果 ---");
	
	System.out.println("最大値="+ max +"：最小値="+ min + "：合計値=" + total);
	
	
 }
}