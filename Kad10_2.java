//**********************************
// �ۑ薼 : Kad10_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/23
//**********************************
import java.util.Scanner; 
class Kad10_2 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[ ][ ] a = {{1,2,3},{4,5,6}};
	int[ ][ ] b = {{7,8,9},{10,11,12}};
	int[ ][ ] c = new int [2][3];
	int i, j;
	
	
	for(i = 0; i < a.length; i++){
		for( j = 0; j < a[i].length; j++){
			System.out.print(a[i][j] + "\t");
		}
		System.out.println("");
	}
	for(i = 0; i < b.length; i++){
		for( j = 0; j < b[i].length; j++){
			System.out.print(b[i][j] + "\t");
		}
		System.out.println("");
	}
	for(i = 0; i < c.length; i++){
		for( j = 0; j < c[i].length; j++){
			c[i][j] = (b[i][j] + a[i][j]);
			System.out.print(c[i][j] + "\t");
		}
			System.out.println("");
	}
 }
}