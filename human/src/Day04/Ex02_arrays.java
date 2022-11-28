package Day04;

import java.util.Iterator;

public class Ex02_arrays {

	public static void main(String[] args) {
		int arr[][]	= new int[2][3]; //int형태의 arr이라는 이름을 가진 배열인데
									// 인덱스 2개짜리를 3개 만들어라....
		
		
		
		
		arr [0][0] = 1; // 첫째 배열의 0번 인덱스 + 둘째 배열의 0번 인덱스 
		arr [0][1] = 2; // 첫째 배열의 0번 인덱스 + 둘째 배열의 1번 인덱스
		arr [0][2] = 3;
		
		arr [1][0] = 4;
		arr [1][1] = 5;
		arr [1][2] = 6;
		
		// error 생성됨  java.lang.ArrayIndexOutOfBoundsException
		// 범위를 넘어서버림....
		// 접근할 수 없는 범위의 인덱스에 접근할때 발생하는 예외임.
	
		// arr [2][0] = 10;
		// arr.length : 첫번째 차원의 배열요소의 개수
		// arr[i].length : 두번째 차원의 배열요소의 개수
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		
	}
}
