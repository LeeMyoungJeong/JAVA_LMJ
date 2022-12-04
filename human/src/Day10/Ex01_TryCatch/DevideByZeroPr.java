package Day10.Ex01_TryCatch;

import java.util.Scanner;

public class DevideByZeroPr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.print("a 입력 : ");
		a = sc.nextInt();
		
		System.out.print("b 입력 : ");
		b = sc.nextInt();
		
		System.out.println(" a / b = " + a/b);
		
		try {
			System.out.println(" a / b = " + a/b);
		}
		catch(ArithmeticException e) {
			//예외 발생 시 예외 처리 문장
			// ArithmeticException 말고 그냥 Exception만 입력하면
			// 모든 예외에 대해서 catch 문을 실행할 수 있음
			// Exception 은 가장 상위단계의 예외 처리 키워드임
			// 0으로 나눴을 때 Arithmetic나오네
			System.out.println("0으로 나눌 수 없다 쉐기야");
		}
		catch (NullPointerException e) {
			//NullPointerException은 값이 없는 것을 연산했다는 것이다
			System.out.println("똑바로 해라 쉐기야");
		} 	
		sc.close();
		
	}
	
	
}
