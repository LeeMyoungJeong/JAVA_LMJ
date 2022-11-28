//자연수 N을 입력받아, 삼각형 모양의 "*" 출력하시오.
// 입력 : 5
// 출력 :
//*
//**
//***
//****
//*****
package Day03;
import java.util.*;
public class star1Practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //입력받을 값 넣을 창 ex) 5
		
		for(int i = 1 ; i <=N ; i++) {
			// i는 1부터 시작한다. 그리고 i 가 N(5)보다 작으면 아래 명령을 수행하고 1 증가
	
			for (int j = 1; j <= i; j++) {
				//j라는 변수는 1이야 근데 i가 j보다 같거나 작으면 아래 명령을 반복수행하고 j를 1증가시켜
				System.out.print("*");
				
			}
			System.out.println();
				
	}
}
}
