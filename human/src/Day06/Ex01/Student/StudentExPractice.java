package Day06.Ex01.Student;

public class StudentExPractice {
	
	public static void main(String[] args) { //메인메소드 실행
		//student 객체 생성
		
		StudentPractice student = new StudentPractice();
		student.name = "김휴먼";
		student.age = 20;
		student.stdNo = "202200013";
		student.major = "컴공";
		
		StudentPractice 김통깨 = new StudentPractice("김통깨", 31, "202203015", "조꽈");
		
		//성적 2개를 배열로 입력받자.
		int[] scores1 = {1,2,3,4,5};
		int[] scores2 = {10,20,30,40,50};
		
		System.out.println("##### 학생 1 #####");
		System.out.println("학생 1 - 이름 :" + student.name);
		System.out.println("학생 1 - 나이 :" + student.age);
		System.out.println("학생 1 - 학번 :" + student.stdNo);
		System.out.println("학생 1 - 전공 :" + student.major);
		System.out.println("학생 1 - 최종점수 :" + student.getScore(scores1));
		
		
		
		System.out.println("##### 학생 2 #####");
		System.out.println("학생 1 - 이름 :" + 김통깨.name);
		System.out.println("학생 1 - 나이 :" + 김통깨.age);
		System.out.println("학생 1 - 학번 :" + 김통깨.stdNo);
		System.out.println("학생 1 - 전공 :" + 김통깨.major);
		System.out.println("학생 1 - 최종점수 :" + 김통깨.getScore(scores2));
		
		
		
		}
	
	
	
	
	
	}
	
	

