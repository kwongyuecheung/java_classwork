//**********************************
// �ۑ薼 : Kad18_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/28
//**********************************
import java.util.*;

public class Kad18_1{
	public static void selectSort (int[] data){
		for(int i = 0; i < data.length - 1; i++){
			for(int j = i + 1; j < (data.length); j++){
				if(data[i] > data[j]){
					int k = data[i];
					data[i] = data[j];
					data[j] = k;
				}
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
		selectSort(num);
		System.out.println("------ �I���\�[�g���� ------");
	}
}
