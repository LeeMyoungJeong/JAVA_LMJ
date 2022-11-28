package Day03;

import java.util.Scanner;

// #### 점심메뉴판 ####
// 1. 김밥 - 분식집 
// 2. 설렁탕
// 3. 순대국밥
// 4. 맥도날드
// 0. 종료

public class EX07_doWhile {

	public static void main(String[] args) {
		//변수 선언 : 메뉴 번호, 메뉴 이름
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		// do~while 문
		// 무조건 1회는 실행하고 조건을 검사하여 반복하는 반복문
		do {
			System.out.println("### 점심메뉴판 ####");
			System.out.println("1. 김밥 - 분식집");
			System.out.println("2. 설렁탕");
			System.out.println("0. 종료");
			System.out.print("메뉴번호 : "); // 얘를 println으로 출력하면 콘솔창에서 값이 아래에 출력됨...
			
			//여기까지는 조건검사 없이 실행됨
			
			menuNo = sc.nextInt(); //이제 조건을 입력받음
 		
		// 무한루프 : 조건이 항상 true가 되는 경우 반복이 계속된다.
		// 반드시, 반복문 안에 종료조건을 넣어주어야 한다. 
		switch (menuNo) {
		case 1: menuName = "김밥" ;
		break;
		case 2: menuName = "설렁탕" ;
		break;
		
		default: menuName ="(없음)";
			break;
		}
		//메뉴번호가 0이 아니면, 
		if( menuNo != 0) 
		{System.out.println(menuName + "을 먹었습니다.");}}
		
		while (menuNo != 0);
		System.out.println("메뉴판을 종료합니다.");
}
}