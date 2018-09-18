
abstract class BlackJackRule extends BlackJackDeck{
	
	abstract void split();
	
	//hit card : 카드 풀에서 카드를 뽑은 뒤, 카드 객체를 반환한다.
	public Card hit(){
		return super.popCard();
	}
	
	//Bust check : 유저의 손패 정보를 가져 온 뒤, 패의 숫자를 확인한다.
	public boolean CheckBust(BlackJackUser c){
		
		int bustcheck = 0;
		
		for(int i = 0; i<c.getHand().size(); i++){
			
			if( c.getHand().get(i) instanceof Card){
				Card tmp = (Card)(c.getHand().get(i));
				//카드 객체를 가져오는 것은 좋으나, A를 어떤 식으로 처리해줄지 고민을 해야 함.
				//bustcheck += tmp.getNum();
			}
		}
		
		if(bustcheck > 21){
			return false;
		}
		else{
			return true;
		}
	}
	
	void stayCheck(BlackJackUser c){
		if(c.getStay()){
			//스테이면, 다음 유저로 넘기는 것으로 진행
		}
	}

	
	
	
}
