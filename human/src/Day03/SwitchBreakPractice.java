package Day03;

import java.util.Scanner;

public class SwitchBreakPractice {
			// 입력받은 정수를 5로 나눈 나머지가 
			// 2보다 작으면 "*"
			// 그렇지 않으면 "**"를 출력하시오
			// (switch case)문을 사용하시오.
			// switch문은 if에 비해 간결하다. 
	
	public static void main(String[] args) {
		System.out.println("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch (input % 5)  {
		case 0 : System.out.println("*");
			break;
		case 1: System.out.println("*");
			break;
		case 2 : System.out.println("**");
			break;
		default: System.out.println("**");
		}
	}
	
}
