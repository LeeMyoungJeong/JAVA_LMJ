package Day04;


import java.util.Scanner;

public class Ex06_ZigzagPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int [n][n]; // 2차원 배열 생성했다.
		int k = 1; //결과값 출력에 쓰일 임의의 변수
		int sw = 1; // 방향 전환에 쓰일 임의의 변수
		
		
		
		for (int i = 0; i < n; i++) {
			
			if(sw == 1) {
				for (int j = 0; j < n ; j++) {
					System.out.println(" i : " + i + ",j : " + j + ",k : " + k);
					arr[i][j] = k++; //i가 행이고 j가 열이구나...
					}
			}// 그래서 j의 0번째 인덱스부터 k의 값을 하나씩 넣어주는구나 okok
			
			
			if(sw == -1){
				for (int j = n-1 ; j >= 0 ; j--) {
					System.out.println(" i : " + i + ",j" + j + "k : " + k);
						arr[i][j] = k++;
					}
			}
			sw *= -1 ;
		}
			
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j] + " ");
			}
					System.out.println();
			}
		/**1번에 있는 벌레 클릭하신 후
콘솔창에 숫자 입력하시면 우측에 variable에 숫자 뜰거에요
그다음 3번에 있는 resume 누르면 진행돼요
		 * 
		 */
	}
	
	
}
