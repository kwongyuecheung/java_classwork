//**********************************
// �ۑ薼 : Kad08_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/06/16
//**********************************
class Kad08_3 {
	
public static void main(String[] args) {

int a[] = {21, 45, 78, 34, 98, 65, 12, 87, 54}; 
int max, min;
int maxindex = 0;
int minindex = 0; 
int i;  

max = a[0];
min = a[0];
System.out.print("a[] = ");

for (i = 0; i < a.length ; i++){
	System.out.print(a[i] +", ");
	
	if (a[i] > max){
		max = a[i];
		maxindex = i;
	}
	if (a[i] < min){
		min = a[i];
		minindex = i;
	}
}
System.out.println(" ");
System.out.println("�ő�l��" + max+" ��, �z���"+(maxindex+1) +" �Ԗڂ̗v�f�ł�");
System.out.println("�ŏ��l��" + min+" ��, �z���"+ (minindex+1) +" �Ԗڂ̗v�f�ł�");
 }
}
