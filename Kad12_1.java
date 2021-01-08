//**********************************
// 課題名 : Kad12_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/30
//**********************************
public class Kad12_1 {
 public static void main(String[] args) {
 	System.out.println("--- 列挙定数を拡張 for 文で表示 ---");
	for (BloodType myVar : BloodType.values()) {
	System.out.println(myVar+" 型");
}
 }
 enum BloodType{A, B, O, AB}; //血液型定数

}