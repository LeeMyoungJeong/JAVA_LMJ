package Day10.Ex03_AutoClose;

import java.io.FileInputStream;

public class TryWithResources {

	public static void main(String[] args) {
		  // try-with-resources 문
		  // : try(자동으로 자원해제할 객체 생성)
		  // AutoCloseable 인터페이스를 구현한 클래스이어야 자동 자원해제가 가능.
		try ( FileInputStream fis = new FileInputStream("test.txt")){
			
			int read;
			
			while( (read = fis.read()) != -1) {
				System.out.println((char)read);
			}
		
			
		} catch (Exception e) {
			System.out.println("예외 발생...");
		
		
		}
	}
}
