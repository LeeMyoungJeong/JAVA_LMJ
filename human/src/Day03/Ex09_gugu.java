package Day03;

import java.util.Scanner;

public class Ex09_gugu {

	
		public static void main(String[] args) {
			//구구단(2~9단)
			// 원하는 단을 입력받아 아래와 같이 구구단 수식을 출력하시오
			// 입력 : 3
			// 출력 : 3 6 9 12 15 18 21 .....
			// 9회 반복해야 함.
			// (입력 단) X (반복변수 1:9) = 결과
			Scanner sc = new Scanner(System.in);
			
			int input = sc.nextInt();
			for (int i = 1;  i <=9 ; i++) {
				
				int result = input * i;
				System.out.println(input + "*" + i + "=" + result);
			}
			
			sc.close();
			
			
			
			
		}
}
