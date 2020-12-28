package randomClassEx;

import java.util.Random;


public class RandomEx {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random r = new Random(System.currentTimeMillis());
		for (int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = r.nextInt(45)+1;
			System.out.println(selectNumber[i]);
		}
		
	}
}
