//**********************************
// 課題名 : Kad19_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/28
//**********************************
import java.util.*;

public class Kad19_1{
	public static void insertSort (int[] data){
		int len = data.length;
		int temp;
		for(int i = 1; i < len; i++){
			int j = i;
			while(j > 0 && data[j - 1] > data[j]){
				temp = data[j];
				data[j] = data[j - 1];
				data[j - 1] = temp;
				j--;
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
		insertSort(num);
		System.out.println("------ 選択ソート完了 ------");
	}
}
