package Day08.Ex01_Shape;

public class CirclePractice extends ShapePractice {
	
	double radius;
	
	public CirclePractice() {
		super();
	}
	
	public CirclePractice(double radius) {
		this.radius= radius;
		
	}

	@Override
	double area() {
		// 원주율 * 반지름 * 반지름
		return Math.PI * radius * radius;
	}

	@Override
	double round() {
		// 2 * 원주율 * 반지름
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "CirclePractice [radius=" + radius + "]";
	}
	
}
