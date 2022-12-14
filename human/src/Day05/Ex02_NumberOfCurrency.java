package Day05;

import java.util.Scanner;

public class Ex02_NumberOfCurrency {
		// 이거 팁 계산하는 프로그램 만들수있을거같은디..... 
		/*
			금액 	: 534760
			50000 	: 10개
			10000 	: 3매
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
	//  순서도를 작성하는 연습을 해봐라.
	// ------- 변수 선언을 받는다
	// 1. 금액을 입력받는다 스캐너로
	// 2. 입력된 금액을 제일 큰 화폐 단위로 나눈다. 
	// ------- 몇번 나뉘었는지 기억한다.
	// 
	// 3. 나머지를 그 다음 화폐 단위로 나눈다.
	// 4. 맨 마지막에 나뉜 금액별로 나뉜 횟수 = "권종  : " +   + "매" 
	// 534760 이란 숫자를 어떻게 연산해야 10이라는 값을 얻을지
	// 534760 연산 ㄱㄱ --> 나머지 얻기
	// 나머지 연산 ㄱㄱ ---> 몫 얻기 --> 변수에 저장 --> 나머지 얻기
	// 나머지 얻은걸 다시 권종으로 나눈다 ---> 몫을 얻어서 변수에 저장.
	// 권종 변수를 배열로 받으면 되는구나...ㅅㅂ
	
	/*	0. 변수 선언을 먼저 받는다.
	 *  1. (입력금액), (화폐매수), (화폐단위)
	  	2. 화폐 매수를 입력받는다
		3. 화폐 매수를 계산함.
			[조건] : 큰 화폐 단위부터 계산한다.
		 - 화폐 매수 계산은 어떻게 해야할까???
		  화폐매수 = 입력금액 / 화폐단위
		  count = 534760 / 50000 = 10
		 - 잔액 계산 
		 	(잔액) = (입력 금액) - (화폐 단위 X 화폐매수)
		 	(잔액) = (입력 금액) % (화폐단위)
		 - 화폐단위 변환
		  50000 	--> 10000 		: 50000 / 5
		  10000 	--> 5000		: 10000 / 2
		  5000  	--> 1000		: 5000  / 5  
		  1000 		--> 500			: 1000 	/ 2
		 
		4. 3의 과정을 반복
		   화폐 단위가 1보다 크거나 같으면, 반복한다.
		   
		5. 3-1에서 화폐매수를 구하여 출력한다. 	
	*/   
	public static void main(String[] args) {
		int input; 		// 입력 금액 - 변수를 선언
		int count;		// 화폐 매수
		int money = 50000; //50000원 상수 입력
		boolean sw = true;  //화폐단위 변환
		
		System.out.print("금액 : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt(); // input 이라는 변수는 금액 입력받는 변수
		//count = input % money;
		count = input / money; //count라는 변수는 input을 money로 나눠줘야 함.  - 변수를 갖고노는 방법
							   //count 변수는 입력값을 50000으로 나눈 몫을 의미함.
		input = input - (money * count); //여기 count에 에러 밑줄 있었던건 count가 뭔지 선언은 되었는데 
										 //값이 할당되어 있지 않아서 그렇다.
		
		money = money / 5;
		money = money / 2;  // 이 두개의 작업은 서로 스위칭이 되어야함. sw라는 스위치 변수를 만들어서 해야함
		
		//화폐단위가 1보다 크거나 같으면 반복한다.
		//화폐 단위는 money 
		while ( money >= 1) {
			if (sw) {
				money = money / 5;
				sw = false;
			} else {
				money = money / 2;
				sw = true;
			} sc.close();
					
		
		
		
		
	}
	
	
}
}
