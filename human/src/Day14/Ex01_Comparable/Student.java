package Day14.Ex01_Comparable;

public class Student implements Comparable<Student> {

	String name;
	int age;
	int grade;
	
	
	// 생성자
	public Student() {
	
	}
	

	
	public Student(String name, int age, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	// toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}



	@Override
	public int compareTo(Student o) {
		// 이번엔 이름순으로 오름차순 / 내림차순
		int gap = this.getName().compareTo(o.getName());
		// getName으로 이름 가져와서 compareTo가 인자로 받은 이름을 비교한다. 
		// 해당 객체가 더 앞선 순서다 --> 음수 
		// 순서가 같다 		--> 0
		// 해당 객체가 더 뒤쪽 순서다 --> 양수
		
		return gap;
	}
	
	
}
