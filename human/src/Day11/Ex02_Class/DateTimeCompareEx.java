package Day11.Ex02_Class;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareEx {
// static은 
//교재로는 11장 마지막 실습코드임	
	public static void main(String[] args) {
		//2022년 11월 10일 9시 0분  0초
		LocalDateTime startDateTime = LocalDateTime.of(2022,  11, 10, 9, 0, 0);
		System.out.println("시작일 : " + startDateTime);
		
		// 2023년 6월 29일 18시 0분 0초
		LocalDateTime endDateTime = LocalDateTime.of(2023,  6, 27, 18, 0, 0);
		System.out.println("종료일 : " + endDateTime);
	
		// 현재 날짜 및 시간
		LocalDateTime nowTime = LocalDateTime.now();
		
		// isBefore(), isEqual(), isAfter()
		// : LocalDateTime 객체가 인자로 지정한 객체와 비교하여
		// 시간순으로 이전인지 일치하는지 이후인지 확인하여 여부를 true/false로 반환.
		if (nowTime.isBefore(endDateTime)) {
			System.out.println("훈련과정 진행 중입니다.");
		} 
		else if (nowTime.isEqual(endDateTime)) {
			System.out.println("종강합니다.");
		}
		else if (nowTime.isBefore(startDateTime)) {
			System.out.println("훈련과정 개강 전입니다.");
		}
		else if (nowTime.isEqual(startDateTime)) {
			System.out.println("개강합니다.");
		}
		else if (nowTime.isAfter(startDateTime)) {
			System.out.println("개강일이 지났습니다.");
		}
		
		// until() 메소드
		// : LocalDateTime 객체의 날짜/시간부터 인자로 지정한 객체의 날짜/시간까지
		// 남은 시간을 반환하는 메소드
		long remainYear =  startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth =  startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remaindy =  startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainhr =  startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainscnd =  startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 년도 : "+ remainYear);
		System.out.println("남은 개월 수 : "+ remainMonth);
		System.out.println("남은 일 수 : "+ remaindy);
		System.out.println("남은 시간 " + remainhr);
		System.out.println("남은 초 " + remainscnd);
		System.out.println();
		// between() 메소드
		// ChronoUnit.상수.between(시작일자, 종료일자)
		// : 시작일자와 종료일자 사이의 남은 시간을 지정한 상수 단위에 맞게 반환한다.
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remaindy = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainhr = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainscnd = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		
		System.out.println("남은 년도 : "+ remainYear);
		System.out.println("남은 개월 수 : "+ remainMonth);
		System.out.println("남은 일 수 : "+ remaindy);
		System.out.println("남은 시간 " + remainhr);
		System.out.println("남은 초 " + remainscnd);
		System.out.println();
		
		
	
	}
}
