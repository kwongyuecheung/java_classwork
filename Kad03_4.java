//**********************************
// 課題名 : Kad03_4
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/05/18
//**********************************
class Kad03_4 {

  public static void main(String[] args) {
double h = 7.2; //半径
final String STR1 = "半径は";
final String STR2 = "m です。";
System.out.println (STR1+h+STR2);
final String STR3 = "面積は";
final String STR4 = "円周の長さは";
final String STR5 = "㎡です。";
 int a = (int) (h*2*Math.PI); 
int b = (int) (Math.pow(h,2)*Math.PI); 
  System.out.println (STR4+a+STR2);
   System.out.println (STR3+b+STR5);
 }
}