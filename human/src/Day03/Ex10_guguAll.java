package Day03;

import java.util.concurrent.ForkJoinPool;

public class Ex10_guguAll {
	//단에 대한 반복	 : 1~9
	//각 단의 곱		 : 1~9
	
	public static void main(String[] args) {
		
		
		for (int i = 1; i <=9 ; i++) {
			
			//여기서부터 시작하는거다. 
			//무슨말이냐면
			// 
			for(int j =1; j<=9; j++) {
				System.out.print(i +"*"+ j +"=" +i * j);
				System.out.print("\t"); }
		System.out.println(); // 한 단 끝 -> 다음줄로 ㄱㄱ
	}
	
	}}
