package Day07.Ex03_PassingArgument;

import java.util.Iterator;

import Day05.Inheritance.Pikachu;

public class CallByReferencePractice {

	public static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// 10 20 30 40 50
			arr[i] = (i+1) + 10;
		}
		System.out.println("***** setArr메소드 *****");
		for (int i = 0; i < arr.length; i++) {
		System.out.println("arr[" + i + "] : " + arr[i] );
		}
		System.out.println();
	}

	public static void setObj(Pikachu pikachu) {
		pikachu.energy = 1000;
		pikachu.type = "fire";
		//raichu.energy= 1;
		//raichu.type = "stone";
		System.out.println("***** setObj 메소드 *****");
		System.out.println(pikachu);
		System.out.println();
	}
	public static void main(String[] args) { //메인메소드 실행했더
		int[]arr = new int [5];				
 		Pikachu pikachu = new Pikachu();
		pikachu.energy = 100;
		pikachu.type = "thunder"; //피카츄는 여기서 정의했다. 에너지 100에 썬더 타입임.
		
		for (int i = 0; i < arr.length; i++) {
			// 1 2 3 4 5
			arr[i] = i+1;
		}
		
		System.out.println("***** main 메소드 *****"); //메인메소드 맨 위에 출력됨.
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]" + arr[i]); //arr 이라는 배열의
			// 0 1 2 3 4 번 인덱스에 1 2 3 4 5 들어가 있음을 확인함. 
		}
		System.out.println(pikachu); //그러고 피카츄를 불러옴.
		
		setArr(arr);
		setObj(pikachu); //그리고 setObj(pikachu); 실행하니까 아래에
		//***** setObj 메소드 *****
		//Pikachu [energy=1000, type=fire] 이게 떠버리네....
		//setObj에서 pikachu로 정의된 정보들을 가져왔네...
		
		System.out.println("*****set**메소드 호출 후 *****");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+ i + "] : " + arr[i]); 
			//setObj메소드를 호출하고 났더니 arr배열의 인덱스 내부 값이 10씩 곱해져있네 ㅎㅅㅂ
		}
		System.out.println(pikachu);
	} //아시바이게 그거구나 메소드 오버로딩인가 라이딩인가.... 메소드가 고냥 덮어씌워져버리네
}

		
		
		
		
		
		
		
		
		
		
		
	