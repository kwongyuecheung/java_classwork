//**********************************
// �ۑ薼 : Kad12_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/30
//**********************************
public class Kad12_1 {
 public static void main(String[] args) {
 	System.out.println("--- �񋓒萔���g�� for ���ŕ\�� ---");
	for (BloodType myVar : BloodType.values()) {
	System.out.println(myVar+" �^");
}
 }
 enum BloodType{A, B, O, AB}; //���t�^�萔

}