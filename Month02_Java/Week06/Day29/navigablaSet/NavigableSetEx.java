package navigablaSet;

import java.util.*;

public class NavigableSetEx {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("[c~f ������ �ܾ� �˻�]");
		//NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		NavigableSet<String> rangeSet = treeSet.headSet("c", true);
		
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}
}