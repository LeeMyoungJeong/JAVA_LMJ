package 과제종합;
/*
//------------ 치킨 메뉴판 -----------
//1. 교촌	- 허니콤보치킨
//2. BBQ	- 황금올리브반반치킨
//3. 도미노	   
//4. 시장통닭	 
//0. 종료
//------------ 입력 :
*/

import java.util.ArrayList;
import java.util.Scanner;

// [접근지정자] [반환타입] [메소드명] 
public class MS_05Pr {

	public static void showMenu() {
		System.out.println("########## 입력 : ");
		System.out.println("1. 교촌 - 허니콤보치킨");
		System.out.println("2. BBQ - 황금올리브치킨");
		System.out.println("3. 시장통닭 ");
		System.out.println("4. 도미노피자 ");
		System.out.println("0. 종료");
		System.out.print("########## 입력 : ");
	}

	public static void main(String[] args) {
		
		
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		ArrayList <String> list = new ArrayList<>();
		
		do {
			showMenu();
			menuNo = sc.nextInt();
			
			switch (menuNo) {
			case 0: System.out.println("총 " + list.size() + " 개의 상품이 주문되었습니다.");
					break;
			case 1: menuName = "허니콤보치킨";
					list.add("허니콤보치킨");
					break;
			case 2: menuName = "황금올리브치킨";
					list.add("황금올리브치킨");
					break;
			case 3 : menuName = "시장통닭";
					list.add("시장통닭");
					break;
			case 4: menuName = "도미노피자";
					list.add("도미노피자");
					break;
			default: menuName = "(선택안함)";
					break;
			}
				if(menuNo == 0) { break;}
				if(menuNo >=0 && menuNo <= 4 ) {
					System.out.println(menuName + "이 주문되었습니다.");
				}else {System.out.println( "0~4 번 사이의 숫자를 입력해주세요");
				}
	}
		while(true);
	
	}
}
	
	

