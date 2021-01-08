//**********************************
// 課題名 : Kad22_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/08/27
//**********************************
import java.util.*;

public class Kad22_1{
	public static void main (String[] args){
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		final int STONE = 20; //初期の石の数
		final int TAKEMAX = 4; //取れる最大数
		int remStone = STONE; //残りの石の数
		int takeStone= 0; //取った石の数
		int turnFlag = 0; //ターンフラグ(0:コンピュータ 1:プレイヤー)
		String[] flag = {"コンピュータ", "プレイヤー"}; 
		System.out.println("コンピュータと石取り勝負！");
		while(remStone > 0){
			while (turnFlag == 0){
				int ran = rand.nextInt(4)+1;
				System.out.print("残り：");
				for(int i = 0; i < remStone; i++){
					System.out.print("●");
				}	
				System.out.println("");
				System.out.println("コンピュータのターン！コンピュータは"+ran+"個取った！");
				System.out.println("");
				remStone = remStone - ran;
				if (remStone < 1){
					break;
				}
				turnFlag = 1;
			}
			while (turnFlag == 1){
				
				
				System.out.print("残り：");
				for(int i = 0; i < remStone; i++){
					System.out.print("●");
				}
				System.out.println("");
				System.out.print("プレイヤーのターン！何個取りますか？(1~4)：");
				try{	
					takeStone = sc.nextInt();
				}catch(InputMismatchException e){
					System.out.println("入力値が不正です。");
					sc.next();
					break;
				}
				if (takeStone < 1 || takeStone > 4){
					System.out.println("入力値が不正です。");
					System.out.println("");
					break;
				}
				remStone = remStone - takeStone;
				System.out.println("");
				if (remStone < 1){
					break;
				}
				turnFlag = 0;
				
			}
			
		}
		System.out.println("決着："+flag[turnFlag]+"の負け！");
	
	}
}
