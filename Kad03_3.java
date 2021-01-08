//**********************************
// 課題名 : Kad03_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/18
//**********************************
class Kad03_3 {

  public static void main(String[] args) {
 final double PI = 3.1416; //円周率
double h = 7.2; //半径
final String STR1 = "半径は";
final String STR2 = "m です。";
System.out.println (STR1+h+STR2);
final String STR3 = "面積は";
final String STR4 = "円周の長さは";
final String STR5 = "㎡です。";
 System.out.println (STR4+(h*2*PI)+STR2); 
 System.out.println (STR3+(h*h*PI)+STR5); 
 }
}