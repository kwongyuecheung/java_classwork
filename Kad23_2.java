//**********************************
// 課題名 : Kad23_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/09/01
//**********************************
import java.util.*;
public class Kad23_2{
	public static Random rnd = new Random(); //クラス変数
	public static void shuffle(int[] data){
		int i, j, tmp; //カウンタ・退避変数
		for(i = (data.length - 1); i >= 1; i--){
			j = rnd.nextInt(i);
			tmp = data[j];
			data[j] = data[i];
			data[i] = tmp;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int MAXNUMBER = 9; //最大数
		int doubleNumber = 0; //ラックナンバー格納変数
		int[] numbers = new int[MAXNUMBER + 1]; //数値格納配列
		int a;
		while(true){
			try{
				doubleNumber = (rnd.nextInt(MAXNUMBER)) + 1;
				for(int i = 0; i <= MAXNUMBER - 1; i++){
					numbers[i] = i + 1;
				}
				numbers[MAXNUMBER] = doubleNumber;
				shuffle(numbers);
				System.out.println("ダブルナンバーサーチ！");
				for(int i = 0; i <= MAXNUMBER; i++){
					System.out.print(numbers[i] + " ");
				}
				System.out.println(" ");
				System.out.print("重複している数値を入力してください(1~"+ MAXNUMBER +")：");
				a = sc.nextInt();
				if(a == doubleNumber){
					System.out.println("正解！");
					break;
				}else{
					System.out.println("不正解！\n");
				}
			
			}catch(InputMismatchException e){
				System.out.println("入力値が不正です。\n");
				sc.next();
			}
		}
	}
}
