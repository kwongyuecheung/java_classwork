//**********************************
// �ۑ薼 : Kad04_4
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/05/18
//**********************************
import java.util.Scanner; 
class Kad04_4 {
 public static void main(String[] args) {
 System.out.println("**** �ʐόv�Z�����܂� ****");
 System.out.println("�~��3�p�`�̂ǂ���̖ʐς����߂܂����H(�~:0, 3�p�`:3)-->");
 Scanner sc = new Scanner(System.in);
 int flg = sc.nextInt();

if (flg == 0){
System.out.println("�~�̔��a(m)����͂��ĉ������F");
double size = sc.nextDouble();
System.out.println("���a"+ size+"m�̉~�̖ʐς� "+ (size*2* Math.PI+"�u�ł��B"));
}else if(flg == 3){
System.out.println("��ӂ̒���(m)����͂��ĉ������F");
double size = sc.nextDouble();
System.out.println("����(m)����͂��ĉ������F");
double height = sc.nextDouble();
double area = ((size * height)/2);
System.out.println("���"+ size +"m,����"+ height+"m��3�p�`�ʐς�"+ area+"�u�ł�");
}else if(!(flg==0||flg == 3)){
System.out.println("--- �G���[ --- (0��3�ȊO�̐��l�����͂���܂���)");	
}
}
}