package Day04; //문제 1503: 지그재그 입력(2차원 배열)

import java.util.Scanner;

// 하나의 정수를 입력받아 다음과 같이 작성하시오.
// 지그재그로 출력하시오.
// N이 5라면 다음과 같이 출력한다.

// 1  2  3  4  5
// 10  9  8  7  6
// 11 12 13 14 15
// 20 19 18 17 16
// 21 22 23 24 25

// 해야할것
// 1. 변수 N 선언, 2차원 배열 arr 선언, 증가하는 수 k 선언
// 2. 정수 N 입력
// 3. 2차원 배열 지그재그로 채우기
          // 홀수행 -> 증가
          // 짝수행 <- 증가

// i 로는 행
 // j 로는 열
 // i :1, j= 0 ---> N-1 , j++
 // i :2 j=N-1 ---> j--
public class Ex06_zigzag {
	public static void main(String[] args) {//메인메소드 생성
		Scanner sc = new Scanner(System.in);//일단 스캐너 생성해서
		int N = sc.nextInt(); //N이라는 변수에 스캐너에 입력되는걸 넣고
		int k = 1;  // 결과값 출력에 쓰일 임의의 변수
		int sw = 1; // 방향 전환에 쓰일 임의의 변수
		int [][] arr = new int[N][N];  //N행N열의 배열 생성
		
		for (int i = 0 ; i < arr.length; i++) {
			if(sw == 1) {
				for (int j = 0; j < N; j++) {
					// sw : 1 --> 정방향
						arr[i][j] = k++;
						}
				if( sw == -1 ) {
					for (int j = N-1;  j >= 0 ; j--) {
						arr[i][j] = k++;
					}
				}			
				sw = sw * (-1);  //sw *= -1;   //방향 전환
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.println(arr[i][j] + " ");
				}
			}
		
				// sw : -1 --> 역방향
				
	
			}
			System.out.println();
		}
		System.out.print(k + " ");
	} 
}