package Day07.Ex05_01_AccessModifier;

public class Person {
//0501 - person을 정의
//0502 - student를 정의
	
	// public 접근 지정. Student 접근 가능
	// protected 접근 지정. Student 접근 가능. 상속받은게 아니면 접근 불가.
	// default 접근 지정. Student 접근 불가.
	// private 접근 지정. Student 접근 불가.
	
	public String name;
	protected int height;
	int age; //defualt로 접근지정자 선언 , 같은패키지에서 가능, 다른패키지에서 접근 가능.
	private int weight; //private는 person class에서만 접근 가능

	// 생성자
	public Person() {

	}

	public Person(String name, int height, int age, int weight) {
		this.name = name;
		this.height = height;
		//this.age = age;
		//this.weight = weight;
	}
	// 게러세러
	
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