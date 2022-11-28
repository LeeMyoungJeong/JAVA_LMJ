package Day08.Ex01_Shape;

public class PointPractice {

	int x, y;
	
	// 기본 생성자
	public PointPractice() {
		this(0,0);
	}
	
	// 매개변수가 있는 생성자
	public PointPractice(int x, int y) {
		this.x= x;
		this.y= y;
	} // 매개변수가 있는 생성자를 없앴더니 ↓ 이따구로 나오네... 왜 이렇게 나왔을까..
		// 원형이 4번 나오고 값은 두번째 거 빼고 전부 동일하다.
	/*		[원형]
			넓이 : 28.274333882308138	
			둘레 : 18.84955592153876	

			[원형]
			넓이 : 12.566370614359172	
			둘레 : 12.566370614359172	

			[원형]
			넓이 : 28.274333882308138	
			둘레 : 18.84955592153876	

			[원형]
			넓이 : 28.274333882308138	
			둘레 : 18.84955592153876	

			둘레 총합 : 69.11503837897544
			넓이 총합 : 97.3893722612836
*/
	@Override
	public String toString() {
		return "PointPractice [x=" + x + ", y=" + y + "]";
	}
	


}
