package Day10.Ex01_TriCatch;

import java.util.InputMismatchException;
import java.util.Scanner;
public class InputMismatch {

	public static void main(String[] args) {
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		///////////////////////////////// 여기 코드 하나 빠져있다.
		int menuNo = sc.nextInt();  	//예외발생 가능성 있는 문장
		do {
		System.out.println("1. Java");
		System.out.println("2. HTML");
		System.out.println("3. CSS");
		System.out.println("4. JavaScript");
		System.out.println("0. 종료");
		
		System.out.println("메뉴 입력 : ");
		
		// try~catch 예외처리문 작성
		try { 
			menuNo = sc.nextInt(); 
		}
		catch(InputMismatchException e) { //에러가 났던 이유는 클래스 이름이 같았기 때문에 ctrl + shift 눌러도 자동완성이 안되었기 때문.
			sc.next(); // 입력 스트림에 남아있는 엔터 토큰 제거
			//No exception of type InputMismatchException can be thrown; 
			//an exception type must be a subclass of Throwable
			System.out.println("(0~4) 사이의 정수를 입력해주세요");
			continue; //  continue가 무엇이던가?? -- 아래 남아있는 실행문을 무시하고
					  //  위의 반복문을 실행하는것.
		}
		
		// 종료 조건
		if( menuNo == 0) break;
		
		switch (menuNo) {
		case 1 : menuName = "Java";
				break;
		case 2 : menuName = "HTML";
				break;
		case 3 : menuName = "CSS";
				break;
		case 4 : menuName = "JavaScript";
				break;
		default : menuName = "선택없음";
				break;
		}
		System.out.println(menuName +"을/를 공부합니다.");
		
		}while (true);
		
	
		sc.close();
	
	}	
}
