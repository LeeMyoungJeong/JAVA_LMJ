package Day05;

import java.util.Scanner;

// 정수 하나를 입력받아서, 
		// 입력받은 수가 3의 배수인지 아닌지 판단하고 그 여부를 출력하시오.
		// 3의 배수 → "3의 배수입니다."
		// 3의 배수 X → "3의 배수가 아닙니다."
public class Ex01_multiplePractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수하나를 입력하시오 : ");
		
		int a = sc.nextInt();
		if (a % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {System.out.println("3의 배수가 아닙니다.");
	}
}	
}	

