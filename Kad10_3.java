//**********************************
// 課題名 : Kad10_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/23
//**********************************

class Kad10_3 {
	
	public static void main(String[] args) {
	
	int[ ][ ] table = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; 
	int[ ] rowSum = new int[3]; 
	int[ ] colSum = new int[4]; 
	int total = 0; 
	int i, j; 
	int totala = 0;
	
	for(i = 0; i < table.length; i++){
		total = 0;
		for( j = 0; j < table[i].length; j++){
			total = total + table[i][j];
			
			rowSum[i] = total;
			colSum[j] = colSum[j] + table[i][j];
			System.out.print(table[i][j] + "\t");
		}
		System.out.println("|"+ rowSum[i]);	
		totala = totala + total;
	}
	System.out.println("-----------------------------------------");
	for (i = 0; i < colSum.length; i++){
		System.out.print(colSum[i] + "\t");
	}
	System.out.print("|"+ totala);
 }
 
}