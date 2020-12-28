package vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		List<Board> list = new Vector();
		//�߰�
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		list.add(new Board("����5","����5","�۾���5"));
		
		//���� 3�� �ε��� ����5�� ����6����
		list.set(3, new Board("����6","����6","�۾���6"));
		
		//���� 2�� �ε����� ����7
		list.add(2,new Board("����6","����6","�۾���6"));
		
		//����2�� �ִ��� Ȯ���ϱ�
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).subject.equals("����2")){
				System.out.println(i);
			}
		}
		
		//����
		list.remove(4);
		
		//��ü ���
		for(Board b : list) {
			System.out.println(b.subject);
			System.out.println(b.content);
			System.out.println(b.writer);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).subject);
		}
		
		Iterator<Board> iter = list.iterator();
		while(iter.hasNext()) {
			Board board = iter.next();
			System.out.println(board+""+board.subject);

		}
		
		
	}
}
class Board{
	String subject;
	String content;
	String writer;
	public Board() {}
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
}
