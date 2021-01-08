//**********************************
// 課題名 : Kad24_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/09/03
//**********************************
import java.util.*;
public class Kad24_1{
	public static Random rnd = new Random(); //クラス変数
	
	public static int[][] createCard(){
		int card[][] = new int[3][3]; //数値格納配列
		int ransu = 0; //乱数格納変数
		boolean[] ransuFlag = new boolean[9]; //乱数フラグ(true:使用済 false:未使用)
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				do{
					ransu = rnd.nextInt(9);
				}
				while(ransuFlag[ransu]);
				card[i][j] = ransu + 1;
				ransuFlag[ransu] = true;
				
			}
		}
		return card;
	}
	public static void showCard(int[][] card){
		for(int i = 0; i < 3; i++){
			System.out.print("\n");
			System.out.println("-----------------------------------\n");
			for(int j = 0; j < 3; j++){
				System.out.print("  |  " + card[i][j] + "  |  ");
			}
			System.out.println("\n");
		}
		System.out.println("-----------------------------------\n");
	}
	public static void main(String[] args){
		int bingoCard[][] = createCard();
		System.out.println("BINGO ゲーム！あなたのカードはこちらです。");
		showCard(bingoCard);
		
	}
	
}
