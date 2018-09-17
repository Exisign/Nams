//Card객체는 카드의 정보를 가지고 있다.
public class Card {
	
	//kind
	//	0	:	스페이스	/	1	:	클로버
	//	2	:	하트		/	3	:	다이아몬드
	
	//num
	//0~9 : A~10까지의 카드
	//10, 11, 12 : J Q K
	private int kind;
	private int num;
	
	Card(){
		System.out.println("카드의 수를 알 수 없습니다..");
	}
	
	//total_card 전체 뭉치를 0~51로, 총 52개 잡는다.
	//하나의 문양은 13개의 카드로 이뤄져 있다.
	//13개의 카드는 4종류의 문양으로 이뤄져있다.
	Card(int total_card){
		kind = total_card/13;
		num = total_card%13;
	}
	
	protected int showKind(){
		return kind;
	}
	
	protected int showNum(){
		return num;
	}
	
	protected void inputKind(int kind){
		this.kind = kind;
	}
	
	protected void inputNum(int num){
		this.num = num;
	}
}
