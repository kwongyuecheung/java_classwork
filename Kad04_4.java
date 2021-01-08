//**********************************
// 課題名 : Kad04_4
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/18
//**********************************
import java.util.Scanner; 
class Kad04_4 {
 public static void main(String[] args) {
 System.out.println("**** 面積計算をします ****");
 System.out.println("円と3角形のどちらの面積を求めますか？(円:0, 3角形:3)-->");
 Scanner sc = new Scanner(System.in);
 int flg = sc.nextInt();

if (flg == 0){
System.out.println("円の半径(m)を入力して下さい：");
double size = sc.nextDouble();
System.out.println("半径"+ size+"mの円の面積は "+ (size*2* Math.PI+"㎡です。"));
}else if(flg == 3){
System.out.println("底辺の長さ(m)を入力して下さい：");
double size = sc.nextDouble();
System.out.println("高さ(m)を入力して下さい：");
double height = sc.nextDouble();
double area = ((size * height)/2);
System.out.println("底辺"+ size +"m,高さ"+ height+"mの3角形面積は"+ area+"㎡です");
}else if(!(flg==0||flg == 3)){
System.out.println("--- エラー --- (0か3以外の数値が入力されました)");	
}
}
}