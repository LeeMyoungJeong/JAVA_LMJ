package Day15.Board_DAO;

import java.util.LinkedList;
import java.util.List;

import Day15.JDBConnection;
import Day15.Board_DTO.Board;

//Data Access Object
public class BoardDAO extends JDBConnection {

	// 데이터 목록 조회
	public List<Board> selectList() {
		LinkedList<Board> boardList = new LinkedList<>();

		String sql = " SELECT * " + " FROM board ";

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Board board = new Board();
				board.setBoard_no(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setReg_date(rs.getTimestamp("reg_date"));
				board.setUpd_date(rs.getTimestamp("upd_date"));

				boardList.add(board);

			}

		} catch (Exception e) {
			System.out.println("게시글 목록 조회 시, 예외 발생");
			e.printStackTrace();

		}
		return boardList;
	}

	// 데이터 조회
	public Board select(int board_no) {
		Board board = new Board();

		String sql = " SELECT * " + " FROM board " + " WHERE board_no = ? ";

		try {
			psmt = con.prepareStatement(sql); // 쿼리문 생성
			psmt.setInt(1, board_no);
			rs = psmt.executeQuery(sql);

			if (rs.next()) {

				board.setBoard_no(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setReg_date(rs.getTimestamp("reg_date"));
				board.setUpd_date(rs.getTimestamp("upd_date"));

			}

		} catch (Exception e) {
			System.out.println("게시글 조회 시, 예외 발생");
			e.printStackTrace();

		}
		return board;

	}

	// 데이터 등록
	// 데이터베이스에 적용된 개수를 반환해줌
	public int insert(Board board) {

		int result = 0;
		String sql = " INSERT INTO board (title, writer, content) " + "VALUES( ?, ?, ?)";

		try {
			psmt = con.prepareStatement(sql); // 쿼리문 생성
			psmt.setString(1, board.getTitle()); // 셋스트링이라는 메소드로 타이틀
			psmt.setString(2, board.getWriter()); // 라이터
			psmt.setString(3, board.getContent()); // 컨텐트 맵핑을 완료한다.
			result = psmt.executeUpdate(); // SQL 실행 요청 // 정상적으로 추가가 되면 1 아니면 0을 반환

			// executeQuery() : 데이터 조회
			// executeUpdate() : 데이터 추가/수정/삭제 -- 적용된 행(데이터)의 개수를 반환

		} catch (Exception e) {
			System.out.println("게시글 등록 시 예외 발생");
			e.printStackTrace();
		}

		return 0;
	}

	// 데이터 수정
	public int update(Board board) {

		int result = 0;
		String sql = " UPDATE board " 
					+ " Set title = ? "
					+ "	,writer = ? " 
					+ "	,content = ? " 
					+ "	,upd_date = now() ? "
					+ " WHERE board_no = ? ";

		try {
			psmt = con.prepareStatement(sql); // 쿼리문 생성
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getWriter());
			psmt.setString(3, board.getContent());
			psmt.setInt(4, board.getBoard_no());
			result = psmt.executeUpdate(); // SQL 실행 요청 // 정상적으로 추가가 되면 1 아니면 0을 반환

		} catch (Exception e) {
			System.out.println("게시글 수정 시 예외 발생");
			e.printStackTrace();
		}
		return 0;
	}

	// 데이터 삭제
	public int delete(int board_no) {

		int result = 0;
		String sql = " DELETE FROM board "
					+ " WHERE board_no = ? ";

		try {
			psmt = con.prepareStatement(sql); // 쿼리문 생성
			psmt.setInt(1, board_no);
			result = psmt.executeUpdate(); // SQL 실행 요청 // 정상적으로 추가가 되면 1 아니면 0을 반환

		} catch (Exception e) {
			System.out.println("게시글 삭제 시 예외 발생");
			e.printStackTrace();
		}
		return 0;
	}
}
