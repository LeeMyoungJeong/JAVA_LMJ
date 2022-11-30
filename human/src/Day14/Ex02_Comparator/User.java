package Day14.Ex02_Comparator;
//User가 먼저고 UserList가 그 다음이다.
import java.util.Comparator;

public class User implements Comparator<User>{

	String id;
	String name;
	int age;
	
	//생성자
	public User() {
	}

	// 매개변수를 갖는 생성자
	public User(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// getter, setter
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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

	// toString
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(User o1, User o2) { //compare라는 메소드 생성
		// add unimplemented method 했음(5번째 줄 User 에러에서)
		// 전달된 2 객체를 비교함 
		// 비교해서 
		
		// 1차 정렬 : 나이순 - 오름차순
		// 2차 정렬 : 이름순 - 오름차순
		
		int gap = o1.getName().compareTo( o2.getName());
		//첫번째 object1 으로부터 name를 가져온다 그런다음에 o2의 name보다 앞서면 음수
		// o1.name 가 o2.name 보다 더 뒤에나오면 양수
		
		return gap;
	}
	
		
	
	
}
