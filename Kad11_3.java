//**********************************
// 課題名 : Kad11_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/25
//**********************************
 import java.util.Scanner;
 import java.util.Random; //Random クラスを使用するためのインポート文
class Kad11_3 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();
	
	String[] kuji = {"大吉", "吉", "中吉", "小吉", "末吉", "凶"};
	
	System.out.println("■おみくじを引く（凶が出たら終了）1:実行、0:終了");
	int flag = sc.nextInt();
	int n = rnd.nextInt(6);	
	while (flag == 1 && n!=5){
		
		
		System.out.println("おみくじの結果:"+ kuji[n]);
		
		System.out.println("■おみくじを引く（凶が出たら終了）1:実行、0:終了");
		flag = sc.nextInt();
		n = rnd.nextInt(6);	
	}
	if(flag == 1 && n == 5){
		System.out.println("おみくじの結果:"+ kuji[n]);
		System.out.println("凶が出たので終了します。");
		
	}
		
	}
}