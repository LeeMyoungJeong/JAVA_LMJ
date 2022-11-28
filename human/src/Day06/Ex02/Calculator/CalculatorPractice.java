package Day06.Ex02.Calculator;
/*
 *  계산기
 *  - 피연산자를 2개로 하는 계산기
 *  - 기능
 *  	1. 덧셈	: 정수 2개를 덧셈(a, b)
 *  	2. 뺄셈	: 인자1 - 인자2 연산
 *  	3. 곱셈	: 실수 2개를 곱셈
 *  	4. 나눗셈 : 실수 인자1 / 인자 2
 *    	5. 나머지 : 정수 인자 1 % 인자 2 연산
 *  	6. 합계 	: 배열을 매개변수로 전달받아, 모든 요소의 합을 구함.
 *  	7. 평균	: 배열을 매개변수로 전달받아, 평균을 구함.
 * 
 */
public class CalculatorPractice {
	
	public int plus (int a , int b){
		int result = a+ b;
		return result;
	}

	public int minus (int a, int b) {
		int result = a-b;
		return result;
	}

	public int multiple (int a, int b) {
		int result = a*b;
		return result;
	}
	public double devide (double a, double b) {
		double result =  a/  b;
		return result;
		
	}
	public double sum(int[]baeyeoll) {
		int sum = 0;
		for (int i : baeyeoll) {
			sum = sum + i;
		}return sum;
	}
	
	public int remain(int a, int b) {
		int result = a % b;
		return result;
	}	
	
	public double average(int [] baeyeoll) {
		double sum = sum(baeyeoll);
		double average = (double) sum / baeyeoll.length;
		return average;
	}
	
	
	
	
	
	
	
	
	
}
