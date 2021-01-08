//**********************************
// 課題名 : Kad05_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad05_2 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("今、何月ですか？：");

 


int month = sc.nextInt();


switch(month){
		case 1:
		case 12:
		case 2:
	System.out.print("冬です。寒いのは嫌いです！");
	break;
		case 3:
		case 4:
		case 5:
	System.out.print("春です。良い季節です！");
	break;
		case 6:
		case 7:
		case 8:
	System.out.print("夏です。少し暑いです！");
	break;
		case 9:
		case 10:
		case 11:
	System.out.print("秋です。食べ物がおいしい季節です！");
	break;
	
	default:
	System.out.println("月は 1～12 までです。");
	
}
}
}