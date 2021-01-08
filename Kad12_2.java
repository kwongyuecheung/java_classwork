//**********************************
// 課題名 : Kad12_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/30
//**********************************
public class Kad12_2 {
 public static void main(String[] args) {
 	System.out.println("「今日はどこで遊ぼう？」");

	for (Weather myVar : Weather.values()) {
		System.out.print(myVar);
		switch(myVar){
		case FINE: System.out.println("グラウンドで遊ぼう");
		break;
		case CLOUDY: System.out.println("テラスで遊ぼう");
		break;
		case RAINY: System.out.println("室内で遊ぼう");
		break;
		case SNOW: System.out.println("こたつで遊ぼう");
		break;
		}
	
}
 }
 enum Weather{FINE, CLOUDY, RAINY, SNOW}; 

}