package Day02;

import java.util.Scanner;

public class ElseifPractice {
	// 도전
	// 정수를 하나 입력받아서,
	// 90 이상이면 A
	// 80 이상이면 B
	// 70 이상이면 C
	// 60 이상이면 D
	// 60 미만이면 F
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수하나입력 : ");
		int input = sc.nextInt();
		
		
		if( input >= 90 ) System.out.println("A");
		else if( input >= 80 )System.out.println("B");
		else if( input >= 70 )System.out.println("C");
		else if( input >= 60 )System.out.println("D");
			else System.out.println("F");
		}
			//"The method elseif(boolean) is undefined" 이딴 에러 문장이 else if 밑에 있었는데 저장하니까 없어졌다...
			//이럴수가 있는건가...
	}

		
		
	


