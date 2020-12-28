package shuffle;

import java.util.*;

public class ShuffixEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		System.out.println(list);
		
		
		
	}
}
