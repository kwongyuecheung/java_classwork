//**********************************
// �ۑ薼 : Kad06_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad06_2 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("�ڕW���z����͂��Ă��������F");
 int target = sc.nextInt();
 int sav = 1;
 int day = 0;
 int sum = 0;
 while(sum < target){
 
 sav += sav ;
 day++ ;
 	
sum = sav;
 }
 System.out.print(day+"����"+sum+"�~�����ł��܂��B");
}
}