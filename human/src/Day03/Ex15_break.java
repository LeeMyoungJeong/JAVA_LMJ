package Day03;

import java.util.Scanner;

public class Ex15_break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Stop 을 입력하면 종료합니다.");
		
		//무한루프
		// : 반드시 종료조건을 추가해주어야한다.(break)
		while(true) {
			System.out.print("입력 : ");
			String str = sc.nextLine();
			
			if( str.equals("Stop") )
				break;
			System.out.println(">>" + str);
		}
		System.out.println("프로그램을 종료합니다....");
		sc.close();
	}
	
	
}
