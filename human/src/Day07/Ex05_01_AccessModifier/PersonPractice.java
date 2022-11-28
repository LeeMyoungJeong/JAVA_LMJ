package Day07.Ex05_01_AccessModifier;

public class PersonPractice {
	//0501은 Person을 정의
	//0502는 Student를 정의함

	// public 접근 지정. Student 접근 가능
	// protected 접근 지정. Student 접근가능. 그렇지만 상속받은게 아니면 접근 불가
	// default 접근 지정. Student 접근 불가.
	// Private 접근 지정. Student 접근 불가.
	
	public String name;
	protected int height;
	int age;		// int 앞에 아무것도 안붙여서 default임.
					// 같은패키지에서 가능, 다른패키지에서 접근가능
	private int weight; 	// private은 PersonPractice 에서만 접근 가능
	
	// 생성자
	public PersonPractice() {
	}
	
	public PersonPractice(String name, int height, int age, int weight) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.weight = weight;
	}
	// getter, setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
	










}
