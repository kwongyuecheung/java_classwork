//**********************************
// 課題名 : Kad16_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/07/16
//**********************************
import java.util.*;

public class Kad16_2{
	public static int bruteForce (String search, String data){
		int x = -1;
		int dc = 0; 
		int sc = 0; 
		
		while(dc < data.length() && sc < search.length()){
			if(data.charAt(dc)== search.charAt(sc)){
				
				sc++;
				
			}else{
				
				sc = 0;
				
			}
			dc++;
		}
		if (sc > 0){
			return dc - sc + 1;
		}else{
			return x;
		}
	
	}
	public static void main (String[] args){
			Scanner sc = new Scanner(System.in);
			
			final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			System.out.println("------------ 力任せ法 ------------");
			System.out.println("データ：ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			System.out.print("検索文字列を入力してください：");
			String findword = sc.next();
			
			int result = bruteForce(findword,ALPHABET);
			if (result > 0){
				System.out.print(findword+"は"+result+" 文字目に見つかりました。");
			}else{
				System.out.print(findword+"は見つかりませんでした。");
			}

	}
			
	}

