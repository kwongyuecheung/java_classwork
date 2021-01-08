//**********************************
// 課題名 : Kad18_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/28
//**********************************
import java.util.*;

public class Kad18_2{
	public static void bubbleSort (int[] data){
		int len = data.length;
		int temp = 0;
		for(int i = 0; i < (len - 1); i++){
			for(int j = 1 ; j < len; j++){
				if(data[j - 1] > data[j]){
					temp = data[j - 1];
					data[j - 1] = data[j];
					data[j] = temp;
				}
			}
			printArray(data);
		}
	}
	public static void printArray (int[] data){
		for(int n : data){
			System.out.print(n+" ");
		}	
		System.out.println("");
	}
	public static void main (String[] args){
			
		int[] num = {22,50,88,11,44,70,30,66,90,6};
		System.out.println("--------- 元データ ---------");
		printArray(num);
		System.out.println("------ 選択ソート開始 ------");
		bubbleSort(num);
		System.out.println("------ 選択ソート完了 ------");
	}
}
