package Day02;

import java.util.Scanner;

public class NestedPractice {
	// 정보처리기사 자격증 합격기준
	// 4학년이면서 70점 이상 취득했을 시 가능.
	// 점수와 학년을 입력받고 두 조건에 부합하면 합격, 부합하지 않으면 불합격
	// 그리고 4학년이 아니면 "응시 자격요건에 부합하지 않습니다" 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if(grade >= 4 && score >= 70 ) {
				System.out.println("합격입니다.");
			}
		if(score <= 69) {
			System.out.println("불합격입니다.");
		}
		if(grade <= 3) {
			System.out.println("응시 자격요건에 부합하지 않습니다.");
		}
	}




}
