//**********************************
// �ۑ薼 : Kad19_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/07/30
//**********************************
import java.util.*;

public class Kad19_2{
	public static void shellSort (int[] data){
		int i, j, temp; //���[�v�J�E���^�ƌ����p�ޔ�ϐ�
		int h = data.length / 2; //�����Ԋu(���ۑ�� 5��2��1��0 �ƕω����Ă���)
		
		while(h > 0){
			for(i = h; i < data.length; i++){
				j = i;
				while(j >= h && data[j - h] > data[j]){
					temp = data[j];
					data[j] = data[j - h];
					data[j - h] = temp;
					j -= h;
				}
			}
			h /= 2;	
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
		shellSort(num);
		System.out.println("------ �I���\�[�g���� ------");
	}
}
