package Day04;

public class Ex05_string {

	public static void main(String[] args) {
		String a ="Hello";
		String b ="Java";
		String c ="Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		System.out.println(a == c);
 		System.out.println(a == d);			//이렇게 비교하면 스트링 자체가 저장된 주소값을 비교
 		 									//해당 변수의 레퍼런스(참조정보)를 비교
		System.out.println(a.equals(d));
		System.out.println(e == f);
		System.out.println(e.equals(f));	//이렇게 비교하면 스트링 문자 자체를 비교
}
}
