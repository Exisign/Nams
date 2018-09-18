import java.util.LinkedList;

public class BlackJackUser {
	private int money;
	private boolean stay;
	private LinkedList hand = new LinkedList();
	
	BlackJackUser(){
		stay = false;
		money = 0;
		System.out.println("유저 참가");
	}
	
	void addCard(Card c){
		hand.add(c);
		System.out.println("손에 카드가 " + hand.size() + "장 있습니다.");
	}
	
	LinkedList getHand(){
		return hand;
	}
	
	int count(){
		
		int count = 0;
		
		for(int i = 0; i<hand.size(); i++){
			if(hand.get(i) instanceof Card){
				count = ((Card)hand.get(i)).getNum();
			}else{
				System.out.println("다형성 문제");
			}
		}
		
		return count;
	}
	
	int betMoney(int money){
		if(this.money-money>0){
			this.money -= money;
			return money;
		}
		
		return -1;
	}
	
	void getMoney(int money){	this.money += money;	}

	boolean getStay(){
		return stay;
	}
	void setStay(boolean stay){
		this.stay = stay;
	}
}
