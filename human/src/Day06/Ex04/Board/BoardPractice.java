package Day06.Ex04.Board;

import java.sql.Date;

public class BoardPractice { 
/* 게시판 만들기
 * - 게시글 번호
 * - 제목
 * - 내용
 *   작성자
 * 	 등록일자
 * 	 수정일자
 */
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private Date regDate;	// ctrl + shift + O 누르면 
	private Date update;	// 패키지를 자동 import 해준다
							// Date를 변수로 쓰고 싶으면 Date패키지를 import해와야함.
	public BoardPractice() {
	}
	public BoardPractice(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpdate() {
		return update;
	}
	public void setUpdate(Date update) {
		this.update = update;
	}
	
	// toString()
	// : 객체를 출력할 때, 지정할 문자열 양식을 반환하는 메소드
	// Object(최상위클래스)에 정의되어 있다. 
	// Object는 모든 클래스에 최상위 클래스임.
	
	@Override
	public String toString() {
		return "BoardPractice [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regDate=" + regDate + ", update=" + update + "]";
	}
	
	



}
