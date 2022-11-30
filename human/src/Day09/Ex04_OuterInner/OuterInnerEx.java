package Day09.Ex04_OuterInner;

public class OuterInnerEx { 
	public static void main(String[] args) { //메인메소드로 실행 돌렸더니
		OuterPr outer = new OuterPr(); 		// OuterPr 생성자 생성해주고
		OuterPr.Inner inner = outer.new Inner(); // 이 부분이 이해가 안간다.
		inner.print();
	} 
	
	
}
