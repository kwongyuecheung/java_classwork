//**********************************
// 課題名 : Kad08_4
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/16
//**********************************
import java.util.Scanner; 
class Kad08_4 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int dec;
	int[] bit = new int[256] ;
	int i ;
	
	System.out.print("正の整数を入力して下さい：");
	dec = sc.nextInt();
	
	for(i = 0; dec > 0 ; i++){
	bit[i] = dec % 2;
	dec = dec/2;
	}
	System.out.print("2 進数に変換：");
	while(i > 0){
		System.out.print(bit[i-1]);
		i--;
	}
 }
}