package Day13.Ex02_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {
	//ArrayList와 LinkedList의 차이를 알아보자
	public static void main(String[] args) {
		// 데이터 삽입/삭제는 Linked리스트가 ArrayList보다 빠르다
		List<String>arrayList = new ArrayList<>();
		List<String>linkedList = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		// ArrayList 데이터 삽입
		 for (int i = 0; i < 10000; i++) {
			arrayList.add(0,String.valueOf(i) );
		}
		endTime = System.nanoTime();
		long arrayListTime = (endTime - startTime);
		System.out.println("ArrayList 데이터 삽입 시간 : " + arrayListTime + "ns");
		for (int i = 0; i < 10000; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		long linkedListTime = (endTime - startTime);
		System.out.println("LinkedList 데이터 삽입 시간 : " + linkedListTime + "ns");
		
		
		if( arrayListTime > linkedListTime) {
			System.out.println("ArrayList 보다 LinkedList가 데이터 삽입이 더 빠르다.");
		} else {
			System.out.println("LinkedList 보다 ArrayList가 데이터 삽입이 더 빠르다.");
		}
}
}
