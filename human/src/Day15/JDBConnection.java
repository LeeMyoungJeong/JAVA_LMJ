package Day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.DriverManager;

public class JDBConnection {
	// 클래스 4가지 생성
	public Connection con; 
	public Statement stmt; //데이터베이스 언어의 문장을 만드는 역할
	public PreparedStatement psmt; //
	public ResultSet rs; //조회 요청을 날리고 SQL문을 실행한 결과를 얻어오려고 사용.
	
	// 기본 생성자
	public JDBConnection () {
		try{
			//JDBC 드라이버 로드
		
		//MySQL
		Class.forName("com.mysql.cj.jdbc.Driver");
		//DB에 연결
		//URL : [PORT]/[스키마]? 옵션파라미터
		//MySQL
		String url= "jdbc:mysql://localhost:3306/human?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
		//선생님거 클라우드 데이터베이스임.
		String id = "human";
		String pw = "123123";
		
		con = DriverManager.getConnection(url, id, pw);
		System.out.println("DB 연결 성공");
		
	}
		catch(Exception e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
	}
}
