package Day10.Ex01_TryCatch;

import java.util.Scanner;

public class IndexOutOfBound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 요소의 개수 : ");
		int N = sc.nextInt();
		int [] arr = new int [N];
		
		System.out.println("접근할 index : ");
		int index = sc.nextInt();
		System.out.println("입력할 값 : ");
		int input = sc.nextInt();
		
		
		
		try {
			arr[index] = input;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스의 범위를 초과함");
			System.out.println("(0~" + (N-1) +  ") 사이의 정수를 입력해라" );
		}
		sc.close();
	}
	
	}
	
	

