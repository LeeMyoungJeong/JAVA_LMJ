package Day04;

import java.util.Iterator;
import java.util.Scanner;

public class Ex03_arrays {
	public static void main(String[] args) {
		// [][]
		// [][][][]
		// [][][]
		// 2차원 배열 선언 및 생성
		// 비정방 행렬 배열
		// 
		int[][] a = new int[3][]; // a라는 배열은 3행만 지정, 일단 첫번째 차원만 차원배정을 해줌

		a[0] = new int[2]; //0이라는 이름을 가진 배열은 int타입 인덱스 2개짜리 배열
		a[1] = new int[4]; //1이라는 이름을 가진 배열은 int타입 인덱스 4개짜리 배열
		a[2] = new int[3]; //2라는 이름을 가진 배열은 int타입 인덱스 3개짜리 배열 생성
		// [] -- > 2칸
		// [] -- > 4칸
		// [] -- > 3칸
		// 입력

		Scanner sc = new Scanner(System.in);
		// 중첩 반복문(이중 반복문)
		// 아래거가 바깥 반복문 - 행 (i)
		for (int i = 0; i < a.length; i++) {
			// 안쪽 반복문 = 열(j)
			for (int j = 0; j < a[i].length; j++) {//두번째 차원의 배열 길이
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
