package Day07.Ex01_ObjectArray;

import java.util.Scanner;

/*
  	책제목, 저자명을 갖는 Book 이라는 클래스를 정의하고,
  	Book 클래스타입의 객체배열을 생성하여
  	사용자로부터 책 3권을 입력받아 출력하는 프로그램을 작성하시오.
*/

class Book { //먼저 Book이라는 클래스를 정의한다.
	
	String title, author;		// 책제목, 저자명 두 개의 변수를 갖고 있음.

	public Book() { 
		this("제목없음", "작자미상"); // 제목없음, 작자미상은 어디뜨는거지???
	} //이건 뭐지? --> 얘도 클래스다. 클래스 안에 정의된 클래스.
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	 //얘도 클래스다. title, author 변수로 선언된 클래스임
	 // title과 author의 값은 이 클래스 안에서 정의된 값을 가질거임.	
	}
	/*@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}// toString 메소드 오버라이딩 : 클래스명과 변수의 값을 문자열로 반환해줌.
	*/
}

public class BookArrayPractice { //퍼블릭 클래스 정의

	public static void main(String[] args) { //실행될 메인메소드 선언
		
		// Book 타입의 객체 배열 선언 및 생성
		Book[] bookArray = new Book[3]; //위의 Book이라는 클래스의 변수값을 갖는 배열 하나를 생성할거다.
		//이름은 bookArray이고, 3개의 배열을 갖는다.
		Scanner sc = new Scanner(System.in); // 그리고 스캐너를 하나 받아주고
		
		// 사용자 입력
		for (int i = 0; i < bookArray.length; i++) { //bookArray의 length만큼 반복한다.
		
			System.out.print("제목 : "); 			// '제목 :' 출력하고 값이 입력되면 
			String title = sc.nextLine();		// title에 저장해
			
			System.out.print("저자 : ");			// '저자 :' 출력하고 값이 입력되면 
			String author = sc.nextLine();		// title에 저장해
			
			// Book 객체를 bookArray 배열의 요소에 대입
			bookArray[i] = new Book(title, author); //bookArray의 i 번째 요소에 Book 객체의 값을 대입해라 그리고 i++실행.
		}
		
		// 출력
		for (Book book : bookArray) {
			System.out.println(book);
		}	// toString 메소드가 아니라면 ---> Book [title=, author=] ---> 이렇게 출력 못함
			// Day07_BookPractice.Book@7a0ac6e3 ---> 이따구로 임의의 값이 출력될거임.
			// 객체에 할당된 값을 문자열로 바꿔줌.
		sc.close();
	}
}












