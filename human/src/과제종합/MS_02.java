package 과제종합;

import java.util.Iterator;
import java.util.Scanner;

// 정수 하나를 입력받아, 정수형 변수 N에 초기화시키고, 정수 1부터 N까지 홀수의 합계와
// 짝수의 합계 그리고 정수 N 의 약수를 구하여 예시 <출력>과 같이 출력하는 프로그램을 작성하시오
/**
 * • (설명)
10을 입력받아서,
1번 줄에는 1~N에 대한 홀수의 수식 및 합계,
2번 줄에는 1~N에 대한 짝수의 수식 및 합계,
3번 줄에는 N의 약수를 출력하시오.

 */

public class MS_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력받을 sc
		int N = sc.nextInt(); // 입력받은 수
		int odd = 3; // 입력받은 수 까지의 홀수를 저장할 배열이 필요하다.
		int even = 4; // 입력받은 수 까지의 짝수를 저장할 배열이 필요하다.
							//출력문은 홀수의 '1번째 인덱스' '+' 마지막 인덱스까지 
							// 그다음 '=' 그리고 oddSum
		int oddSum = 0;
		int evenSum = 0;
		int k = 1;
		
		
		//int factor = 0; //약수를 또 표기해야 하는데 약수를 집어 넣을 배열이 필요하다.
						  // 약수는 1부터 그 수까지 나눴는데 나머지가 0인 숫자를 의미한다.
		for (int i = 0; i <= N; i++) {
			if(i % 2 == 1) {
				i = i+2;
			}
		}	
		
		
		
		System.out.print("1");
			do { 
				if(odd%2==1) {System.out.print( "+" + odd );
				oddSum = odd + oddSum;
				}
				odd++;
			} while (odd<=N);
				System.out.print("=");
				System.out.print(oddSum + 1);
		System.out.println();
		
		System.out.print("2");
			do { 
				if(even%2==0) {System.out.print( "+" + even );
				evenSum = even + evenSum;
				}
				even++;
			} while (even<=N);
				System.out.print("=");
				System.out.println(evenSum + 2);		
				
		for (int i = 1; i <= N; i++) {
			if(N % i == 0) {
				System.out.print(i + " ");
			}
		}
				
	}
}
		
	


