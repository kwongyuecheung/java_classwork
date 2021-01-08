//**********************************
// 課題名 : Kad05_4
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad05_4 {
	public static void main(String[] args) {


	System.out.println("整数を2つ入力して下さい");
	Scanner sc = new Scanner(System.in);
	 
	
	System.out.print("整数1 = ");
	int num1 = sc.nextInt();
	
	System.out.print("整数2 = ");
	int num2 = sc.nextInt();
	
	System.out.print("[1:加算/2:減算/3:乗算/4:整数除算/5:剰余] ==>");
	int rule = sc.nextInt();
	long ans = 0;
		switch(rule){
			case 1:
			ans = (num1+num2);
			break;
			case 2:
			ans = (num1-num2);
			break;
			case 3:
		    ans = (num1*num2);
			break;
			case 4:
			if(num2 == 0){
				System.out.print("エラー：ゼロ除算です");
				System.exit(1);
			}else{
			int r = num1/num2;
			ans = r;
			}
			break;
			case 5:
			ans = (num1%num2);
			break;
			default:
			System.out.println("入力エラー(1～5 の数字を入力して下さい) ");
			System.exit(1);
			}	
		System.out.print("答は" + ans);
	}
}