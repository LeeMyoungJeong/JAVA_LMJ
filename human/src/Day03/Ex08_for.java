package Day03;

public class Ex08_for {
        // 초-조-실-증
	
	public static void main(String[] args) {
		// for (초기식 ; 조건식 ; 증감식) {실행문; }
		
		
		// 1. 1~10까지 정수를 출력하시오.
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		// 2. 50~100까지 정수를 출력하시오.
		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
			
			
		}
		System.out.println();
		// 3. 1~20까지 정수 중 짝수만 출력
		for (int i =2; i <= 20; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 4. 1~20까지 정수 중 홀수만 출력
		for (int i = 1; i <= 20; i +=2) {
			System.out.print(i +" ");
			
		}
		System.out.println();
	}
}
