//**********************************
// 課題名 : Kad08_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/16
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
System.out.println("最大値は" + max+" で, 配列の"+(maxindex+1) +" 番目の要素です");
System.out.println("最小値は" + min+" で, 配列の"+ (minindex+1) +" 番目の要素です");
 }
}
