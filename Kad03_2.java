//**********************************
// �ۑ薼 : Kad03_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/05/18
//**********************************
class Kad03_2 {

  public static void main(String[] args) {
  int numA = 2500, numB = 49800; //A �̌�, B �̌�
int priceA = 15, priceB = 2; //A �̒P��, B �̒P��

	
	
 	System.out.println("���i A 2500 * 15 = " + (numA*priceA));
	System.out.println("���i B 49800 * 2 = " + (numB*priceB));
	System.out.println("--------------------------------");
	int sumA =(numA*priceA) , sumB=(numB*priceB) , sum = (sumA+sumB); //A �̏��v, B �̏��v, ���v

	System.out.println("���v\t\t" + (sum));
	double tax =sum*0.1 , total= sum*1.1; //����S, ����ō��ݍ��v
	System.out.println("�����(10%)\t" + tax);
	System.out.println("�����(10%)\t" +total);
 	}
 }
 