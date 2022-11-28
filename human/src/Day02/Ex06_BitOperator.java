package Day02;

public class Ex06_BitOperator //비트연산자 
{
   public static void main(String[] args) {
	
	// AND
	// 10진수 (십진수) -> 2진수로는 0 또는 1로 표현
	// 0000 0000 
	
	// 0001 0100 - 20
	// 0001 0000 - 16
    // --------- and 연산
	// 0001 0000 - 16
	System.out.println(20 & 16);
	System.out.println(Integer.toBinaryString(20));
	System.out.println(Integer.toBinaryString(16));
	System.out.println();
	
	// 0001 0100 - 20
	// 0001 0000 - 16
    // --------- or 연산
	// 0001 0000 - 16
	
	int result2 = 20 | 16;
	System.out.println(20 | 16);
	System.out.println(Integer.toBinaryString(result2));
	System.out.println();

   //XOR
	// 0001 0100
	// 0001 0000
	// ----------
	// 0000 0100  둘중에 같은거는 0으로 연산, 틀린거만 1로 연산 
   
	int result3 = 20 ^ 16;
	System.out.println(20 ^ 16);
	System.out.println(Integer.toBinaryString(20));
	System.out.println(Integer.toBinaryString(16));
	System.out.println(Integer.toBinaryString(result3));
	System.out.println();

	// NOT
	// ~0001 0100
	// ----------
	//  1110 1011
	 
	int result4 = ~20;
	System.out.println(~20);
	System.out.println(result4);
	System.out.println(   );
	System.out.println(Integer.toBinaryString(-20));
	System.out.println();
	// 11111111111111111111111111101100 (?)
	
	// 최상위비트 
	// 부호가 있는 수의 경우는 최상위비트를 부호비트로 사용한다.
	
	// 시프트 연산 (비트 이동 연산자)
	// - 산술 시프트( <<, >>) : 부호 비트 유지하면서, 왼쪽 또는 오른쪽으로 이동시키는 연산자
	// - 논리 시프트( <<<, >>>) : 부호 비트를 포함해서, 전체를 왼쪽 또는 오른쪽으로 이동시키는 연산자
 
	 //비트 연산은 실무에 가서 다룰 일이 그닥 많지 않음. 복잡하게 생각마라.
   
    // 0000 0010 - > 2 x 1 = 2
	// 근데 이걸 한칸씩 왼쪽으로 이동하면??
    // 0000 0100 -> 2^2 = 2 
    // 0000 1000 -> 2^3 = 8
	System.out.println(2 << 1);
	System.out.println(2 << 2);
	System.out.println(2 << 3); 
	
	System.out.println(16 >> 1);
	System.out.println(16 >> 2);
	System.out.println(16 >> 3);
   
	System.out.println(-2 << 1);
	System.out.println(-2 << 2);
	System.out.println(-2 << 3); // 산술시프트일때는 부호 똑같고 절대값만 다름
   
	System.out.println(2 >> 1);
	System.out.println(-2 >>> 31);
	System.out.println(Integer.toBinaryString(2));
	System.out.println(Integer.toBinaryString(-2));
	// -2 = 1111 1111 1111 1111 1111 1111 1111 1110
	// 1111 1111 1111 1111 1111 1111 1111 1110 
	// 논리 시프트는 맨 앞의 부호 비트까지 바꿔버린다
	// 오른쪽으로 31번 바꾸니까 그냥 1 되버림
	
	System.out.println();
	
   
   }  
   
   
   

}

