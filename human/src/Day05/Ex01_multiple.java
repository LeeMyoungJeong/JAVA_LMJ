package Day05;

import java.util.Scanner;

// Scanner옆에 커서 놓고 컨트롤스페이스 하면 스캐너 패키지 임포트됨
public class Ex01_multiple {

	public static void main(String[] args) {
		// 정수 하나를 입력받아서, 
		// 입력받은 수가 3의 배수인지 아닌지 판단하고 그 여부를 출력하시오.
		// 3의 배수 → "3의 배수입니다."
		// 3의 배수 X → "3의 배수가 아닙니다."
		Scanner sc = new Scanner(System.in);	
		System.out.print("입력 : ");
		int N = sc.nextInt();
		if (N % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else { 
			System.out.println("3의 배수가 아닙니다.");
		}
		sc.close();
}
}