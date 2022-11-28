package Day07.Ex04_StaticMember;

public class SingletonTestPractice {

	public static void main(String[] args) {
		SingletonPractice st01 = SingletonPractice.getInstance();
		SingletonPractice st02 = SingletonPractice.getInstance();
		//getInstance 메소드는 하나의 객체만 리턴하기 때문에 st01 과 st02는 동일한 객체를 참조함.
		System.out.println(st01 == st02);
	}
		
}
