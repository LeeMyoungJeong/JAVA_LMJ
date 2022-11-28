package Day06.Ex01.Student;

public class StudentEx {

	public static void main(String[] args) {
		// student 객체 생성
		Student student = new Student();
		student.name ="김휴먼";
		student.age = 20;
		student.stdNo = "20225055";
		student.major = "컴퓨터공학과";
		
		// student 2 객체 생성(만들기)
		Student student2 = new Student("김통깨", 31, "2022", "201403023");
		//성적 2개를 배열로 입력받음.
		int[] scores = {10, 20, 30, 40, 50};
		int[] scores2 = {100, 100, 100, 90, 95};

		
		System.out.println("##### 학생1 #####");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 나이 : " + student.age);
		System.out.println("학생1 - 학번 : " + student.stdNo);
		System.out.println("학생1 - 전공 : " + student.major);
		System.out.println("학생1 - 최종점수 : " + student.getScore(scores));
		student.study("JAVA");
		System.out.println();
		
		System.out.println("##### 학생2 #####");
		System.out.println("학생2 - 이름 : " + student2.name);
		System.out.println("학생2 - 나이 : " + student2.age);
		System.out.println("학생2 - 학번 : " + student2.stdNo);
		System.out.println("학생2 - 전공 : " + student2.major);
		System.out.println("학생2 - 최종점수 : " + student.getScore(scores2));
		student.study("데이터베이스");
		
	}
}
