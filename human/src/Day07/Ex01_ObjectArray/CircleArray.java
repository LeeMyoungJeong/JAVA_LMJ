package Day07.Ex01_ObjectArray;
/* 
 * 반지름이 1~5인 Circle 객체 4개를 가지는 배열을 생성하고,
 * 배열요소에 있는 모든 Circle 객체의 면적을 출력하시오(넓이)
 * 
 * 
 * 
 */


class Circles {
	// 변수 : 반지름
	// 메소드 : 넓이
	
	//생성자
	int radius ;
	public Circle(int radius) {
		this.radius = radius;
	}
	//메소드
	public double getArea() {
		return 3.1 *radius *radius;
	}
}
public class CircleArray {
	public static void main(String[] args) {
		Circle [] c;			//Circle배열에 대한 레퍼런스 C 생성
		c = new Circle[5];		//5개의 요소를 갖는 배열 생성
		
		for (int i = 0; i < c.length; i++) {
			//반지름이 1~5인 Circle 객체 5개 생성 후 배열요소에 대입
			c[i] = new Circle(i+1);		
			}
		for (Circle circle : c) {
			System.out.println("넓이 : "+ (int)(circle.getArea()));
			
		}
	}
}
