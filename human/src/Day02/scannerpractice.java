package Day02;

import java.util.Scanner;

public class scannerpractice {

	public static void main(String[] args) {
				//도전
				//정수를 하나 입력받아서,
				//90 이상이면 A
				//80 이상이면 B
				//70 이상이면 C
				//60 이상이면 D
				//60 미만이면 F
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		System.out.println(sc.nextInt());
		int score = sc.nextInt();
		
		if(score>=90) {System.out.println("A");}
		else if(score>=80) {System.out.println("B");}
		else if(score>=70) {System.out.println("C");}
		else if(score>=60) {System.out.println("D");}
		else {System.out.println("F");}
	}
}

