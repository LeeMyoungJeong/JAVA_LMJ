package Ex02_Class;

import java.util.Iterator;

public class MathEx {
	public static void main(String[] args) {
		
		System.out.println(Math.PI); 			//3.141592653589793
		System.out.println(Math.ceil(3.125));	// 올림
		System.out.println(Math.floor(3.75));	// 내림
		System.out.println(Math.sqrt(9));		// 제곱근
		System.out.println(Math.pow(3,2));
		System.out.println(Math.exp(2));
		System.out.println(Math.exp(2));
		System.out.println(Math.round(3.14));

		//로또 번호
		//[1,45] 사이의 정수형 난수 6개 만들기
		// Math.random() : 0.0 보다 크거나 같고 1.보다 작은 임의의 실수를 반환
		// (0.xxx ~ 0.9xx) * 45 : 0.xxx ~ 44.xxx
		// ((0.xxx ~ 0.9xx) * 45)+1 : 1.xxx ~ 45.xxx
		// ((0.xxx ~ 0.9xx) * 45)+1 : 1.xxx ~ 45.xxx
		// (int) ((Math.random() *45)+1) : 1~45
	
		
		// [공식]
		// (int) (Math.random() * [개수] + [시작숫자] )
		System.out.println("행운의번호는");
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45+1);
			System.out.println(random + " ");
		}
		System.out.println();
		
		
		// -20 ~ +20사이의 랜덤수 1개를 출력하시오.	
		// -20 ~~ -1 까지가 20개다
		// 0 포함 21개
		// 20까지 하면 41개임
		
		int random = (int) (Math.random() * 41-20); 
		System.out.println("(-20 ~ +20)까지의 숫자 아무거나 하나 뱉어내라 : " + random);
		}
}
