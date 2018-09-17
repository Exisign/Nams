
abstract class BlackJackRule extends BlackJackDeck{
	
	abstract void split();
	abstract void stand();
	abstract void bust();
	
	
	//hit card 
	public Card hit(){
		return super.popCard();
	}
	
}
