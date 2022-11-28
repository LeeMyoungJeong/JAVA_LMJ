package Day08.Ex01_Shape;

public class Circle extends Shape {

	double radius; // double 형식의 반지름 변수를 정의 
	
	public Circle() { //public : 접근 제한(다른 패키지에서도 아무런 제한 없이 
					  // Circle 이라는 변수 사용 가능.
		super();  
		// super,
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	double area() {
		return Math.PI * radius * radius;
	}
	double round() {
		return 2* Math.PI * radius;
	}
	public String tostring() {
		return "Circle [radius=" + radius + "]";
	}//toString은 도대체 뭐냐 ㅅㅂ 이해가 안가네...
	
}
