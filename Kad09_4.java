//**********************************
// �ۑ薼 : Kad09_4
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/18
//**********************************
import java.util.Scanner; 
class Kad09_4 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int score;
	int[ ] freq = new int[10];
	int i; 
	int c;
	System.out.println("�e�X�g�̓_������(-1 �œ��͏I��)");
	for (i = 0; i >= 0 ; i++){
		score = sc.nextInt();
		
		if (score < -1 || score > 100){
			System.out.println("ERROR");
		}
		if (score == -1){
			break;
		}
		c = score/10;
		freq[c] = freq[c] + 1;
		if (score == 100){
			freq[9] = freq[9]+1;
		}
	}
	int d = 0;
	int e = 9;
	for (int a = 0; a < freq.length -1; a++){
		System.out.println(d +" --  "+e+ ":"+ freq[a]);
		d = d + 10;
		e = e + 10;
	}
	System.out.println("90 -- 100:"+ freq[9]);

 }
}