package Day08.Ex01_Shape;

//abstract : 추상클래스 / 메소드를 지정하는 키워드
public abstract class Shape {
	//클래스 앞에 abstract를 붙여 Shape이라는 클래스가 다른 클래스들의
	//공통된 특징들을 함의하고 있음을 선언함.
	
	Point point; //Point 클래스에서 point라는 변수를 불러옴??
	
	// 생성자 정의
	public Shape() { // Public 하게 접근할 수 있는 이 Shape이라는 클래스는...
		
	}
	
	// 넓이와 둘레를 구하는 메소드 원형을 정의하시오.
	// 추상 메소드 :
	// : {} 중괄호 블록 없이 메소드 원형만을 정의하고,
	// 자식 클래스에서 반드시 오버라이딩 해야만 사용할 수 있는 메소드를 추상메소드라고 한다.
	// 형식 : abstract 반환타입 메소드명(매개변수);
	abstract double round();	// 둘레
	abstract double area(); 	// 넓이  //객체를 따로 구현하지 않고 선언만 했음.
	// 그 다음에 getter, setter 메소드를 정의해라			  // 객체를 생성할 수 없다. 추상클래스에서는
	///추상클래스를 상속한 서브 클래스에서 구현해서 사용할 수 있다.
	//목적 : 다형성을 실현
	// 설계와 구현을 분리할 수 있음.

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	

	
}
