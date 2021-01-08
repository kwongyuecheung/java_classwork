//**********************************
// 課題名 : Kad12_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/06/30
//**********************************
public class Kad12_3 {
 public static void main(String[] args) {
 	System.out.println("「今年も 1 年頑張るぞ！！」");

	for (Month myVar : Month.values()) {
		if (myVar.ordinal()==11){
			System.out.print((myVar.ordinal()+1)+"月：");
			System.out.print(myVar.getMsg());
			System.out.println("来年から本気を出す。");
		}else{
			System.out.print((myVar.ordinal()+1)+"月：");
			System.out.print(myVar.getMsg());
			System.out.println("来月から本気を出す。");
		}
	
}
 }
 enum Month{
 	JANUARY("初っ端から飛ばすと後でバテる。"),
	 FEBRUARY("まだまだ寒い。これではやる気が出ない。"),
	 MARCH("年度の終わりでタイミングが悪い。"), 
	 APRIL("季節の変わり目は体調を崩しやすい。"),
	MAY("区切りの良い 4 月を逃してしまった。"),
	JUNE("梅雨で気分が落ち込む。梅雨明けの"), 
	JULY("これからどんどん気温が上昇していく。体力温存のため"), 
	AUGUST("暑すぎて気力がそがれる。"),
	SEPTEMBER("休みボケが抜けない。無理しても効果が無いので"), 
	OCTOBER("中途半端な時期。ここは雌伏の時。"), 
	NOVEMBER("急に冷えてきた。こういう時こそ無理は禁物。"), 
	DECEMBER("もう今年は終わり。今年はチャンスが無かった。");
	
	private String msg;
	private Month(String msg){
		this.msg = msg;
	}
	public String getMsg(){
		return msg;
	}
	} 

}