//**********************************
// �ۑ薼 : Kad10_4
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/23
//**********************************

class Kad10_4 {
	
	public static void main(String[] args) {
	
	final int LEN = 5; //�ꎟ���z��̒���
	char[][] triangle = {{'��','��','��','��','��'},
 						{'��','��','��','��','��'},
						{'��','��','��','��','��'},
 						{'��','��','��','��','��'},
 						{'��','��','��','��','��'}};
	int i, j; //���[�v�J�E���^
	
	
	for(i = 0; i < triangle.length; i++){
		for(j = 0; j < triangle[i].length; j++){
		System.out.print(triangle[i][LEN -1 - j]);
		
		}
		System.out.println(triangle[i]);
	}
	for(i = 0; i < triangle.length; i++){
		for(j = 0; j < triangle[i].length; j++){
		System.out.print(triangle[LEN -1 - i][LEN -1 -j]);
		
		}
		System.out.println(triangle[LEN -1 - i]);
	}
 }
 
}