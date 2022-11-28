package Day06.Ex04.Board;

import java.util.Scanner;

public class MainPractice {

	static int max = 10; //게시글은 최대 10개로 제한
	static BoardPractice[] boardlist = new BoardPractice[max];
		
	//Board라는 배열에 들어갈 배열의 개수는 max라는 변수로 지정.
	static int index = 0; //현재 게시글 순서번호 (0 ~ max-1)
	//게시글 쓰기 1번 메뉴를 넣으면
	// 맨 위의 보드 객체를 할당해서 제목, 내용, 작성자 입력을 받음.
	// 등록일자, 수정일자는 오늘 날짜
	// 메뉴판
	
	public static void showMenu() { //showMenu라는 클래스생성
		System.out.println("#####게시판#####");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("#########번호 입력 : ");
	}	//메뉴판 생성 완료.
		
		//게시글 목록
	public static void list() { //list라는 클래스 생성
		// 이 패키지 어디서나 참조 가능한 : static
		// 리턴값이 없는 : void
		System.out.println(" # 게시글 목록");
		for (BoardPractice board : boardlist) {//boardList라는 배열 인덱스 수만큼 반복
			System.out.println(board);  //이 소문자 board는 도대체 무엇이 정의된건지 모르겠다.
			}
		}
	
		//게시글 읽기
	public static void read(int boardNo) {
		System.out.println(" # 게시글 읽기");
		BoardPractice board = boardlist[boardNo -1];
		System.out.println(board);
	}
	
	
		//게시글 쓰기
	public static void write(BoardPractice board) {
		if( index < max ) {
			boardlist[index] = board;
			index++;
			board.setBoardNo(index);
			System.out.println(" # 게시글이 작성되었습니다.");
		} else {
			System.out.println(" # 게시글 목록이 꽉 찼습니다.");
		}
	}
		//게시글 수정
	public static void update(int boardNo, BoardPractice board) {
		// 0 1 2 3 4
		// 1 2 3 4 5 
		if(boardNo >= 1 && boardNo <= max) {
			boardlist[boardNo-1] = board;
			System.out.println(" # 게시글이 수정되었습니다. ");
		}else {
			System.out.println(" # 게시글이 존재하지 않습니다.");
		}
	}
	
	// 게시글 삭제 
	public static void delete (int boardNo ) {
		if (boardNo >= 1 && boardNo <= max) {
			//null : 값이 없음
			boardlist[boardNo-1] = null;
			System.out.println(" # 게시글이 삭제되었습니다.");
		} else {
			System.out.println("게시글이 존재하지 않습니다.");
			}
		}
	
	// 게시글 ##
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		int count = 0; //게시글 개수
		
		do {
			showMenu();
			//입력
			menuNo = sc.nextInt();
			sc.nextLine();
			int boardNo = 0;
			String title = "";
			String content = "";
			String writer = "";
			BoardPractice board = null;
			//메뉴 선택 
			switch (menuNo) {
			//게시글 목록, 리스트만 호출
			case 1: 
				list(); //list라는 클래스를 불러낸다
				break;	//그리고 멈춤
			//게시글 읽기
			case 2: //2를 입력하면
				System.out.println("게시글 번호 : ");	//게시글 번호를 입력하라 띄우고,
				boardNo = sc.nextInt(); //입력받는 Int는 boardNo에 대입,
				sc.nextLine(); // 엔터 키를 입력버퍼에서 빼준다.
				read(boardNo); //read라는 클래스를 불러낸다.
				break;
			//게시글 쓰기
			case 3:  //3을 입력하면
				System.out.println("제목 : ");//띄우고
				title = sc.nextLine();//엔터빼고
				System.out.println("내용 : ");//띄우고
				content = sc.nextLine();//엔터빼고
				System.out.println("작성자 : ");//띄우고
				writer = sc.nextLine();//엔터빼고
				board = new BoardPractice(title, content, writer); //title, content, writer로 이뤄진 뉴보드 생성자로 board에 대입.
				write(board); //write실행한다. board라는 변수로
				break;
			//게시글 수정
			case 4: 
				System.out.println("게시글 번호 : ");		
				boardNo = sc.nextInt();
				sc.nextLine();//엔터를 버퍼에서 빼줌.
				System.out.print("제목 : ");
				title = sc.nextLine();
				System.out.print("내용 : ");
				content = sc.nextLine();
				System.out.print("작성자 : ");
				writer = sc.nextLine();
				board = new BoardPractice(title, content, writer);
				update(boardNo, board);
				break;
			//게시글 삭제
			case 5: 
				System.out.println("게시글번호 : ");
				boardNo = sc.nextInt();
				sc.nextLine();
				delete(boardNo);
				break;
			
			default:
				break;
			}
			
		} while (count <= max);
			
	}		
		
}

		
		
	
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		

