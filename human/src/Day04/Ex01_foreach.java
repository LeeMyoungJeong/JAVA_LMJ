package Day04;

import java.util.Iterator;

public class Ex01_foreach {
	public static void main(String[] args) {
		String week[] = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		//string 타입으로 구성된 week라는 이름의 배열 변수 선언. 
		//인자는 7개로 구성
		
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + " ");
		}
		System.out.println();
		//for문을 통해서  
		
		
		// for each 문
		// - 배열 또는 컬렉션등의 모든 요소를 순회하는 반복문
		// for(요소타입 요소명 : [배열/컬렉션]) {}
		for (String day : week) {
			System.out.print(day + " "); // "+"랑 "=" 이거 구별 잘해라.
		}
		System.out.println();

	}

}
