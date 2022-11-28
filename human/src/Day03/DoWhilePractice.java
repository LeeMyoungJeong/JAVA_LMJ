package Day03;

import java.util.Scanner;
import java.util.random.RandomGeneratorFactory;

public class DoWhilePractice {
	// #### 점심메뉴판 #### ---------메뉴판 만들기
	// 1. 김밥 - 분식집 
	// 2. 설렁탕
	// 3. 순대국밥
	// 4. 맥도날드
	// 0. 종료
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String menuName = null;
		int menuNo;
		do { System.out.println("#### 점심메뉴판 ####");
		System.out.println("1. 분식집 - 김밥");
		System.out.println("2. 순대국집 - 순대국");
		System.out.println("3. 설렁탕집 - 설렁탕");
		System.out.println("4. 맥도날드 - 햄버거");
		System.out.println("0. 종료");
		System.out.print("메뉴선택 : ");
		menuNo = sc.nextInt();
		
		switch (menuNo) {
		case 1: menuName = "김밥";
			break;
		case 2: menuName = "순대국";
		break;
		case 3: menuName = "설렁탕"; 
		break;
		case 4: menuName = "햄버거"; 
		break;
		default:
			break;
		} if(menuNo != 0) {
			System.out.print( menuName + "을 먹었습니다.");
			System.out.println();
			System.out.println();
		}}	
			while(menuNo != 0);  // while 이하의 조건문이 False면 종료, True면 반복
			System.out.println("종료합니다.");
		
		}
	}

		 
	
	
	
	
	
	


