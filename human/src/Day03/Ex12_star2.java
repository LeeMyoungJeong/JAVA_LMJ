package Day03;

import java.util.Iterator;
import java.util.Scanner;

//아래와 같은 별표를 만들어라
//*****
//****
//***
//**
//*
public class Ex12_star2 {
	public static void main(String[] args) {
		System.out.println("입력값 : ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= (N+1)-i ; j++) {
				System.out.print("*"); //1+1>=5,2,3,45 
			}						   //*****
			System.out.println();
		}
		

	}
}
