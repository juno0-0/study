package ex1;

import java.util.*;

public class BoardDao {
	Board b1 = new Board("����1","����1");
	Board b2 = new Board("����2","����2");
	Board b3 = new Board("����3","����3");
	List<Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		return list;
	}
}
