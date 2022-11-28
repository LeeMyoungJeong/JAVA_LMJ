package Day02;

public class circleAreaPratice {
// 원주율을 상수로 선언하고 2가지 원의 넓이를 구해봐라
	//1. 반지름이 5인 원의 넓이를 구해서 나타내봐라
	//2. 반지름이 3인 원의 넓이를 구해서 나타내는데 math.pow 함수 사용해봐라

	public static void main(String[] args) {
		
		final double Pi = 3.14;
		double 반지름 = 5;
		System.out.println("1번 원의 넓이 : " + 반지름 * 반지름 * Pi);
		
		double 반지름2 = 3;
		System.out.println("2번 원의 넓이 : " + Math.pow(반지름2, 2)*Pi);
					//Math.pow(곱할거,제곱할 횟수)
	}
	
	
	
	
	
	
	
	
}
