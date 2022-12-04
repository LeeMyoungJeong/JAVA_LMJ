package Day05;

import java.util.Scanner;

/*
// ------------ 치킨 메뉴판 -----------
// 1. 교촌	- 허니콤보치킨
// 2. BBQ	- 황금올리브반반치킨
// 3. 도미노	   
// 4. 시장통닭	 
// 0. 종료
// ------------ 입력 :

* 메뉴번호에 따라 메뉴 변수에 해당메뉴를 저장해주고,
* "(해당메뉴)가 주문되었습니다" 라고 출력하시오.
* 0을 입력하기 전까지 반복하고,
* 0을 입력하면 반복을 종료합니다.
* 종료 시, "주문을 종료합니다."라고 출력하시오.
* 
*
*/
public class Ex05_ChickenMenu {
	// 메소드 : 코드의 모음.
	// 메소드 정의
	// [접근지정자] (static) [반환타입] [메소드명] (매개변수1, 매개변수2) {코드모음; }
	// 메소드 호출 
	// 메소드명(전달인자1, 전달인자2);
		// 메소드 = 함수 ( 전달하는 인자를 받아서 특정 값을 출력해줌)(전달인자 : argument) 
		// 메소드를 정의하는 쪽에서 함수 안에 들어가는 값은 - 매개변수 "parameter"
	
	
	// 들여쓰기 : tab
	// 내어쓰기 : shift + tab
	// 코드정리 : ctrl + shift +F  --beautify (가독성 확보)
	
	public static void showMenu() {
		System.out.println("####### 입 력 : ");
		System.out.println("1. 교촌	- 허니콤보치킨");
		System.out.println("2. BBQ	- 황금올리브반반치킨");
		System.out.println("3. 도미노");
		System.out.println("4. 시장통닭");
		System.out.println("0. 종료");
		System.out.println("####### 입 력 : ");
		}
	
	public static void main(String[] args) {
		//변수 선언
		int menuNo = 0;			//메뉴번호
		String menuName = "";
		int N = 0;
		Scanner sc = new Scanner(System.in);
		do {
			//메뉴판 출력
			showMenu();
			
			
			menuNo = sc.nextInt();
			if(menuNo == 0) break;
			System.out.println("총" + N + " 개의 상품이 주문되었습니다.");
			// switch 쓰면 간단하다.
			switch (menuNo) {
			case 1 : menuName = "허니콤보치킨";
					break;
			case 2 : menuName = "황금올리브반반치킨";
					break;
			case 3 : menuName = "도미노피자";
					break;
			case 4 : menuName = "시장통닭";
					break;
			//여기서는 디폴트 어떻게 가져가냐
			default: menuName = "(선택안함)";	//혹은 비워도됨 like --> " "						 
					break;
			}
			//만약에 10 누르면 유효하지 않음. 따라서 유효성 검사를 해줘야함.
			if(menuNo >= 0 && menuNo <= 4) {
				System.out.println(menuName + "이 주문되었습니다.");
			} else {
				System.out.println("0~4번 사이의 숫자를 입력해주세요.");
			}
		}//메뉴판에 0이 입력 안되면 위의 실행문을 반복할거임.
		//따라서 메뉴넘버에 0이 입력이 되었는지검사해야함.
		while(true);
		} 
	
	}  //종료시 "??개의 주문을 완료하였습니다. "라고 출력하는것은 과제......

