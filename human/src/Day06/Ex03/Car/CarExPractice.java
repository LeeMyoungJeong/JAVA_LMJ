package Day06.Ex03.Car;

public class CarExPractice {
	public static void main(String[] args) {
		// 객체 생성
		CarPractice car = new CarPractice();
		//CarPractice에서 생성자를 정의하지 않았더니 CarPracticeEx에서 car라는 변수 선언이 안됨.
		car.model = "제네시스";
		//car.speed = 100;
		//speed는 private 변수라서 speed에 접근이 불가능하다.
		car.setSpeed(120);
		System.out.println("모델명 : " + car.model);
		System.out.println("speed : " + car.getSpeed()); //CarEx에서 값을 가져오는것이 아니라 Car클래스에서  speed메소드의 내용으로 
														//CarEx클래스의 speed 값을 처리함.
		// CarEx 에서 
	}
}

