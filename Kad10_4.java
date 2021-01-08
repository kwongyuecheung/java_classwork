//**********************************
// 課題名 : Kad10_4
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/23
//**********************************

class Kad10_4 {
	
	public static void main(String[] args) {
	
	final int LEN = 5; //一次元配列の長さ
	char[][] triangle = {{'■','□','□','□','□'},
 						{'■','■','□','□','□'},
						{'■','■','■','□','□'},
 						{'■','■','■','■','□'},
 						{'■','■','■','■','■'}};
	int i, j; //ループカウンタ
	
	
	for(i = 0; i < triangle.length; i++){
		for(j = 0; j < triangle[i].length; j++){
		System.out.print(triangle[i][LEN -1 - j]);
		
		}
		System.out.println(triangle[i]);
	}
	for(i = 0; i < triangle.length; i++){
		for(j = 0; j < triangle[i].length; j++){
		System.out.print(triangle[LEN -1 - i][LEN -1 -j]);
		
		}
		System.out.println(triangle[LEN -1 - i]);
	}
 }
 
}