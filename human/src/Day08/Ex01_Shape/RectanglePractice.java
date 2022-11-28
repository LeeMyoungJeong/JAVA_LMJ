package Day08.Ex01_Shape;

public class RectanglePractice extends ShapePractice {
 // 지금 The type RectanglePractice must implement the inherited abstract method ShapePractice.area()
 // 이딴 에러문이 뜨는데 해석해보니까 상속된 추상메소드를 실행해야 한다고 뜬다
 // 과연 추상메소드 내부의 area, round 실행시키면 에러문이 없어지는지 함 보자.
	// round랑 area 오버라이딩 시키니까 바로없어지노
	
	double width, height;
	
	public RectanglePractice() {
		super();
	}
	
	public RectanglePractice(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double round() {
		return width * 4;
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	public String toString() {
		return "RectanglePractice [width=" + width + ", height=" + height + "]";
	}
	

}