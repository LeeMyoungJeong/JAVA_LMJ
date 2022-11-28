package Day03;

import java.util.Iterator;

//3. 1~20까지 정수 중 짝수만 출력
//4. 1~20까지 정수 중 홀수만 출력
public class ForPractice2 {

	public static void main(String[] args) {
			//1. 1~10까지 정수를 출력하시오.
		int a = 0;
		int b = 0;
		int c = 0;
		/*
		 * for (int i = 0; i <= 10; i++) {
			a = i ; 
			System.out.println(a);
		}	
		System.out.println();
			//2. 50~100까지 정수를 출력하시오.
		for (int j = 50; j <= 100; j++) {
			a = j;
			System.out.println(a);
		}*/
		
		
		//3. 1~20까지 정수 중 짝수만 출력
		for (int i = 2; i <= 20; i += 2) {
						 
		System.out.println( i + "");
			
		}
		//4. 1~20까지 정수 중 홀수만 출력
		for (int i = 1 ; i < 20; i += 2) {
			System.out.println(i + "");
		}
	
	
	}
}
	

