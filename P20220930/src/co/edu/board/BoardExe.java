package co.edu.board;

public class BoardExe {
	public static void main(String[] args) { //메인메소드
		BoardDAO dao = BoardDAO.getInstance();
		dao.exe();
	
	}
}
