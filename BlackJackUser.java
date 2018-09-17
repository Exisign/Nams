import java.util.LinkedList;

public class BlackJackUser {
	private LinkedList hand = new LinkedList();
	
	BlackJackUser(){
		System.out.println("들어온 패가 없습니다.");
	}
	BlackJackUser(Card c){
		hand.add(c);
		System.out.println("손에 카드가 " + hand.size() + "장 들어왔습니다.");
	}
}
