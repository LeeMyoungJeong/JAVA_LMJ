package Ex02_Class;

import java.util.Calendar;

public class CalendarEx {

	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 월(0~11)
		int day = cal.get(Calendar.DAY_OF_YEAR);
		int dayOfWeek = cal.get(Calendar.HOUR);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int hourOfDay = cal.get(Calendar.AM_PM);
		int ampm = cal.get(Calendar.MINUTE);
		int minute = cal.get(Calendar.SECOND);
		int second = cal.get(Calendar.SECOND);
		int Millisecond = cal.get(Calendar.MILLISECOND);
		System.out.println(msg + year + "/" + month + "/" + day + "/");
		
		//일요일(1) ~ 토요일(7)
		String Day = "";
		switch (dayOfWeek) {
		case Calendar.SUNDAY : 	Day = "일요일"; break;
		case Calendar.MONDAY : 	Day = "월요일"; break;
		case Calendar.TUESDAY : 	Day = "화요일"; break;
		case Calendar.WEDNESDAY: 	Day = "수요일"; break;
		case Calendar.THURSDAY : 	Day = "목요일"; break;
		case Calendar.FRIDAY :  	Day = "금요일"; break;
		case Calendar.SATURDAY : 	Day = "토요일"; break;
		}
		System.out.println(Day);
		System.out.println("(" + hourOfDay + "시");
		if (ampm == Calendar.AM)
			System.out.println("오전");
		if (ampm == Calendar.PM)
			System.out.println("오후");
		
		System.out.println(hour + "시" + minute + second + "초" + Millisecond + "밀리초");
	
	}
	
		public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		//getInstance : 캘린더 메소드를 가져오는 키워드, 캘린더 객체를 가져와서 now 에 넣는다.
		printCalendar("현재", now);
	}


}
		
		
		

