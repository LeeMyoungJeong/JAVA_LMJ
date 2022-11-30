package Day13.Ex01_Collection;

import java.util.Stack;

/*
 * 	Stack : 쌓다
 * 	데이터를 한쪽 끝에서만 추가하고 삭제할 수 있는 자료구조
 *  최상위 데이터 : TOP
 *  
 *  자료 추가 - Push : TOP 위에 데이터 추가
 *  자료 삭제 - Pop : Top 위치의 데이터를 삭제
 *  
 *  Last In First Out
 * 
 */
 
 /*		객체 추가
  * 	- add(E) 	: 객체 E를 TOP 위에 추가
  * 	- push(E) 	: 객체 E를 TOP 위에 추가
  * 
  * 	객체 검색 
  * 	- contains(Object) 	: 주어진 객체의 포함여부(True/False)
  * 	- isEmpty()			: 비어있는지 여부(true/false)
  * 	- size() 			: 객체의 수 반환
  * 
  * 	객체 삭제
  * 	- remove(Object) 	: 주어진 객체를 삭제
  * 	- pop()				: TOP에 있는 객체를 삭제
  * 	- clear()			: 모든 요소를 삭제 
  */



public class StackEx {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("empty : "+ stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		
		System.out.println("empty : " +stack.isEmpty());
		System.out.println("1. 포함 여부: " + stack.contains(1));
	
		for(Integer item : stack) {
			System.out.println("item : "+ item);
		}
	
		// peak() : TOP 의 데이터를 반환
		System.out.println("TOP : " + stack.peek());
		System.out.println("size : " + stack.size());
	
		stack.pop(); // 최상위에 있는 데이터가 사라짐
		stack.remove(1); //인덱스 1을 의미함 그래서 2가 지워짐.
		stack.remove( (Integer)3);
		
		for (Integer item : stack) {
			System.out.println("item : " + item);
		}
		stack.clear(); //싹 없애기
		System.out.println("empty : " + stack.isEmpty()); //비어있냐?? ㅇㅇ true 다
	
	
	}
}
