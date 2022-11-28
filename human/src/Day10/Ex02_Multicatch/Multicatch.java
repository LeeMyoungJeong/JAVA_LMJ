package Day10.Ex02_Multicatch;

import java.util.Scanner;

//여러개의 예외가 동시에 발생하는 경우 나눠서 다루는법
public class Multicatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("두 자리 수인 정수 2개를 입력해주세요");
		
		try {
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();

			char[] char1 = str1.toCharArray();	//문자열을 -> 한글자 한글자 뽑아서 배열로 만든다.
			char[] char2 = str2.toCharArray();  //

			String[] input1 = new String[char1.length];
			String[] input2 = new String[char2.length];

			for (int i = 0; i < char1.length; i++) {
				input1[i] = char1[i] + "";
			}
			for (int i = 0; i < char2.length; i++) {
				input2[i] = char2[i] + "";
			}
			
			여기 코드 빠져있음.
			//System.out.println(input);
			//
			
			
			int value1 = Integer.parseInt(str1);
			int value2 = Integer.parseInt(str2);
			int result = value1 + value2;

			System.out.println(str1 + "+" + str2 + "=" + result);
		
		}	//하나의 catch 블록에서 처리하고 싶은 예외는 | 로 연결하여 사용한다.
		 catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("접근할 수 없는 배열 index 범위입니다.");
			System.out.println("숫자로 변환할 수 없는 값입니다.");

		} catch (Exception e) {
			// 상위 예외 클래스가 하위 예의 클래스보다 아래쪽에 위치해야 한다.
			// 얘를 위에 올리게 되면 위에서 에러를 전부 걸러버리기 때문에 에러 표시가 출력됨.
			
			System.out.println("이 외의 알 수 없는 예외 발생");
		}
	}
}
