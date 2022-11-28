package Day01;

import java.util.Scanner;

public class Ex02_intro2 {

	// 자 문제는 이거다 명정아 뭐냐면
	// 자기소개(이름, 나이, 주소)
	// 그 밑에 키(정수), 몸무게(실수) 표기해봐라
	
	public static void main(String[] args) {
		
		System.out.println("이름, 나이, 주소 입력해라");
		Scanner sc = new Scanner(System.in);
				
		String 이름 = sc.next();
		System.out.println("이름 : " + 이름);
		String 나이 = sc.next();
		System.out.println("나이 : " + 나이);
		String 주소 = sc.next();
		System.out.println("주소 : " + 주소);
	
	
		System.out.println();
		int 키 = sc.nextInt();
		System.out.println("키 :" + 키);
		double 몸무게 = sc.nextDouble();
		System.out.println("몸무게 :" + 키);
		
		sc.close();
		
		
				
				
		
		
		
		
		
		
	}
	
	
	
}
