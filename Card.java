<<<<<<< HEAD
package Game;
=======

>>>>>>> 9afb3f686505ec2740d7d330be81eea5d0bd15d3
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
		
<<<<<<< HEAD
		String kind = "0A23456789XJQK";
=======
		String kind = "0A2345678910JQK";
>>>>>>> 9afb3f686505ec2740d7d330be81eea5d0bd15d3
		String num = "0SCDH";	//스페이스, 클로버, 다이아, 하트
		
		return "["  + kind.charAt(this.kind) + "," + kind.charAt(this.num) + "]";
	}
	
	
}
