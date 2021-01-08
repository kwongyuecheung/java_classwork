//**********************************
// 課題名 : Kad10_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/23
//**********************************
import java.util.Scanner; 
class Kad10_1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[ ][ ] fare = {{0,140,200,280},{140,0,180,240},{200,180,0,160},{280,240,160,0}};
 	int i, j; 
	
	System.out.println("バス停コード(1-4)の 行（乗車駅）を入力してください：");
	i = sc.nextInt();
	System.out.println("バス停コード(1-4)の 列（降車駅）を入力してください：");
	j = sc.nextInt();
	
	if(i == j || i > 4 || i < 1 || j > 4 || j < 1){
	System.out.println("入力エラーです");
	}else{
	System.out.println("バス停" + i + "から"+ j + "までの料金は"+ fare[i-1][j-1] + "円です。");
	}
 }
}