package toStringEx;

import java.util.Date;

public class CardtoString2 {
	public static void main(String[] args) {
		Card c = new Card();
		System.out.println(c.toString());
		Date date = new Date();
		System.out.println(date.toString());
		String name = "이순신";
		String name1 = new String("이순신");
		System.out.println(name);
		System.out.println(name1.toString());
	}
}

 