//**********************************
// 課題名 : Kad12_4
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/30
//**********************************
import java.util.Scanner;
public class Kad12_4 {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int action; //行動格納変数
//int i = 0; //行動カウンタ
int[] power = {100, 90, 20, 50}; //各キャラの通常攻撃ダメージ
int[] magic = {80, 80, 120, 90}; //各キャラの魔法攻撃ダメージ
int hitPoint = 360; //魔王の体力

System.out.println("魔王ミカラムが現れた！▼");
System.out.println("「お前らを永遠に留年させてやる！」▼");
System.out.println("「単位が欲しくば私を倒してみろ！」");

for(Character bt: Character.values()){
	System.out.print(bt+ "者はどうする？（1:通常攻撃 2:魔法攻撃 他:逃げる）＞");
	action = sc.nextInt();
	switch(action){
	case 1:System.out.println(bt+"の通常攻撃！" + power[bt.ordinal()]+"ダメージ！");
		hitPoint = hitPoint-  power[bt.ordinal()];
		break;
	case 2:System.out.println(bt+"の通常攻撃！" + magic[bt.ordinal()]+"ダメージ！");
		hitPoint = hitPoint-  magic[bt.ordinal()];
		break;
	default:
		System.out.println(bt +"は逃げだした！ しかし回り込まれた！▼");
		System.out.println("「この学校から逃げ出せると思うな！」▼");
	}
	if (hitPoint <= 0){
		break;
	}
}
if (hitPoint <= 0){
	System.out.println("魔王ミカラムを倒した！▼");
	System.out.println("単位を手に入れた！▼");
	System.out.println("「流石だ…ちゃんと進級するんだぞ…」");
	System.out.println("------------ GAME CLEAR -------------");
}else{
	System.out.println("魔王ミカラム を 倒せなかった！▼");
	System.out.println("「来年も１年生を繰り返すがいい！」");
	System.out.println("-------------- BAD END --------------");
}












	} 
enum Character{
勇者, 盗賊, 魔法使い, 僧侶
};


}