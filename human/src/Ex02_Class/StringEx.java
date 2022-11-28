package Ex02_Class;

public class StringEx {

	public static void main(String[] args) {
		String str1 = " Human Edu Center "; //첫글자만 대문자
		String str2 = " human Edu Center "; //첫글자 소문자
	
		System.out.println(str1.charAt(2));					// 인덱스에 있는 문자를 추출 0 1 2 번째 문자를 추출
																			 // 공백 H u
		System.out.println(str1.concat(str2));				// 
		System.out.println(str1.contains("edu"));			// 문자열 포함하고 있는지 확인 (true/false)로 출력 
		System.out.println(str1.equals(str2));				// 문자열이 같은지 확인 (true/ false)
		System.out.println(str1.equalsIgnoreCase(str2));	// 문자열이 일치하는지 확인 (true/false), 대소문자를 무시하고 같은지 확인을 하겠다.
		System.out.println();
		System.out.println(str1.indexOf("C"));				// 해당 문자의 첫 index를 반환, 없으면 -1 반환
		System.out.println(str1.lastIndexOf("u"));			// 해당 문자의 마지막 index를 반환, 없으면 -1 
		System.out.println(str1.trim());					// 문자열 양쪽의 공백을 제거
		System.out.println(str1.length());					// 문자열의 길이
		System.out.println(str1.substring(7));				// 문자열을 index 앞의 문자열을 자르고 뒤의 문자열을 반환
		System.out.println();
		System.out.println(str1.substring(7,17));			// index1~(index2-1)까지 반환, 얘같은 경우는 edu center 반환
		System.out.println(str1.replace(" " , "#"));		// replace("기존문자", "대체문자")
		System.out.println(str1.replaceAll(" " , "*"));		// replace 와 같음
		System.out.println(str1.toUpperCase());				// 모두 대문자로 변경
		System.out.println(str1.toLowerCase());				// 모두 소문자로 변경 
		
		
		// split("(구분자)") 		: (구분자)를 기준으로 문자열을 잘라서 배열로 반환
		String[] sp = str1.split(" ");						
		for (int i = 0; i < sp.length; i++) {
			System.out.println(i + "\t : " + sp[i]);
		}
	
	}
}
