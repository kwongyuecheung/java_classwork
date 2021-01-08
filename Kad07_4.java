//**********************************
// 課題名 : Kad07_4
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/09
//**********************************
class Kad07_4 {
	
	public static void main(String[] args) {

		int i , j ;
		int h = 10;
		
		System.out.println(" |1 2 3 4 5 6 7 8 9");
		System.out.println("---------------------");
		for(i = 1 ; i < h ; i++){
			System.out.print(i+ "|");
			for(j= 1; j < h ; j++){
				System.out.print(i*j + " ");
			}
			System.out.println("\n");
	}
	
	
	
	
 }
}