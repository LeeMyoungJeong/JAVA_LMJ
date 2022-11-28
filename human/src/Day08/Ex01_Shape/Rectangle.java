package Day08.Ex01_Shape;

public class Rectangle extends Shape {

	double width, height; //double 형태의 가로, 세로 변수 정의
	
	public Rectangle() {
			super(); //shape 라는 부모클래스의 기본 생성자를 호출
	}
	public Rectangle(double width, double height ) {
		this.width = width;
		this.height = height;
		
	}
	
	
	
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return 0;
	}

}
