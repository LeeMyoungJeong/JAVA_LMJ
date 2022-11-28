package Day08.Ex01_Shape;

// shape 클래스를 구현하시오 : shape이라는 추상클래스를 상속받아서 오버라이딩해라(ㅅㅂ무슨말인가....)
// 
public class Triangle extends Shape {
//The type Triangle must implement the inherited abstract method Shape.area() 
	
	// 기본생성자 - super() 호출
	
	// 매개변수가 있는 생성자
	
	double width, height;
	public Triangle(double width, double height) {
		
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	double area() {
		// (가로) x (세로) /2
		return width * height / 2;
	}


	
}
