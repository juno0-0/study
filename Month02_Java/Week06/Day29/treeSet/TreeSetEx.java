package treeSet;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		Integer score = null;
		
		score = scores.first();//가장 낮은 점수
		System.out.println("가장 낮은 점수 : "+score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 : "+score);
		
		score = scores.lower(95);
		System.out.println("95점 아래 점수 : "+score);
		
		score = scores.higher(95);
		System.out.println("95점 위 점수 : "+score);
		
		score = scores.floor(95);
		System.out.println("95점이거나 바로 아래 점수 : "+score);
		//95점이 있으면 95점을 출력 없으면 바로 아래 점수를 출력
		
		score = scores.ceiling(90);
		System.out.println("90점이나 바로 위 점수 : "+score);
		//90점이 있으면 90점 출력 없으면 바로 위 점수를 출력
		
		while(!scores.isEmpty()) {
			score=scores.pollFirst();
			System.out.println(score);
		}
		
		
		
		
	}
}
