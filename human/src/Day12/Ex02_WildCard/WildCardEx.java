package Day12.Ex02_WildCard;

import java.util.Arrays;

public class WildCardEx {
	// WildCardEx가 제네릭 클래스인가??
	// 제네릭 클래스는 아니다. 제네릭이 되려면 <> 붙어야 함.
	// 아래에서 정의한 메소드는 제네릭 메소드인가??
	// 제네릭 메소드들이 아니다. 다만 메소드의 매개변수나 리턴타입에 제네릭을 사용한것뿐임.
	
	// 수강생들이, 교육과정(Course)에 수강등록을 합니다.
	// 전체 이용가능 강의
	// 학생 전용 간의
	// 직장인 전용 강의
	
	
	// 전체 이용가능 강의 - 수강등록
	public static void joinCourse(Course<?> course ) {
		System.out.println(course.getName() + "수강생 : "
	+ Arrays.toString(course.getStudents()));
	}
	// 학생 전용 강의
	public static void joinCourseStudent(Course<? extends Student> course) {
	System.out.println(course.getName() + "수강생 : "
			+ Arrays.toString(course.getStudents()));  
}  //와일드카드를 쓰게 되는 이유???
	// 직장인 전용 강의
	public static void joincourseWorker(Course<? super Worker> course) {
		// worker가 person을 상속받는데 super 키워드 때문에 person, worker 둘 다 포함
		System.out.println(course.getName() + "수강생 : "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<> ("일반인과정", 5);
		personCourse.add(new Person ("일반인"));
		personCourse.add(new Worker ("직장인"));
		personCourse.add(new Student ("학생"));
		personCourse.add(new HighStudent ("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add( new Worker("직장인"));
		
		Course<Student> studCourse = new Course<>("학생과정", 5);
		studCourse.add(new Student("학생"));
		studCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		joinCourse(personCourse);
		joinCourse(workerCourse);
		joinCourse(studCourse);
		joinCourse(highStudentCourse);

		//joinCourseStudent(personCourse);
		//joinCourseStudent(workerCourse);
		joinCourseStudent(studCourse);
		joinCourseStudent(highStudentCourse);
		
		//joinCourseWorker(personCourse);
		joinCourseWorker(workerCourse);
		joinCourseWorker(studCourse);
		joinCourseWorker(highStudentCourse);
	}
	// 제네릭은 실무에서 잘 안쓰인다....
	


}


