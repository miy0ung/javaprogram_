package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.List;

public class Introduce {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		System.out.println("[고객 관계 관리(Customer Relationship Management): CRM]");
		System.out.println();
		for(Board board : list) {
			System.out.println(board.getTitle() + ":" + board.getContent());
		}
	}
}

class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() { return title; }
	public String getContent() { return content; }
}

class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("이름", "김미영"));
		list.add(new Board("학번", "202100573"));
		list.add(new Board("학과", "컴퓨터공학부"));
		return list;
	}
}
