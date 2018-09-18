import static org.junit.Assert.*;

import org.junit.Test;

public class BlackTest {

	@Test
	public void test() {
		BlackJackDeck d = new BlackJackDeck();
		
		for(int i = 0; i<1000; i++){
			
			Card c = d.popCard();
			
			try{
			assertTrue(0<=c.getNum()&&c.getNum()<=51);
			}catch(Exception e){
			}
		}
	}
	
	@Test
	public void test2() {
		BlackJackDeck d = new BlackJackDeck();
		
		for(int i = 0; i<1000; i++){
			
			Card c = d.popCard();
			
			
			try{
				assertTrue(0<=c.getKind()&&c.getKind()<=3);
				}catch(Exception e){
				}

		}
	}

}
