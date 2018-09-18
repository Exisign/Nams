//Card객체는 카드의 정보를 가지고 있다.
public class Card {
	
	//kind
	//	1	:	스페이스	/	2	:	클로버
	//	3	:	하트		/	4	:	다이아몬드
	
	//num
	//1~10 : A~10까지의 카드
	//11, 12, 13 : J Q K
	private int kind;
	private int num;
	
	Card(){
		System.out.println("카드의 수를 알 수 없습니다..");
	}
	
	//total_card 전체 뭉치를 0~51로, 총 52개 잡는다.
	//하나의 문양은 13개의 카드로 이뤄져 있다.
	//13개의 카드는 4종류의 문양으로 이뤄져있다.
	Card(int total_card){
		kind = (total_card/13)+1;
		num = (total_card%13)+1;
	}
	
	protected int getKind(){
		return kind;
	}
	
	protected int getNum(){
		return num;
	}
	
	protected void setKind(int kind){
		this.kind = kind;
	}
	
	protected void setNum(int num){
		this.num = num;
	}
}
