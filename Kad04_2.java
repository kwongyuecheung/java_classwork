//**********************************
// �ۑ薼 : Kad04_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/05/18
//**********************************
import java.util.Scanner; 
class Kad04_2 {
 public static void main(String[] args) {
 System.out.println("2�̐�������͂��ĉ������B");
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
System.out.println("����1�̓��́F"+a);
System.out.println("����2�̓��́F"+b);
if(a>b){
	int sub = a*b ;
	int mul = a-b ;
System.out.println(a+"x"+b+"="+sub);
System.out.println(a+"-"+b+"="+mul);
 }else if(a<=b){
 	int div = b/a ;
	int rem = b%a ;
	int add = a+b ;
 System.out.println(b+"��"+a+"="+div +"..."+rem);
 System.out.println(a+"+"+b+"="+add);
 }
 }
}