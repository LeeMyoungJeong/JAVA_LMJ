package Day06.Ex01.Student;

public class Student {

	 // 학생의 속성 : 이름, 나이, 학번, 전공
	 // 변수
	String name;
	int age;
	String stdNo;
	String major;
	
	 // 생성자 
	
	public Student() {
	}
	 // 생성자
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	
	}

	// 학생의 행동 (기능)
	 // 메소드
	 // void : 반환타입을 지정하지 않을 때 사용하는 키워드
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
	
		// 반환타입이 void면, return을 작성하지 않는다.
		
		
	}
	// 영수 평균 도출
	 // 메소드 오버로딩
	public double getScore(int score1, int score2, int score3) {
		double average = 0.0;
	
		// 평균 = 합계 / 개수  //개수는 매개변수가 2개 이므로 2로 고정
		average = (score1 + score2 + score3) / 3;
					// int 형태 변수 3개 더해서 나누고 소숫점 잃지 않으려면 double로 강제형변환 해줘야함.
		return average ;
	}
	public int getScore(int[] scores ) {
		double average = 0.0;
				int sum = 0;
				
		for (int i : scores) {
			// 최종합계 = 이전합계 + 과목점수
			sum += score;
			average = (double) sum / scores.length;
			
		}
		
		return average;
	}

}

