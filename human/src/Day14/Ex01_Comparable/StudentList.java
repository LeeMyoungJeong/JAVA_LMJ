package Day14.Ex01_Comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		
		
		List <Student> studentList = new LinkedList<>();
		
		// LinkedList는 하나의 기능이다.
		// 오탈자가 있으면 안됨.
		
		Student s1 = new Student("김휴먼", 20, 1);
		Student s2 = new Student("이휴먼", 20, 1);
		Student s3 = new Student("나휴먼", 22, 2);
		Student s4 = new Student("박휴먼", 22, 2);
		Student s5 = new Student("황휴먼", 24, 3);
		Student s6 = new Student("한휴먼", 24, 3);
		Student s7 = new Student("정휴먼", 26, 3);
		Student s8 = new Student("김휴먼", 26, 4);
		Student s9 = new Student("윤휴문", 30, 3);
		Student s10 = new Student("구휴먼", 30, 1);
	
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		studentList.add(s8);
		studentList.add(s9);
		studentList.add(s10);
		
		Collections.sort(studentList);
		for (Student student : studentList) {
			System.out.println(student.name + " : " + student.age + " / " + student.grade);
		}
	}
	
}
