//**********************************
// 課題名 : Kad21_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/08/5
//**********************************
import java.util.*;

public class Kad21_1{
	
	public static void main (String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			final int WIN = 0, LOSE = 1, DROW = 2;
			int[][] result = {{DROW,WIN,LOSE},{LOSE,DROW,WIN},{WIN,LOSE,DROW}}; //プレイヤー視点の結果
			int playHand, comHand; //それぞれがが出した手
			
			String[] textHand = {"グー", "チョキ","パー"};
			String[] textResult = {"勝ったぞ！","負けちゃった！","あいこだ！" };
			
			Random rand = new Random();
			int ran = rand.nextInt(3);
			
			System.out.println("コンピュータとじゃんけん勝負！");
			
			System.out.print("どの手を出す？(0:グー 1:チョキ 2:パー)：");
			System.out.println("プレイヤー："+ textHand[playHand = sc.nextInt()]);
			System.out.println("コンピュータ："+textHand[comHand = ran]);
			System.out.println(textResult[result[playHand][comHand]]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.print("入力値が不正です。");
		}catch(InputMismatchException e){
			System.out.print("入力値が不正です。");
		}
	}
}
