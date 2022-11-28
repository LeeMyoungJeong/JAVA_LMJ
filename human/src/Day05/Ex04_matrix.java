package Day05;

import java.util.Scanner;

public class Ex04_matrix {
	public static void main(String[] args) {
		// 양의 정수 M과 N을 입력받아 저장하고,
		// M행 N열의 2차원 배열을 생성한다.
		// 각 요소의 값을 입력받고, 그대로 출력하시오.
		// 입력예시) 
		// M : 2
		// N : 3
		// 1 2 3
		// 4 5 6 
		// 출력예시
		// 1 2 3
		// 4 5 6 
		// 같은 과정을 한 번 더, X행 Y열로 입력받고 출력하시오.
		// 단, X행 Y열의 2차원 배열은 foreach문을 이용하여 출력하시오.
		// 2차원배열을 입력받고 출력하는거임
		/*  
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int M, N, X, Y;
		System.out.print("M : ");
		M = sc.nextInt();
		System.out.print("N : ");
		N = sc.nextInt();
		int arr[][] = new int[M][N];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();			}
		}											  // arr[][] 이라는 행렬이 있다고 해보자 그럼,
		for (int i = 0; i < arr.length; i++) {		  // arr의 length는 행의 길이
			
			for (int j = 0; j < arr[i].length; j++) { //arr[i] length는 i라는 행에 속한 배열의 길이 - 그러니까 열의 길이
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
		}
		
		//여기 아래에서부터는 foreach 쓰는거다.
		
		System.out.print("X : ");   // X와 Y를 스캐너로 입력받음
		X = sc.nextInt();
		System.out.print("Y : ");
		Y = sc.nextInt();
		
		int arr2[][] = new int[X][Y];  // 입력받은 X와 Y로 
									   //새로운 2차열 배열을 생성, 행은 X만큼의 인덱스, 열은 Y만큼의 인덱스.
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = sc.nextInt(); //arr2의 
				}
		}
		for (int[] row : arr2 ) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
			sc.close();
		}
	
	}	
}
