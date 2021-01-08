//**********************************
// 課題名 : Kad13_4
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/02
//**********************************
import java.util.*;
public class Kad13_4 {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] data =new int [3];
int i = 0;
try{
	while(true){
	System.out.print((i+1)+"つ目の数値を入力：");
    data[i] = sc.nextInt();
	i++;
	}
}catch(ArrayIndexOutOfBoundsException e){
System.out.println(e+"が発生しました。");
}catch(InputMismatchException e){
System.out.println(e+"が発生しました。");
}finally{
System.out.print("終了します。");
}




	}
}