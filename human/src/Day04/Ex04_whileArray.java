package Day04;

import java.util.Iterator;
import java.util.Scanner;

public class Ex04_whileArray {
	public static void main(String[] args) {
		// 정수 5개를 입력받아 배열에 저장하고,
		// Y를 입력하면, 한 번 더 입력,
		// N을 입력하면 종료하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in); //스캐너 불러온다.
		int arr[] = new int[5]; //인덱스가 5개인 배열 생성. 이름은 arr
		String finish ="";
		//do-while은 do{}의 내용을 한번 때리고 while이하의 결과가 true 라면 do의 실행문을 반복
		
		do {
			System.out.println("정수 5개 입력");
			
			//실제 입력
			// 1^2^3^4^5
			//^ : 띄어쓰기
			// <- : 엔터
			//5까지 sc.nextInt();로 입력받아서 배열에 저장되고,
			// 엔터 까지가 입력버퍼에 남아있다.
			
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			} 
			sc.nextLine();  // 얘가 엔터를 버퍼에서 빼줌. 그래서 써야함 
		 	//새로 문자열을 입력받는다.
			System.out.println("다시 입력?(Y/N) : ");
		 	finish = sc.nextLine();
		 	System.out.println(finish);
		 	//그런데 문자열이 비교가 안됨.
		 	//문자열 자체의 비교는 equals()메소드로 한다.
		} while (finish.equals("Y"));
				// Y를 누르면 do{}이하의 실행문을 반복하는데, N을 누르면 반복하지 않고 do-while 문을 종료시킴
		sc.close();
	}
}


	
	


