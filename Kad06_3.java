//**********************************
// �ۑ薼 : Kad06_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad06_3 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
int flag = 1;
do{

 System.out.print("��������͂��ĉ������F");
  int num = sc.nextInt(); //�����i�[�p
  if(num%2 == 0){
  	System.out.println("���͂������͋����ł��B");
  }else{
System.out.println("���͂������͊�ł��B");
}
  System.out.print("������x���s���܂����H[����c1/���Ȃ��c0]�F");
  flag = sc.nextInt();

 }while(flag == 1);
 System.out.print("�I�����܂��B");
}

}