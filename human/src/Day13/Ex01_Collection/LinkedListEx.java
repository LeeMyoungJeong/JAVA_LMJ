package Day13.Ex01_Collection;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * ArrayList 
 * 		: 순차적으로 추가/삭제 	- 빠르다
 * 		: 중간에 추가 /삭제 		- 느리다
 * 		: 검색				- 빠르다
 * 
 * LinkedList
 * 		: 순차적으로 추가/삭제 	- 느리다
 * 		: 중간에 추가/ 삭제  	- 빠르다
 * 		: 검색 				- 느리다
 * 
 * 
 * 중간중간 자료를 추가할거면 링크드리스트가 유리하고
 * 아니라 한번에 작성해놓고 검색을 많이 해야하면 어레이리스트가 좋다.
 * 
 */
public class LinkedListEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Board> boardList = new LinkedList<>();
		
		do {
			System.out.println("1. 게시글 쓰기");
			System.out.println("0. 종료");
		
			int menu = sc.nextInt();
			sc.nextLine();
			
			if( menu == 0) {
				break;
			}
			
			if(menu == 1 ) {
				System.out.print("제목 : ");
				String title = sc.nextLine();

				System.out.print("작성자 : ");
				String writer = sc.nextLine();
				
				System.out.print("내용 : ");
				String content = sc.nextLine();
			
				Board board = new Board();
				board.setTitle(title);
				board.setWriter(writer);
				board.setContent(content);
				
				//객체 추가
				boardList.add(board);
			}
			
			for(Board board : boardList) {
				System.out.println(board);
			}
		} while(true);
		sc.close();
			
			}
		}
		
		
		
		
		
		// Board 클래스
		
	
