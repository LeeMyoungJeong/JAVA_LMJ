package 과제종합;

import java.util.Scanner;

//학생 5명의 JAVA 프로그래밍 성적을 입력 받아, 1차원 배열에 저장하고 
//성적을 기준으로 오름차순, 내림차순으로 각각 출력하시오.
// 정렬 방식은 선택, 버블, 삽입정렬 중 하나의 정렬 방식을 이용하시오.
public class MS_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int N = sc.nextInt();
		int arr[] = new int [5];
		int i;
		int j;
		int n;
		int temp;
		
		
		for ( i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		} //학생 5명의 성적을 입력하면 배열에 저장됨
		
		for (i = 0; i < arr.length; i++) {
			for (j = i ; j <= 5-2; j++) {
				if(arr[j] < arr[j+1]) {
					temp = arr[j+1];
				}
			if(arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			
			}
				
			}
		for (i = 0; i < arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
		
		
	}

