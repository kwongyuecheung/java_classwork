//**********************************
// 課題名 : Kad13_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/02
//**********************************
import java.util.*;
public class Kad13_3 {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] data = {100, 200, 300};
int i = 0;
try{
	System.out.println("配列のデータは以下の通りです。");
	while(i < data.length){
	System.out.println("data["+i+"] = "+ data[i]);
	i++;
	}
	System.out.print("何番目のデータを取り出しますか？：");
	int num = sc.nextInt();
	System.out.print(data[num]+"を取り出しました。");
}catch(ArrayIndexOutOfBoundsException e){
System.out.print("その要素にデータは存在しません。");
}catch(InputMismatchException e){
System.out.print("入力値が不正です。");
}




	}
}