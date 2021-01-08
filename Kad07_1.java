//**********************************
// 課題名 : Kad07_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/02
//**********************************
class Kad07_1 {
 public static void main(String[] args) {
 	
 System.out.println("**** 100までの偶数合計と奇数合計を計算します ****");
 int sum = 0;
 	for (int i = 2 ; i<101; i= i+2){
		sum = sum + i ;
	}
		System.out.println("2+4+6+8+10+･･････････+100 = "+ sum );
		
		int sum2 = 0;
		
		for (int i = 1 ; i<100; i= i+2){
		sum2 = sum2 + i ;
		}
	System.out.println("1+3+5+7+9+･･････････+99 = "+ sum2 );
 	}
 }