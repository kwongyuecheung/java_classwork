//**********************************
// �ۑ薼 : Kad12_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/30
//**********************************
public class Kad12_2 {
 public static void main(String[] args) {
 	System.out.println("�u�����͂ǂ��ŗV�ڂ��H�v");

	for (Weather myVar : Weather.values()) {
		System.out.print(myVar);
		switch(myVar){
		case FINE: System.out.println("�O���E���h�ŗV�ڂ�");
		break;
		case CLOUDY: System.out.println("�e���X�ŗV�ڂ�");
		break;
		case RAINY: System.out.println("�����ŗV�ڂ�");
		break;
		case SNOW: System.out.println("�����ŗV�ڂ�");
		break;
		}
	
}
 }
 enum Weather{FINE, CLOUDY, RAINY, SNOW}; 

}