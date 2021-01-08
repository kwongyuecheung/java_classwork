//**********************************
// 課題名 : Kad20_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/30
//**********************************
import java.util.*;

public class Kad20_2{
	public static void quickSort (int[] data, int left, int right){
		if(left >= right){
			return;
		}
		int pivot = data[(right + left)/2];
		int searchLeft = left;
		int searchRight = right;
		int temp;
		
		while(searchLeft <= searchRight){
			while(data[searchLeft] < pivot){
				searchLeft++;
			}
			while(data[searchRight] > pivot){
				searchRight--;
			}
			if(searchLeft <= searchRight){
				temp = data[searchLeft];
				data[searchLeft] = data[searchRight];
				data[searchRight] = temp;
				searchLeft++;
				searchRight--;
			}
		}	
		printArray(data);//途中経過確認
		quickSort(data, left, searchRight);
		quickSort(data, searchLeft, right);
	}
	public static void printArray (int[] data){
		for(int n : data){
			System.out.print(n+" ");
		}	
		System.out.println("");
	}
	public static void main (String[] args){
			
		//int[] num = {22,50,88,11,44,70,30,66,90,6};
		int[] num = {1,4,3,7,6,5,2,8};
		System.out.println("--------- 元データ ---------");
		printArray(num);
		System.out.println("------ 選択ソート開始 ------");
		quickSort(num, 0, num.length - 1);
		System.out.println("------ 選択ソート完了 ------");
	}
}
