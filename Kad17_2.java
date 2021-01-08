//**********************************
// 課題名 : Kad17_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/21
//**********************************
import java.util.*;

public class Kad17_2{
	public static int binarySearch (int[] data, int key){
		int min = 0;
		int max = data.length;	
			
		for(int i = 0; i < data.length;i++){
			int mid = (min + max)/2;
			if(key < data[mid]){
				max = mid - 1;
			}else if (key > data[mid]){
				min = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;
	}

	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numArray = {10,20,30,40,50,60,70,80,90,100,200};
		System.out.println("配列のデータは以下の通りです。");
		for(int i: numArray){
		System.out.println(i);
		}
		try {
			System.out.print("検索数値を入力してください：");
			int inNum = sc.nextInt();
			int index = binarySearch(numArray,inNum);
			if (index == -1){
				System.out.println(inNum +"は見つかりませんでした。");
			}else{
				System.out.println(inNum +"は "+(index+1)+" 番目に見つかりました。");
			}
		}catch(InputMismatchException e){
			System.out.print("入力値が不正です。");
		}
	}
}
