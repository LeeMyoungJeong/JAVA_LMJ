package Day03;

public class guguAllPractice {
public static void main(String[] args) {
	//구구단을 만들거야
	//각 단에 대해서 각각 9번 수행해줘야 함.
	//쉽게 생각하자. for 문법 활용해보자
	
	for (int i=1 ; i <= 9 ; i++) {// i는 1부터 시작하는데,
		// i가 9보다 작으면 아래 for 문을 실행시켜 그리고 i에 1을 추가한다.
		for (int j = 1; j <= 9 ; j++) {// j는 1부터 시작하는데 
			// j가 9보다 작으면 아래의 명령을 실행시켜,
			//그건바로 i 에다가 * J = i*j를 보여줘
			//그리고 j에다 1을 더해 
			System.out.print(i +"*"+ j + "="+ i*j  );
			//그리고 j가 9가 될때까지 보여주면 한칸 탭으로 넘겨라.
			System.out.print("\t");
		}System.out.println();
	}
		
	
	
	
	
	
	
	
	
}
}
