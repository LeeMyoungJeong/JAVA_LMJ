package Day02;

import java.util.Scanner;
import java.util.*;
public class Ex11_elseif {

	public static void main(String[] args) {
		//도전
		//정수를 하나 입력받아서,
		//90 이상이면 A
		//80 이상이면 B
		//70 이상이면 C
		//60 이상이면 D
		//60 미만이면 F
		Scanner sc = new Scanner(System. in);
		System.out.println("점수 : ");
		int score = sc.nextInt();
			
		if(score >= 90) System.out.println("A");
		else if( score >= 80) System.out.println("B");
		else if( score >= 70) System.out.println("C");
		else if( score >= 60) System.out.println("D");
			else System.out.println("F"); 
		System.out.println();
	
		}}
	
	
	
	//오류의 이유 : result 라는 변수를 생성하지 않아서 그렇다. 얘는 result가 뭔지 지금 모르는 상태임.
	//그렇다면 result 라는 변수를 어떻게 지정시켜줘야될꼬??
