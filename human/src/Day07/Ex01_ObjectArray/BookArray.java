package Day07.Ex01_ObjectArray;

//클래스파일 하나에 여러개 클래스를 만들 수 있음.

/*
	 	책 제목, 저자명을 갖는 Book 이라는 클래스를 정의하고, 
	 	Book 클래스 타입의 객체배열을 생성하여
	 	사용자로부터 책 3권을 입력받아 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

class Book {
	String title, author;		// 책제목, 저자명

	public Book() {
		this("제목없음", "작자미상");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;            //여기는 오버로딩
	}
		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + "]"; //
	}
}

public class BookArray {
	
	public static void main(String[] args) {
		//book 타입의 객체 배열을 생성.
		Book[] bookArray = new Book[3];
		Scanner sc = new Scanner(System.in); //입력받을거임
		
		for (int i = 0; i < bookArray.length; i++) {
			System.out.print("제목 :" );
			String title = sc.nextLine(); 
			
			System.out.print("저자 :" );
			String author = sc.nextLine();
			// Book 객체를 bookArray 배열의 요소에 대입.
			bookArray[i] = new Book(title, author);		}
				//for 문법으로 인해 3번 반복될동안 제목과 저자가 입력됨.
	
		//출력
		for (Book book : bookArray) {
			System.out.println(book);
		}
		sc.close();
}
}