package vector;

import java.util.List;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		Vector<Board> list = new Vector();
		//�߰�
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		list.add(new Board("����5","����5","�۾���5"));
		
		System.out.println(list.size());
		System.out.println(list.capacity());
		list.trimToSize();
		System.out.println(list.size());
		System.out.println(list.capacity());
		list.add(new Board("����6","����6","�۾���6"));
		list.add(new Board("����6","����6","�۾���6"));
		list.add(new Board("����6","����6","�۾���6"));
		list.add(new Board("����6","����6","�۾���6"));
		list.add(new Board("����6","����6","�۾���6"));
		list.add(new Board("����6","����6","�۾���6"));
		System.out.println(list.size());
		System.out.println(list.capacity());
		System.out.println();
		Vector v = new Vector();
		Vector v2 = new Vector(23);
		System.out.println(v.capacity());
		System.out.println(v2.capacity());
		
		
		
	}
}
