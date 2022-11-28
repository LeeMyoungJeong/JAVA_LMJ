package Day07.Ex05_02_AccessModifier;

import Day07.Ex05_01_AccessModifier.Person;

public class Manager {

	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		
		System.out.println("name :" + student.name);
		System.out.println("heingt :" + student.getHeight());
		System.out.println("age : " + student.getAge());
		System.out.println("weight :" + student.getWeight());
		
		Person person = new Person(); //Person cannot be resolved to a type 라는 에러창 뜸
									// 그래서 컨트롤 쉬프트 O 누름
									// Person 을 import 해와야함
		System.out.println("name :" + person.name);
		System.out.println("heingt :" + person.getHeight());
		System.out.println("age : " + person.getAge());
		System.out.println("weight :" + person.getWeight());
		
		
	}
	
}
