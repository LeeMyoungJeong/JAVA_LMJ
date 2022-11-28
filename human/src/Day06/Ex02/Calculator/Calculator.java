package Day06.Ex02.Calculator;
/*
 *  계산기
 *  - 피연산자를 2개로 하는 계산기
 *  - 기능
 *  	1. 덧셈	: 정수 2개를 덧셈(a, b
 *  	2. 뺄셈	: 인자1 - 인자2 연산
 *  	3. 곱셈	: 실수 2개를 곱셈
 *  	4. 나눗셈 : 실수 인자1 / 인자 2
 *    	5. 나머지 : 정수 인자 1 % 인자 2 연산
 *  	6. 합계 	: 배열을 매개변수로 전달받아, 모든 요소의 합을 구함.
 *  	7. 평균	: 배열을 매개변수로 전달받아, 평균을 구함.
 * 
 */
public class Calculator {
	//덧셈
	public int plus(int a, int b) {
		int result = a + b;
		return result;
		//return result;			//변수는 중괄호 내부에서 선언을 했으면 변수 내부에서 할당이 되고 중괄호
								//바깥으로 빠지면 값이 초기화뒘.
	}
	//뻴셈
	public int minus(int a, int b) {
		int result = a - b;
		return result;				//return 메소드는 명령 이행 하고 메소드가 종료됨.
									//이름은 같지만 실제로 존재하는 대상은 다름.
  	}                      
	//나눗셈
	public double devide(int a, int b) {
		double result =  a / b;
		return result;
	}
	//나머지 
	public int remain(int a, int b) {
		int result = a % b;
		return result;
	}
	
	//합계
	public double sum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i; //sum = i + sum
		}return sum;
	}
	// 평균
	public double avg(int[] arr) {
		double sum = sum(arr);					//위의 sum을 아래 avg로 불러온다??
		double avg = (double) sum / arr.length;
		return avg;
	}
	
	}



