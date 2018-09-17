package Game;
public class Deck{

	int total_cnt;
	boolean check;
	//Card 객체를 담을 배열을 생성
	Card [] deck;
	
	
	//만들어질 Card 객체의 수 초기화
	Deck(){
		total_cnt = 52;
		check = false;
		deck = new Card[total_cnt];
	}
	
	//Card 객체를 생성하고, 정보를 만들어 배열에 넣어줌
	void setPool(){
		
		for(int i = 0; i<deck.length; i++){
			
			deck[i] = new Card();
			
			deck[i].kind = (i/deck[i].num)+1;
			deck[i].num = (i%deck[i].num)+1;
		}
	}
	
	//만들어진 카드풀을 랜덤하게 섞음. 횟수는 (카드의 갯수*카드의갯수+1 ~ 카드의 갯수*카드의갯수 * 2)
	void suffle(){
		
		Card ex;
		
		int suf_cnt = (int)(Math.random()*(total_cnt*total_cnt)+1)+total_cnt*total_cnt;
		
		for(int i = 0; i<suf_cnt; i++){
			
			int rand_deck = (int)(Math.random()*total_cnt);
			
			ex = deck[rand_deck];
			deck[rand_deck] = deck[0];
			deck[0] = ex;
		}
		
		check = true;
	}
	
	Card popCard(int x){
		
		if(check == true){
			return deck[x];
		}
		else{
			System.out.println("덱 섞이지 않음");
			return deck[x];
		}
		
	}

}
