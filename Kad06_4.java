//**********************************
// Ûè¼ : Kad06_4
// NX : SE1A
// ì¬Ò : Kwong Yue CheungREEVE
// ì¬ú : 2020/05/26
//**********************************
import java.util.Scanner; 
class Kad06_4 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int num; //®i[p
 int total = 0; //vi[p
 int count = 0; //üÍñJE^
 System.out.println("®ðüÍµÄº³¢F");
 System.out.print((count+1)+" ÂÚF");
 num = sc.nextInt(); //®i[p

 while(num != -1){
 	 total= total + num;
	  count ++;
 	System.out.print((count+1)+" ÂÚF");
	 num = sc.nextInt(); //®i[p

}

 if (count != 0){
 System.out.print("v"+ total+", ½Ï"+(total/count));
}
}
}