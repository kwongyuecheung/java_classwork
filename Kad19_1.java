//**********************************
// �ۑ薼 : Kad19_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/28
//**********************************
import java.util.*;

public class Kad19_1{
	public static void insertSort (int[] data){
		int len = data.length;
		int temp;
		for(int i = 1; i < len; i++){
			int j = i;
			while(j > 0 && data[j - 1] > data[j]){
				temp = data[j];
				data[j] = data[j - 1];
				data[j - 1] = temp;
				j--;
			}
			printArray(data);
		}
	}
	public static void printArray (int[] data){
		for(int n : data){
			System.out.print(n+" ");
		}	
		System.out.println("");
	}
	public static void main (String[] args){
			
		int[] num = {22,50,88,11,44,70,30,66,90,6};
		System.out.println("--------- ���f�[�^ ---------");
		printArray(num);
		System.out.println("------ �I���\�[�g�J�n ------");
		insertSort(num);
		System.out.println("------ �I���\�[�g���� ------");
	}
}
