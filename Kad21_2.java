//**********************************
// 課題名 : Kad21_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/08/5
//**********************************
import java.util.*;

public class Kad21_2{
	public static void main (String[] args){
		try{
			Random rand = new Random();
			Scanner sc = new Scanner(System.in);
			final int WIN = 0, LOSE = 1, DROW = 2;
			int[][] result = {{2,0,1},{1,2,0},{0,1,2}}; //プレイヤー視点の結果
			int playHand, comHand, comHand2; //それぞれがが出した手
			int i = 0;
			int res;
			String[] textHand = {"グー", "チョキ","パー"};
			String[] textResult = {"勝ったぞ！","負けちゃった！","あいこだ！" };
			System.out.println("二台のコンピュータとじゃんけん勝負！(3 勝で終了)");
			while(i < 3){
				System.out.print("どの手を出す？(0:グー 1:チョキ 2:パー)：");
				System.out.println("プレイヤー："+ textHand[playHand = sc.nextInt()]);
				System.out.println("コンピュータ 1："+textHand[comHand = rand.nextInt(3)]);
				System.out.println("コンピュータ 2："+textHand[comHand2 = rand.nextInt(3)]);
				if ((comHand == comHand2)||(playHand == comHand2)){
					res = result[playHand][comHand];
				}else if(playHand == comHand){
					res = result[playHand][comHand2];
				}else{
					res = 2;
				}
				System.out.print(textResult[res]);
				if(res == 0){
					i++;
				}
				System.out.println("("+ i + "勝"+")");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.print("入力値が不正です。");
		}catch(InputMismatchException e){
			System.out.print("入力値が不正です。");
		}
	}
}
