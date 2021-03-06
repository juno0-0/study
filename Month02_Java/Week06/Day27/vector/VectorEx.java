package vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		List<Board> list = new Vector();
		//추가
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		//수정 3번 인덱스 제목5를 제목6으로
		list.set(3, new Board("제목6","내용6","글쓴이6"));
		
		//삽입 2번 인덱스에 제목7
		list.add(2,new Board("제목6","내용6","글쓴이6"));
		
		//제목2가 있는지 확인하기
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).subject.equals("제목2")){
				System.out.println(i);
			}
		}
		
		//삭제
		list.remove(4);
		
		//전체 출력
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
