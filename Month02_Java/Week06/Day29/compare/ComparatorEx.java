package compare;

import java.util.*;


public class ComparatorEx{
	public static void main(String[] args) {
	
		Set<Fruit> treeSet = new TreeSet(new DescendingComparator());
		treeSet.add(new Fruit("����",3000));
		treeSet.add(new Fruit("����",10000));
		treeSet.add(new Fruit("����",6000));
		treeSet.add(new Fruit("����",3000));
		System.out.println(treeSet);
	}
	
}

class Fruit{
	String name;
	int price;
	
	public Fruit() {}
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name+" "+price;
	}
	
	
	
	
	
	
	
}
