package Day03;
import java.util.Iterator;
import java.util.Scanner;
public class Ex11_Star1 {

	
	public static void main(String[] args) {
		// 자연수 N을 입력받아, 삼각형 모양의 "*" 출력하시오.
		// 입력 : 5
		// 출력 :
		//*
		//**
		//***
		//****
		//*****
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		  //System.out.println(sc.nextInt());
		int c = sc.nextInt();
 
		for (int i = 1 ; i <= c; i++) {
			for (int j = 1; j <= c; j++) {
				System.out.print("*");	
				} //문제 -> 문제 -> 1353
			System.out.println();
		}
		
		sc.close();
	}
}
