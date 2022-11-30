package Day14.Ex01_Comparable;

public class Person implements Comparable <Person> {
			//add umimplemented method 하면 맨 아래에 compareTo 메소드가 자동추가됨
			// comparable 인터페이스에 compareTo가 정의되어있음.
	String name;			// 이름
	int age;				// 나이를 변수로 선언
	
	// 생성자
	
	public Person() {
	}
	
	// 매개변수가 있는 생성자 
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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
	
	@Override
	public int compareTo(Person o) { //Person o 는 비교객체임 
		int gap = this.getAge()- o.getAge(); // 비교객체.나이 - 해당객체.나이
				//   해당객체       비교객체
				// 해당객체. 나이  - 비교객체.나이
				// 18 - 44 : 음수 --> 18을 더 앞에 정렬(오름차순)
				
				//  비교객체. 나이 - 해당객체. 나이
				// 44 - 18 : 양수 --> 18을 더 뒤에 정렬(내림차순)
		return gap;
	}
	
	
}
