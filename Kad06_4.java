//**********************************
// �ۑ薼 : Kad06_4
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad06_4 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int num; //�����i�[�p
 int total = 0; //���v�i�[�p
 int count = 0; //���͉񐔃J�E���^
 System.out.println("��������͂��ĉ������F");
 System.out.print((count+1)+" �ځF");
 num = sc.nextInt(); //�����i�[�p

 while(num != -1){
 	 total= total + num;
	  count ++;
 	System.out.print((count+1)+" �ځF");
	 num = sc.nextInt(); //�����i�[�p

}

 if (count != 0){
 System.out.print("���v��"+ total+", ���ρ�"+(total/count));
}
}
}