package p3;

import java.util.Scanner;

public class SoundableExample {
	void printSound(Soundable s) {
		System.out.println(s.sound());
	}
	
	public static void main(String[] args) {
		SoundableExample s = new SoundableExample();
		s.printSound(new Dog());
		s.printSound(new Cat());
	}
}
