
public class Card {
	
	int kind;
	int num;
	
	Card(){
		this(0, 0);
	}
	
	Card(int kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString(){
		
		String kind = "0A2345678910JQK";
		String num = "0SCDH";	//스페이스, 클로버, 다이아, 하트
		
		return "["  + kind.charAt(this.kind) + "," + kind.charAt(this.num) + "]";
	}
	
	
}
