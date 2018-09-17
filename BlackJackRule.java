
abstract class BlackJackRule extends BlackJackDeck{
	
	abstract void split();
	abstract void stand();
	abstract void bust();
	
	boolean b_stay;	//stay 여부 판
	
	
	//hit card 
	public Card hit(){
		return super.popCard();
	}
	
	public void CheckBust(BlackJackUser c){
	
	}
	
}
