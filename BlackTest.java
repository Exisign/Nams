import static org.junit.Assert.*;

import org.junit.Test;

public class BlackTest {

	@Test
	public void test() {
		BlackJackDeck d = new BlackJackDeck();
		
		for(int i = 0; i<1000; i++){
			
			Card c = d.popCard();
			
			try{
			assertTrue(0<=c.showNum()&&c.showNum()<=51);
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
				assertTrue(0<=c.showKind()&&c.showKind()<=3);
				}catch(Exception e){
				}

		}
	}

}
