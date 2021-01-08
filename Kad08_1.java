//**********************************
// 課題名 : Kad08_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/11
//**********************************
class Kad08_1 {
	
	public static void main(String[] args) {

	int[] a = {10, 15, 20, 50, 55}; 
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
    sum = sum + a[i];
  	System.out.print("a["+i+"]="+ a[i]+",  ");
}
	System.out.print( "total ="+ sum);
	
	
 }
}