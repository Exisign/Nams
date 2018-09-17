//Deck 객체는 Card 객체를 이용해 카드풀을 관리한다.
public class BlackJackDeck implements Deck{

	private static int total_card = 52;
	private Card deck[];
	private int pool_cnt;
	
	BlackJackDeck(){
		deck = new Card[total_card];
		makeDeck();
		shuffle();
	}
	
	@Override
	public void shuffle() {
		for(int i = 0; i<deck.length*4; i++){
			
			int rand = (int)(Math.random()*51)+1;
			
			Card temp = deck[0];
			deck[0] = deck[rand];
			deck[rand] = temp;
		}
		System.out.println("덱 셔플이 완료 됨.");
	}

	@Override
	public void makeDeck() {
		try{
			for(int i = 0; i<total_card; i++){
				deck[i].inputKind(i);
				deck[i].inputNum(i);
				System.out.println("덱 생성 완료");
			}
		}catch(Exception e){
			System.out.println(e.getStackTrace());
		}
	}

	@Override
	public Card popCard() {
		
		try{
			return deck[pool_cnt++];
		}catch(Exception e){
			
			System.out.println("덱에 있는 모든 카드를 소진했습니다.");
			return new Card();
		}
	}
	
	
}
