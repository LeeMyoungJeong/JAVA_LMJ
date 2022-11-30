package Day08.Ex01_Shape;

public class PointAnswer {

 
	
	
	int x, y;
	 
	// 에러문이 생성 되길래 class이름을 바꿔줬더니
	
	
	// 기본 생성자
	public PointAnswer() { //Return type for the method is missing
		this(0, 0); //Return type for the method is missing
	} 
	
	
	// 매개변수가 있는 생성자
	public PointAnswer(int x, int y) {//Return type for the method is missing
		this.x = x;
		this.y = y;
	} 	// class이름만 바꿔줘도 변수가 return이 되었다.

	
	// toString()
	// : Source 메뉴 (alt + shift + S : S)
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
