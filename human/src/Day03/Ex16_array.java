package Day03;

public class Ex16_array {
	public static void main(String[] args) {
		// 배열 선언
		int arr[];
		// 배열 생성. 배열의 이름은 arr
		arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;			// 배열이름옆[]괄호 안에는 배열 위치 인덱스 넘버
		arr[3] = 4;			// ;옆의 숫자는 배열에 들어간 각 값
		arr[4] = 5;
		// 배열의 길이 : 배열요소의 개수 = 배열.length
		int N = arr.length;
		System.out.println("배열의 길이 : " + N);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	
	
	}
}
