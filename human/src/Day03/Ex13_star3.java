package Day03;

import java.util.Scanner;

public class Ex13_star3 {
public static void main(String[] args) {
	
	// 큰 반복문 
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt(); //N은 스캐너에서 받은 int 형식의 숫자임
	//i 가 1일때는 공백이 X, 별은 N개 출력
	//i 가 2일때부터 공백이 1개 별은 N-1개 출력
	// 첫줄에 공백은 0 별은 5
	// 두번째줄에 공백은 1 별은 4
	// 세번째줄에 공백은 2 별은 3
	for (int i = 1; i <= N ; i++) { //i는 1부터 시작하는데 I
		for (int j = 1; j < i ; j++) {System.out.println("");}
			for (int k = 1; k < (N+1)-i; k++) {System.out.println("*");}
	}}}
