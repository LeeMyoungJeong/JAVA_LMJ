package Day03;
import java.util.*;
public class minPractice {
public static void main(String[] args) {
			// 첫째 줄에 입력할 개수 N을 입력받고,
			// 둘째 줄에는 N개의 정수를 공백을두고 입력받으시오.
			// N개의 정수 중, 최솟값을 구하여 출력하시오.
	
	Scanner sc = new Scanner(System.in);
	int AB = sc.nextInt();
	int array[] = new int[AB];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt(); // 
		}
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			
	
			if (array[0] > array[i]) {min = array[i];}
	
}System.out.println("최솟값" + min); {
sc.close();	

}
}}
