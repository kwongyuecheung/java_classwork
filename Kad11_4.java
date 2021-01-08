//**********************************
// 課題名 : Kad11_4
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/25
//**********************************
 import java.util.*;
class Kad11_4 {
	
	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	int thisYear = Calendar.getInstance().get(Calendar.YEAR);
	
	System.out.println("現在は"+ thisYear + "年です。");
	String[] wareki = {"大正", "昭和", "平成", "令和"};
	int[] nen = {1912,1925,1989,2019};
	System.out.print("■誕生年を西暦で入力(0 で終了):");
	int year = sc.nextInt();
	while(year != 0){
	
	System.out.println("年齢："+(thisYear-year)+"歳");
	int i = 0;
	while (year>= nen[i]&& i < nen.length){
		i++;
	}
	System.out.println("和暦:" +wareki[i-1]+(year - nen[i-1]+1)+"年" );
	System.out.print("■誕生年を西暦で入力(0 で終了):");
	year = sc.nextInt();
	
	}
	System.out.println("ありがとうございました。");
	}
		
	
}