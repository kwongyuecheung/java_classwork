//**********************************
// 課題名 : Kad05_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad05_3 {
 	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
 	System.out.println("** 割引計算をします **");

 	System.out.print("定価：");
	int price = sc.nextInt();
	System.out.print("割引(5%->1,10%->2,15%->3)：");
	int discount = sc.nextInt();
	double a;

				switch(discount){
					case 1:
					a = price*0.95;
						break;
					case 2:
					a = price*0.9;
						break;
					case 3:
					a = price*0.85;
						break;
					default:
				   	a = price;
				}
			System.out.print("販売価格："+ a +" 円です");	
		}
}