//**********************************
// �ۑ薼 : Kad04_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/05/18
//**********************************
import java.util.Scanner; 
class Kad04_3 {
 public static void main(String[] args) {
 System.out.println("3 �̐�������͂��ĉ������B");
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
System.out.println("1�̓��́F"+a);
System.out.println("2�̓��́F"+b);
System.out.println("3�̓��́F"+c);
if(a==b&&b==c){
System.out.println("�S�������l�ł��B");

 }else if(a==b||a==c||b==c){
 System.out.println("2 �̒l�������ł��B");
 }else if(a!=b&&a!=c&&b!=c){
 System.out.println("3 �̒l�͈قȂ�܂��B");
 }
 }
}