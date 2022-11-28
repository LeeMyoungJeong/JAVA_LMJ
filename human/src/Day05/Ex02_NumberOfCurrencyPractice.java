package Day05;

import java.util.Scanner;

/*금액 	: 534760 							입력을 받는 스캐너 필요
50000 	: 10개								나눌 값을 나타낼 변수 필요
10000 	: 3매								나눈 값을 받아 저장할 변수
5000 	: 0매								
1000 	: 4매
500 	: 3매
100 	: 3매
50	 	: 3매
10 		: 3매
5 		: 3매
1 		: 3매
 위와 같이 금액을 입력하면, 
 큰 화폐단위부터 계산하여 화폐 단위별로 화폐매수를
 출력하는 프로그램을 작성하시오.
 */

public class Ex02_NumberOfCurrencyPractice {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오 : ");
		int input = sc.nextInt();
		int omanwon = 50000;
		int count = input; 
		boolean sw = true;
		//input = input - (count*omanwon);
		
		while(omanwon >=1) {
			count = input / omanwon;
			
			System.out.println(omanwon + "\t : "+ count + "개");
			
			input = input % omanwon;

			if(sw) {

				omanwon = omanwon /5;
				sw = false;
			} else {
				omanwon = omanwon /2;
				sw = !sw;
			}
		
		
		}
		
		
}
	
	
}
