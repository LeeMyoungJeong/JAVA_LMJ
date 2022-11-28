package Day07.Ex01_ObjectArray;

// 반지름이 1~5인 Circle객체 5개를 가지는 배열을 생성하고,
// 배열요소에 있는 모든 Circle 객체의 면적(넓이)를 구하시오

// 1. 배열부터 생성한다.
// 2. class 정의가 필요한가? 배열의 index 요소 ^2 * 3.14;
// 일단 해보자 여기까지 생각한거도 꽤 유의미하다.
 class Circle {
	//변수 		: 반지름
	//메소드		: 넓이
	int radius; 
	// ↑ 여기까지 한거만 일단 살펴보면 Circle 이라는 클래스를 정의했다.
	// Circle 클래스에는 int형식의 radius 변수만 들어있다.
	
	//생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	// ↑ Circle 이라는 class를 활용하기 위해서는 생성자정의를 해줘야한다.
	// public 말고 private으로 바꿔도 오류는 나지 않는다.--> 그러나 메인메소드 실행은 불가. 
	// private으로 쓰면 문법적으로 오류는 없지만 메인메소드는 class Circle 밖에 정의되어있기 때문에
	// private으로 적으면 안된다. protected는 가능하더라...
	
	// 메소드
	public double getnb() { // 넓이(nb)를 겟하는 메소드를 정의해보자..
		// 원의 넓이 = 반지름*반지름*pi;
		return 3.14*radius*radius;  //진짜 함수랑 똑같네...
		// ↑↑↑↑↑↑ 함수의 기능을 한다. 
		
	// ↑ 이건 넓이를 구하는 공식이면서 함수이면서 메소드인데, 
	// 왜 꼭 Circle 이라는 class 안에 넣어줘야 하지??
	}
}

public class CircleArrayPractice {

	public static void main(String[] args) { //메인메소드 생성.
		//Circle[]c;			// Circle 배열에 대한 레퍼런스 c 선언
		//c= new Circle[5];	// 5개의 요소를 갖는 배열 생성
		
		Circle [] c = new Circle [7];  // Circle 이라는 클래스 안의 정의된 정보로 5개의 배열이 만들어진다??
										// 7로 바꾸니까 넓이를 7번 반환하네...
		for (int i = 0; i < c.length; i++) {
			//반지름이 1~5인 Circle 객체 5개 생성 후 배열요소에 대입
			c[i] = new Circle(i+1); //c라는 배열의 index 안의 요소를 i+1로 정의한다. 그걸 5회 실행.
			
		}
		 // 자료형 변수명 : 배열명
		for (Circle aaa : c) { // 배열 c에 대해서 aaa라는 변수명으로 아래의 반복문을 실행해라.
			System.out.println("넓이 : " + (aaa.getnb()));
			// "넓이 : " 에다가 aaa라는 자료형 변수에 c라는 배열을 getnb라는 함수로 조진 것을 넣어서 프린트해라. 
		}	
	}
	
}
