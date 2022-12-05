package 과제종합;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//로또만들기
// 정수 N을 입력받아 N개의 게임의 로또 번호를 출력하시오
// 즉 6개의 배열요소를 갖는 1차원 배열을 선언하여 1~45사이의 랜덤한 값을 중복되지 않도록
// 저장하고 출력하는 과정을 N번 반복하시오
// 중복체크도 해야한다.

public class MS_06Pr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 게임? : ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.print("["+ i + "게임] : " );
			int[] lotto = new int [6]; //인덱스 6개짜리 배열을 형성한다.
			
			for (int j = 0; j < 6; j++) { // 반복문 한개 더 생성
				int rand = (int)(Math.random() * 45 + 1);
				// 1부터 시작하는 소숫점은 빼버리는 int 타입의 랜덤숫자를 반환한다.
				lotto[j] = rand; // rand로 출력된 숫자들을 lotto의 index0부터 5까지 입력시킨다 
								 // 여기까지가 로또 한줄 완성
				
				for (int k = 0; k < lotto.length; k++) {
					if( j == k ) continue; //만약 j 가 k와 같지 않으면 컨티뉴를 못하네..
					if(rand == lotto[k]) { // rand == lotto[k]가 같다면 j--해서 다시 뽑아라?
						j--;		//ㅇㅋ 이해했음..
						break;
					}
				}
			}	
				// 오름차순 정렬
				Arrays.sort(lotto);//lotto라는 배열을 정렬하는 메소드
				for (int j = 0; j < lotto.length; j++) {
					System.out.print(lotto[j] + " ");
				} //lotto의 값들을 출력해줘라
				System.out.println();
			
		}
		sc.close();
	}
}
