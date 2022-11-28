package Day07.Ex06_UpDownCasting;

public class StudentPractice extends PersonPractice{

	int grade;
	String major;

	public StudentPractice() {
		this("이름없음", 0, 0, "없음");
	}
	
	public StudentPractice(String name, int age, int grade, String major) {
		super(name, age);
		this.grade = grade;
		this.major = major;
	}
	
	public String work() {
		return "공부를 합니다.";
	}

	@Override
	public String toString() {
		return "StudentPractice [grade=" + grade + ", major=" + major + "]";
	}
	
	
}
