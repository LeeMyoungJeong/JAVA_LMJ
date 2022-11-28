package Day12.Ex02_WildCard;

import java.util.Iterator;

// course를 제네릭 클래스로 정의해보자
public class Course<T> { // 얘는 단지 Course라는 클래스 
	
		private String name;
		private T[] students;	// 제네릭타입 배열
		
		public Course(String name, int capacity) {
			this.name = name;
			// Object 배열요소 생성
			// (T[]) --> 그걸 제네릭 타입으로 변환
			students = (T[]) (new Object[capacity]); 
		}
	
		
		public String getName() {
			return name;
		}
		
		public T[] getStudents() {
			return students;
		}
		
		public void add(T t) {
			// 비어있는 배열요소에 전달받은 객체를 대입.
			for (int i = 0; i < students.length; i++) {
				if( students[i] == null) {//요소가 null이면
					students[i] = t; //넘어온 타입의 객체를 추가해줌.
					break;
				}
			}
		}
		
}
