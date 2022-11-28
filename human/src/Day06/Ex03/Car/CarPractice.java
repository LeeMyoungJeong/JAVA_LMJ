package Day06.Ex03.Car;
//Car를 정의해보자
//교재에서는 변수를 필드라고 부를거다.

public class CarPractice {//내 클래스 이름은 CarPractice니까{

	//멤버변수 == 필드 
	// public은 안붙이면 default 값이 됨.
	// private은 변수나 클래스 앞에 붙일 수 있음.
	
	String model;
	private int speed;  // 변수 2개 정의했다. speed는 private 붙여서 이 클래스 내에서만 접근 가능하게끔 함.
	
	//생성자
	CarPractice() {
		//이 클래스 다시 불러옴.
	}
	CarPractice(String model) {
		this.model = model;
	}
	//CarPractice(String model, int speed) {
	//	this.model = model;
	//	this.speed = speed;
	//}
	//getter : 변수의 값을 가져오는 메소드
	//setter : 변수의 값을 지정하는 메소드
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() { //getSpeed라는 메소드에 speed를 return 해라.
		return speed;
	}//이 부분에 대한 개념정의가 없다. 왜 필요한지 모르겠다.
	
	public void setSpeed(int speed) { //setSpeed에 speed값을 리턴 할때 아래의 실행문을 참고해라.
		if(speed <0) {
			speed = 0;
		}
		this.speed = speed;
	}
}




