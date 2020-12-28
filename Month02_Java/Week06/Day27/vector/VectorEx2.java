package vector;

import java.util.List;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		Vector<Board> list = new Vector();
		//추가
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		System.out.println(list.size());
		System.out.println(list.capacity());
		list.trimToSize();
		System.out.println(list.size());
		System.out.println(list.capacity());
		list.add(new Board("제목6","내용6","글쓴이6"));
		list.add(new Board("제목6","내용6","글쓴이6"));
		list.add(new Board("제목6","내용6","글쓴이6"));
		list.add(new Board("제목6","내용6","글쓴이6"));
		list.add(new Board("제목6","내용6","글쓴이6"));
		list.add(new Board("제목6","내용6","글쓴이6"));
		System.out.println(list.size());
		System.out.println(list.capacity());
		System.out.println();
		Vector v = new Vector();
		Vector v2 = new Vector(23);
		System.out.println(v.capacity());
		System.out.println(v2.capacity());
		
		
		
	}
}
