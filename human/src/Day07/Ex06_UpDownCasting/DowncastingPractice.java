package Day07.Ex06_UpDownCasting;

public class DowncastingPractice {
	public static void main(String[] args) {
		PersonPractice person = new StudentPractice("김휴먼", 20, 1,"뮤지컬학과");
		
		System.out.println(person);
		System.out.println(person.work());
		
		// 다운캐스팅 (강제 형 변환)
		// : 전제조건 - 업캐스팅
		// 다운캐스팅은 업캐스팅 된 부모객체를 자식객체로 변환하는 것
		StudentPractice student = (StudentPractice) person;
		// ↑ person 이라는 객체를 (StudentPractice)로 강제형변환해서 그걸 student 에 대입하냐??
		System.out.println(student.grade);
		System.out.println(student.major);
		//System.out.println(person.age);
		//System.out.println(person.name);
		
	}
}
