package ArrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		List<Integer> aList1 = new ArrayList<Integer>();
		
		// # 1. add (E element) 원소 추가
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println( aList1.toString()); // toString = System.out.println( aList1 ) 생략 가능 [ 3, 4, 5 ]
		
		// # 2. add ( int index, E element ) 1번 인덱스 자리에 6을 추가한다.
		aList1.add(1, 6);
		System.out.println( aList1.toString()); // 3,6,4,5
		
		// # 3. addAll ( Collection<? extends E> c )
		List<Integer> aList2 = new ArrayList<Integer>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println( aList2.toString()); // 1,2,3,6,4,5
		
		// # 4. addAll ( int index, Collection< ? extends E > c )
		List<Integer> aList3 = new ArrayList<Integer>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1, aList3);
		System.out.println( aList3.toString()); // 1,1,2,2
		
		// 데이터 변경
		// # 5. set ( int index, E element )
		aList3.set(1, 5);
		aList3.set(3, 6);
		System.out.println( aList3.toString()); // 1,5,2,6
		
		// 데이터 삭제
		// # 6. remove ( int index )
		aList3.remove(1); // 1번 인덱스 삭제
		System.out.println(aList3.toString()); // 1,2,6
		
		// # 7. remove ( Object o )
		aList3.remove(new Integer(2)); // 객체 생성 후에 삭제해야함 ( 숫자 2번 삭제 )
		System.out.println( aList3 ); // 1, 6
		
		// # 8. clear()
		aList3.clear();
		System.out.println( aList3.toString()); // []
		
		// 데이터 정보 추출
		// # 9. isEmpty(); 비어있는지 확인
		System.out.println( aList3.isEmpty()); // true
		
		// # 10. size()
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println( aList3.toString()); // [1,2,3]
		System.out.println( "size :" + aList3.size() ); // size : 3
		
		
		// # 11. get ( int index )  
		System.out.println( "0번째 :" + aList3.get(0));  // 0번째 : 1
		System.out.println( "1번째 :" + aList3.get(1));  // 1번째 : 2
		System.out.println( "2번째 :" + aList3.get(2));  // 2번째 : 3
		
		for ( int i=0; i<aList3.size(); i++) {
			System.out.println( i + "번째 :" + aList3.get(i));
		}
		
		
		// 리스트 -> 배열
		// # 12. toArray() List(Integer) -> Array(Object) 
		Object[] object = aList3.toArray();
		System.out.println( Arrays.toString(object)); // [1,2,3]
		
		// 13-1. toArray(T[] t ) --> T []
		Integer[] integer1 = aList3.toArray(new Integer[0]); // 작아도 List의 크기만큼 출력해줌
		System.out.println( Arrays.toString(integer1)); // [ 1,2,3 ]
		
		// 13-2. toArray(T[] t )
		Integer[] integer2 = aList3.toArray(new Integer[5]); // integer를 5까지 생성
		System.out.println( Arrays.toString(integer2)); // [ 1,2,3,4,5 ]
		
		// list의 size() >= 배열의 length -> list의 size 크기를 가지는 배열 생성
		// list의 size() < 배열의 length -> 배열 length 크기를 가지는 배열 생성
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
