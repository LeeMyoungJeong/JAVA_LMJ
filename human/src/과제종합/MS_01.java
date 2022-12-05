package 과제종합;

import java.util.Scanner;

// 학생의 영어, 수학, 자바 성적을 각각 정수형 변수 eng, math, java로 선언하고
// 순서대로 점수를 입력 받아 성적의 총 합계와 평균을 계산하여 출력하는 프로그램을 작성하시오

public class MS_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eng = 0;
		int math = 0;
		int java = 0;
		int sum = 0;
		double avg = 0.0; 
		
		int arr[] = new int [3];	
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		eng = arr[0];
		math = arr[1];
		java = arr[2];
		
		sum = arr[0] + arr[1] + arr[2];
		avg = (arr[0] + arr[1] + arr[2]) / arr.length;
		 
		
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("java 점수 : " + java);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
