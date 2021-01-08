//**********************************
// 課題名 : Kad09_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/18
//**********************************
import java.util.Scanner; 
class Kad09_3 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[ ] data = {10,3,1,4,2,5,7,8,9,6}; 
	int i = 0;
	int j = 0;
	System.out.print("検索対象の配列データは、");
	for(int a : data){
		
		System.out.print( a + " ");
		
	}
	System.out.println("です。");
	System.out.print("1 から 10 までの検索値を入力してください：");
	int	findIndex = sc.nextInt();
	
	for (i = 0; i < data.length; i++){
		if (findIndex == data[i]){
			j = i;
		}
	}
	
	
	System.out.print("検索値 "+findIndex+" は "+ (j+1) +" 番目にあります。");
	
 }
}