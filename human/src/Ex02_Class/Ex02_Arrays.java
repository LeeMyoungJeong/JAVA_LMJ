package Ex02_Class;

import java.util.Arrays;
import java.util.Iterator;

public class Ex02_Arrays {
public static void main(String[] args) {
	//정렬되지 않은 배열 요소들
	// 배열을 정렬 (sort)
	int [] arr = {5,3,4,1,2};
	
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i] + " ");
	}System.out.println();
	int [] random = new int[100];
	for (int i = 0; i < random.length; i++) {
	//ㅅㅂ인터넷개씨발각자미식
	}	
	
	//이진 검색(탐색) 알고리즘을 사용하여 검색한 후,
	// 해당 값이 있으면, 그 위치(index)를 반환
	// 찾지 못했으면, (-(insertion point) -1)음수를 반환
	if(Arrays.binarySearch(random, 10) < 0){
		System.out.println("랜덤 수 10이 없습니다.");
	}
	else {
		System.out.println("index : " + Arrays.binarySearch(random, 10));
	}
		
	//Arrays.fill(값) : 값으로 모든 배열요소를 채우는 메소드
	int fill [] = new int [10];
	
	Arrays.fill(fill,8);
	
	for (int i = 0; i < fill.length; i++) {
		System.out.println(fill[i]);
	}	
	System.out.println();
	
	// Arrays.copyOf(배열, 길이);
	// : 배열을 앞에서부터 (길이)개 만큼의 요소를 복사하여 배열로 반환
	// 8 8 8 8 8 8 8 8 8 8
	// 8 8 8 을 복사해옴
	
	for (int i = 0; i < copy.length; i++) {
		System.out.println(copy[i] + " ");
	}
	System.out.println();

	// Arrays.copyOfRange(배열, 시작index, 끝 index+1)
	int copyRange[] = Arrays.copyOfRange(arr, 2, 4);
	// 1 2 3 4 5
	// 3 4 를 복사해옴
	
	for (int i = 0; i < copyRange.length; i++) {
		System.out.println( copyRange[i] + " ");
	}
	System.out.println();


}
}
