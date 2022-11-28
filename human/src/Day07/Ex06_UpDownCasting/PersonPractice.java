package Day07.Ex06_UpDownCasting;
//업다운캐스팅 복습하기
public class PersonPractice {
	
	String name;
	int age;
	
	public PersonPractice() {
	 this("이름없음", 0);
	}
	public PersonPractice(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String work() {
		return "일을 합니다.";
	}
	@Override
	public String toString() {
		return "PersonPractice [name=" + name + ", age=" + age + "]";
	}
	
	
}
