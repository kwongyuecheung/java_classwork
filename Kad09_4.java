//**********************************
// 課題名 : Kad09_4
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/18
//**********************************
import java.util.Scanner; 
class Kad09_4 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int score;
	int[ ] freq = new int[10];
	int i; 
	int c;
	System.out.println("テストの点数入力(-1 で入力終了)");
	for (i = 0; i >= 0 ; i++){
		score = sc.nextInt();
		
		if (score < -1 || score > 100){
			System.out.println("ERROR");
		}
		if (score == -1){
			break;
		}
		c = score/10;
		freq[c] = freq[c] + 1;
		if (score == 100){
			freq[9] = freq[9]+1;
		}
	}
	int d = 0;
	int e = 9;
	for (int a = 0; a < freq.length -1; a++){
		System.out.println(d +" --  "+e+ ":"+ freq[a]);
		d = d + 10;
		e = e + 10;
	}
	System.out.println("90 -- 100:"+ freq[9]);

 }
}