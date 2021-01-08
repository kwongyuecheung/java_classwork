//**********************************
// 課題名 : Kad03_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/18
//**********************************
class Kad03_2 {

  public static void main(String[] args) {
  int numA = 2500, numB = 49800; //A の個数, B の個数
int priceA = 15, priceB = 2; //A の単価, B の単価

	
	
 	System.out.println("商品 A 2500 * 15 = " + (numA*priceA));
	System.out.println("商品 B 49800 * 2 = " + (numB*priceB));
	System.out.println("--------------------------------");
	int sumA =(numA*priceA) , sumB=(numB*priceB) , sum = (sumA+sumB); //A の小計, B の小計, 合計

	System.out.println("合計\t\t" + (sum));
	double tax =sum*0.1 , total= sum*1.1; //消費全, 消費税込み合計
	System.out.println("消費税(10%)\t" + tax);
	System.out.println("消費税(10%)\t" +total);
 	}
 }
 