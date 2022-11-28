package Day01;

import java.util.Scanner;

public class Ex02_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub -> 이것은 무엇인가....
		
		
		// sysout : ctrl + space
		// Alt 키만 누르고 옮기면 그냥 옮기기 가능
		
		System.out.println("이름, 주소, 자기소개를 공백을 두고 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		//sc 밑에 노란줄은 경고 표시임 - sc라는 객체가 close 되고 있지 않음.
		String name = sc.next();
		System.out.println("이름 : " + name);
		
		String adress = sc.next();
		System.out.println("주소 : " + adress);
		
		String intro = sc.next();
		System.out.println("자기소개 : " + intro);
		
		
		System.out.println("나이, 키를 공백을 두고 입력하세요 : ");
		
		int age = sc.nextInt();
		System.out.println("나이 : " + age);
		
		double height = sc.nextDouble();
		System.out.println("키 : " + height);
		// 나이&키를 string 형태로 입력하면 Console에서 출력하지 못함. 
		// 왜냐하면 sc.netxtInt(), sc.nextDouble 이라서...
		sc.close();
		 // sc 객체가 이 이후로는 입력받지 않을거임. 
		            //그래서 이제부터는 메모리 자원에서 해제할거다 라는 뜻.
		
		
	}

}
