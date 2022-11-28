package Day03;

import java.util.Scanner;

public class maxPractice {
	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N을 입력받고,
		// 둘째 줄에는 N개의 정수를 공백을두고 입력받으시오.
		// N개의 정수 중, 최댓값을 구하여 출력하시오.

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arrr[] = new int[N];
		
				for (int i = 0; i < arrr.length; i++) {
					//여기서 arr.length;는 arr이라는 배열이름을뜻함
				arrr[i] = sc.nextInt();} 
				int max = arrr[0];
						for (int i = 0; i < arrr.length; i++) {
							
						if(max < arrr[i]) {
							max = arrr[i];}
						}
							System.out.println("최댓값 : " + max);
							sc.close();
						} 
				
				
						
				}




