package Ex02_Class;

public class StringBufferEx {

	public static void main(String[] args) {
		// StringBuffer
		// : 문자열을 조작하는 클래스
		// - 문자열을 추가/수정/삭제 할 수 있다.
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		
		// append("추가할 문자열")
		sb.append(" is Java");		// 
		System.out.println(sb);
		// insert(index, "추가 문자열")
		sb.insert(7, " real");		// 7번째 인덱스 뒤에다가 넣는다.(index, 추가 문자열)
		System.out.println(sb);
		//insert(시작index, 끝index+1, "대체 문자열")
		sb.replace(8, 12, "good");	// 대체한다.8번째부터 12전까지 
		System.out.println(sb);
		//delete(시작index, 끝index+1)
		sb.delete(8, 13);			// 시작index~끝index까지의 문자열을 삭제
		System.out.println(sb);
		
		sb.setLength(4);			// 문자열의 길이를 지정.
		System.out.println(sb);
		
		
	}
	
}
