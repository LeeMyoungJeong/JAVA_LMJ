package Day06.Ex03.Car;
//Car를 정의해보자
//교재에서는 변수를 필드라고 부를거임.
public class Car {

	// 멤버변수 == 필드
	// public은 안붙이면 default임
	// private은 변수나 클래스 앞에 붙일수있음.
	
	
	String model;
	private int speed; //변수 앞에 private을 붙이면 해당 클래스 내에서만 접근 가능함.
	
	//생성자
	Car() {
	}
	
	//getter : 변수의 값을 가져오는 메소드
	//setter : 변수의 값을 지정하는 메소드
	//(String model) {
	//	this.model = model;
		
	
	Car(String model, int speed){
		this.model = model;
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed <0) {
			speed = 0;
		}
		this.speed = speed;
	}
	
}