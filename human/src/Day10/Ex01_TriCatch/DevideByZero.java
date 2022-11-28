package Day10.Ex01_TriCatch;

import java.util.Scanner;

public class DevideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;		// 나뉨수(피제수)
		int b; 		// 제수(제수)
		
		System.out.print("a 입력 : ");
		a = sc.nextInt();
		
		System.out.print("b 입력 : ");
		b = sc.nextInt();

		System.out.println("a / b = " + a / b);
	
		try {
			System.out.println("a / b =" + a / b);
		}
		catch( ArithmeticException e) {
			//예외 발생 시, 예외 처리 문장
			// arithmeticException 스펠링 틀려서 에러떴었음.
			// 만약에 ArithmeticException 말고 그냥 Exception만 쓰면
			// 모든 예외에 대해서 catch문을 실행할 수 있음
			// Exception은 가장 상위단계의 예외 처리 키워드임.
			System.out.println("0으로 못나눈다 쉐기야");
		}
		catch( NullPointerException e) {
			//nullpointerexception은 값이 없는 것을 연산했다는거임
			System.out.println("똑바로해라쉐기야");
		}
		finally { //finally 블록은 생략 가능함
			sc.close();
		}
		
		sc.close();
	}	
	
	
}
