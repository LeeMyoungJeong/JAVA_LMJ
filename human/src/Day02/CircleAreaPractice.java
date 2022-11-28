package Day02;

public class CircleAreaPractice {
	// 원주율을 상수로 선언하고 2가지 원의 넓이를 구해봐라
		//1. 반지름이 5인 원의 넓이를 구해서 나타내봐라
		//2. 반지름이 3인 원의 넓이를 구해서 나타내는데 math.pow 함수 사용해봐라
	public static void main(String[] args) {
		
	
	final double PI = 3.14; // 원주율을 상수로 선언함.
	int radius1 = 5;
	int radius2 = 3;
	System.out.println("1번 원의 넓이 : " + radius1 * radius1 * PI);
	System.out.println("2번 원의 넓이 : " + Math.pow( radius2 ,2)* PI);
		
	}	
	
	
	
	
}
