package Day08.Ex01_Shape;

import java.awt.List;
import java.util.Scanner;

public class ShapeMaker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null; //shape 라는 변수에는 값이 없음=null값을 대입.
		double width = 0.0;
		double height = 0.0;
		double radius = 0.0;
		
		// 총합
		double roundSum = 0.0;
		double areaSum = 0.0;		
		
		// 리스트 : 동적 자료구조 (컬렉션)
		// 여기서는 Shape 객체들을 담는 목록이다.
		List<Shape> list = new LinkedList<Shape>();
		
		while(true) {
			System.out.println("1.삼각형, 2.사각형, 3.원형");
			System.out.print(">>");
			String input = sc.next();
			
			if(input.equals("그만"))break;
			int menuNo = Integer.parseInt(input); // 문자열 --> (정수) 변환
			switch (menuNo) {
			case 1: 
					System.out.print("가로>>");
					width = sc.nextDouble();
					System.out.print("높이>>");
					height = sc.nextDouble();
					shape = new Triangle(width, height);
					list.add(shape);
					break;
			case 2: 
				System.out.print("가로>>");
				width = sc.nextDouble();
				System.out.print("높이>>");
				height = sc.nextDouble();
				shape = new Rectangle(width, height);
				list.add(shape);
				break;
			case 3: 
				System.out.print("가로>>");
				width = sc.nextDouble();
				System.out.print("높이>>");
				height = sc.nextDouble();
				shape = new Circle(radius);
				list.add(shape);
				break;
			default:
			}
		}
	}
	
}
