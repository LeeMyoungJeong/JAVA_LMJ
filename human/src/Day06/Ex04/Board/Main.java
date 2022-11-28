package Day06.Ex04.Board;

import java.util.Scanner;

public class Main {

	static int max = 10; // 게시글 최대 10개 제한
	static Board[] boardlist = new Board[max]; // Board에 들어갈 배열의 개수는 10개, 근데 일단 아무 값도 
											   //입력되어있지는 않음.
	static int index = 0;	// 현재 게시글 순서번호 (0 ~ max-1)
	// 게시글 쓰기 1번 메뉴를 넣으면,
	// 맨위에 보드 객체를 할당해서 제목, 내용, 작성자 입력을 받음.
	// 등록일자, 수정일자는 오늘 날짜

	// 메뉴판
	public static void showMenu() {
		System.out.println("#####게시판#####");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("###########번호 입력 : ");
	}// 메뉴판을 생성함.

	// 게시글 목록 
	public static void list() { //이 패키지 안에서 어디서나 참조 가능한 static(정적인) void(리턴값이 없는)
		System.out.println(" # 게시글 목록");
		for (Board board : boardlist) {
			System.out.println(board);
		}
	}
	// 게시글 읽기
	public static void read(int boardNo) {
		Board board = boardlist[boardNo-1]; //꼭 변수에 담지 않더라도 시스아웃으로 바로 꺼내도됨.
		System.out.println(board);
	}
	
	// 게시글 쓰기
	public static void write(Board board) {
		if( index < max ) {	
		boardlist[index] = board; 
		index++;
		board.setBoardNo(index);
		} else {
			System.out.println("게시글 목록이 꽉 찼습니다.");
		}
	}
	// 게시글 수정
	public static void update(int boardNo, Board board) {
		// 0 1 2 3 4 
		// 1 2 3 4 5
		if( boardNo >= 1 && boardNo <= max ) {
		boardlist[boardNo-1] = board;
	} else {
		System.out.println("게시글이 존재하지 않습니다.");
		}
	}
	
	//게시글 삭제
	public static void delete (int boardNo) {
		if( boardNo >= 1 && boardNo <= max ) {
			//null : 값이 없음
			boardlist[boardNo-1] = null;
		} else {
			System.out.println("게시글이 존재하지 않습니다.");
			}
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		int count = 0; // 게시글 개수

		// 메뉴판 반복해서 출력
		do {
			showMenu();
			// 입력
			menuNo = sc.nextInt();
			sc.nextLine(); // 엔터를 입력버퍼에서 빼준다.
			int boardNo = 0;
			String title = "";
			String content = "";
			String writer = "";
			Board board = null;
			// 메뉴 선택
			switch (menuNo) {
			// 게시글 목록, 리스트만 호출
			case 1:
				list();
				break;
			// 게시글 읽기
			case 2:
				System.out.print("게시글 번호 : ");
				boardNo = sc.nextInt();
				sc.nextLine(); // 엔터를 입력버퍼에서 빼준다.
				read(boardNo);
				break;
			// 게시글 쓰기
			case 3:
				System.out.print("제목 : ");
				title = sc.nextLine();
				System.out.print("내용 : ");
				content = sc.nextLine();
				System.out.print("작성자 : ");
				writer = sc.nextLine();
				board = new Board(title, content, writer);
				//writer = sc.nextLine();
				//board = new Board(title, content, writer);
				break;

			// 게시글 수정
			case 4:
				System.out.print("게시글 번호 : ");
				boardNo = sc.nextInt();
				System.out.print("제목 : ");
				title = sc.nextLine();
				System.out.print("내용 : ");
				content = sc.nextLine();
				System.out.print("작성자 : ");
				writer = sc.nextLine();
				board = new Board(title, content, writer);
				update(boardNo, board);
				break;
			// 게시글 삭제
			case 5:
				System.out.println("게시글번호 : ");
				boardNo = sc.nextInt();
				delete(boardNo);  
				break;

			default:
				break;
			}

		} while (count <= max);

	}

}
