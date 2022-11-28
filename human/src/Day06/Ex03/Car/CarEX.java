package Day06.Ex03.Car;

public class CarEX {
	public static void main(String[] args) {
		//객체생성
		Car car = new Car();
		car.model = "제네시스";
		car.setSpeed(180);
		System.out.println("모델명 : " + car.model);
		System.out.println("speed : " + car.getSpeed());
		// speed 변수에는 Car클래스에 private가 걸려있기 때문에 CarEx클래스에서는 불러올 수 없음.
		// 변수에 직접적으로 접근하는것은 불가능하다.
		// 값을 가져오는 메소드 하나를 선언을 해서 우회적으로 가져와야함.
		// car 객체의 
	}
}
