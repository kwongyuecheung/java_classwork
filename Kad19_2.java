//**********************************
// 課題名 : Kad19_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/30
//**********************************
import java.util.*;

public class Kad19_2{
	public static void shellSort (int[] data){
		int i, j, temp; //ループカウンタと交換用退避変数
		int h = data.length / 2; //交換間隔(今課題は 5→2→1→0 と変化していく)
		
		while(h > 0){
			for(i = h; i < data.length; i++){
				j = i;
				while(j >= h && data[j - h] > data[j]){
					temp = data[j];
					data[j] = data[j - h];
					data[j - h] = temp;
					j -= h;
				}
			}
			h /= 2;	
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
		shellSort(num);
		System.out.println("------ 選択ソート完了 ------");
	}
}
