//**********************************
// �ۑ薼 : Kad09_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/18
//**********************************
import java.util.Scanner; 
class Kad09_2 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double[ ] num = new double[5];
	double total = 0;
	int i;
	
	System.out.println("--- ���� ---");
	
	for ( i = 0 ; i < num.length ; i ++){
			System.out.print("�z�� num[" + i + "] = ");
			num[i] = sc.nextDouble();
			total = total + num[i];
	}
	double max = num[0];
	double min = max;
	
	for (double j: num){
	
		if (j > max){
			max = j;
		
		}
		if (j < min){
			min = j;
		
		}
	}
	System.out.println("--- �g�� for ���ɂ��v�Z���� ---");
	
	System.out.println("�ő�l="+ max +"�F�ŏ��l="+ min + "�F���v�l=" + total);
	
	
 }
}