//**********************************
// 課題名 : Kad07_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/04
//**********************************
import java.util.Scanner;
class Kad07_3 {
 public static void main(String[] args) {
 	
 	Scanner sc = new Scanner(System.in);
	System.out.println("アスタリスク(*)で四角形を描画します。");
	
	int i , j ;
	System.out.println("四角形の高さを入力して下さい =>");
	
	int h = sc.nextInt();
	System.out.println("四角形の幅を入力して下さい ===>");
	
	int w = sc.nextInt();
	for(i=0;i<h;i++){
		
		for(j=0;j<w;j++){
			System.out.print("♯");
		}
		System.out.println(" ");
	}
	
	
	
	
 }
}