package Day05;
 		// 코드 오류의 80퍼센트는 오탈자임....
import java.util.Iterator;

public class Ex03_Week {
	
	public static void main(String[] args) {
		// 배열 선언
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
		}
		// 배열 초기화와 동시에 생성
		String week[] = new String[] {"월", "화", "수", "목","금", "토","일"};
		String week2[] = {"월요일", "화요일", "수요일", "목요일","금요일", "토요일","일요일"};
				
		// 배열.length : 배열의 길이(배열요소의 개수)
		for (int j = 0; j < week.length; j++) {
			System.out.print(week[j] + " ");
		}
		System.out.println();
		
		// foreach - 배열의 모든 요소 반복
		for (String day : week2) {
			System.out.print(day + " ");
		}
		System.out.println();
	}	
	
	}
	

