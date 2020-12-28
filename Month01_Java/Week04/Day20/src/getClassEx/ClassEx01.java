package getClassEx;

import toStringEx.Card;

public class ClassEx01 {
	public static void main(String[] args) {
		Card c = new Card("HEART,3");
		Card c2 = Card.class.newInstance();
		
		Class cObj=c.getClass();
	}
}


final class Card{
	String kind;
	int num;
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Card(String kind, int num) {
		this.kind=kind;
		this.num=num;
	}
}