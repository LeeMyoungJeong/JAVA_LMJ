package Day03;

import java.util.Scanner;

public class Ex02_grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학점 : ");
		// A, B, C, D, E, F 와 같은 값을 입력받음
		char grade = sc.next().charAt(0);
		//소문자로 입력해도 값을 반환받고 싶으면 어떻게 하냐면
		//			sc.next(); 얘는 string type으로 받음.//
		//sc.next().toUpperCase();  --> 대문자로 변환해줌
		// charAt(0)  --->  문자열에서 문자를 해당 index에서 추출
		// "ABC"	---> A는 0번 B는 1번, C는 2번 
		// charAt(0) 인덱스의 0번째 문자를 추출한다.
		switch (grade) {
		case 'A':
			System.out.println("90~100");
			break;
		case 'B':
			System.out.println("80~89");
			break;
		case 'C':
			System.out.println("70~79");
			break;
		case 'D':
			System.out.println("60~69");
			break;
		case 'F':
			System.out.println("60점 미만이다.");
			break;

		default:
			System.out.println("A~F 사이의 문자를 입력해라");
			break;
		}
		sc.close();
		
	}
	

}
