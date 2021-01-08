//**********************************
// 課題名 : Kad08_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/16
//**********************************
import java.util.Scanner; 
class Kad08_2 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a = new int[9];
	int temp; 
	int i;
	
	for(i = 0; i < a.length ; i++){
		System.out.print("a["+i+"] = ");
		a[i] = sc.nextInt();
	}
	for(i = 0; i < a.length/2 ; i++){
		temp = a[i];
		a[i] = a[a.length - 1 - i];
		a[a.length -1 - i] = temp;
	}
	for(i = 0; i< a.length ; i++){
		System.out.println("a["+ i + "] = "+ a[i]);
	}
		
 }
}