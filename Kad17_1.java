//**********************************
// 課題名 : Kad17_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/21
//**********************************
import java.util.*;

public class Kad17_1{
	public static int linearSearch (String[] data, String key){
		for(int i = 0; i < data.length; i++){
			if(key.substring(0,3).equals(data[i])){
				return i;
			}
		}
		
		return -1;
	}
	public static void main (String[] args){
			Scanner sc = new Scanner(System.in);
			String[] fruitsArray = {"リンゴ", "レモン", "メロン", "バナナ", "イチゴ" };
			System.out.println("配列のデータは以下の通りです。");
			for(String i: fruitsArray){
				System.out.println(i);
			}
			System.out.print("探索文字を入力してください：");
			String key = sc.next();
			int x = linearSearch(fruitsArray, key);
			if(x == -1){
				System.out.println(key +"は"+"は見つかりませんでした。");
			}else{
				System.out.println(key +"は"+ (x+1)+" 番目に見つかりました。");
			}
	}
}
