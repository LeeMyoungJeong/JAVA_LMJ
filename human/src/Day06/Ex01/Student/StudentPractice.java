package Day06.Ex01.Student;

public class StudentPractice {

	// 학생의 속성을 정의할 수 있는 변수를 정의해야함.
	// 변수 나열해보자.

	String name;	//이름		---> 얘네들 변수 4개를 주석처리해보니까 
 	String stdNo;	//번호		---> 아래의 생성자의 변수가 변수로 지정이 안되네...
	String major;	//전공		---> 변수는 미리 지정해놔야 생성자에서 초기화해서 사용 가능하다??
	int age;		//나이    .... 자 그다음에
	int sum = 0;
	
	//생성자 호출
	
	public StudentPractice() {
	}  // StudentPractice 라는 클래스 자체를 생성자로 호출해준다.
	//public Student1() {}  ---> 얘는 리턴타입이 필요하니까 student1에 에러가 발생
	
	public StudentPractice(String name, int age, String stdNo, String major) {
		this.name = name;
		this.stdNo = stdNo;
		this.major = major;
		this.age = age;
	}	
	//이제 학생의 행동을 메소드로 객체화해서 기능으로 나타내보자.
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다. ");
	}
	// 영어/수학의 평균을 도출해보자
	
	//지금 여기서 getScore이라는 메소드를 정의했다. 스코어 1과 2를 사용해서
	public double getScore(int score1, int score2) { //void가 없어서 아래에서 리턴되야함.
		double average = 0.0;
		average = (double)(score1 + score2) / 2;
		return average;
	}
	
	// 메소드 오버로딩
	// 근데 여기서 또 getScore이라는 메소드를 스코어1,2,3d을 통해서 average라는 값을 도출하는
	// 새로운 메소드로 사용해버려....
	// 근데 에러가 없어 ㅅㅂ... 너무신기하네
	public double getScore(int score1, int score2, int score3) {
		double average = 0;
		average = (double)(score1 + score2 + score3) / 3;
		return average;
	}
	// 메소드 오버로딩을 한번 더 해보자
	public double getScore (int[]scores) {
		double average= 0.0;
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		this.sum  = sum;
		average = (double) sum/ scores.length;
		return average;
	}
	
}
