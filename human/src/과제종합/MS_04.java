package 과제종합;

import java.util.Iterator;
import java.util.Scanner;

/*
     *    	
    ***   
   *****	
  *******	
 *********	
 
 okok 감자바쓰
 */

public class MS_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int j = 0 ; j <= N ; j++) {
				//       1    1+(j-1)*2
			for (int i = 0; j < N-i; i++) {
				System.out.print(" ");
			
			} 
			for (int k = 1; k <= 1+(j-1)*2 ; k++) {
				System.out.print("*");
			}System.out.println();
			
			
		}
	}
}
		
	

