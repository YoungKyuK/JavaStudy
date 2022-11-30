package ArrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		List<Integer> aList1 = new ArrayList<Integer>();
		
		// # 1. add (E element) ���� �߰�
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println( aList1.toString()); // toString = System.out.println( aList1 ) ���� ���� [ 3, 4, 5 ]
		
		// # 2. add ( int index, E element ) 1�� �ε��� �ڸ��� 6�� �߰��Ѵ�.
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
		
		// ������ ����
		// # 5. set ( int index, E element )
		aList3.set(1, 5);
		aList3.set(3, 6);
		System.out.println( aList3.toString()); // 1,5,2,6
		
		// ������ ����
		// # 6. remove ( int index )
		aList3.remove(1); // 1�� �ε��� ����
		System.out.println(aList3.toString()); // 1,2,6
		
		// # 7. remove ( Object o )
		aList3.remove(new Integer(2)); // ��ü ���� �Ŀ� �����ؾ��� ( ���� 2�� ���� )
		System.out.println( aList3 ); // 1, 6
		
		// # 8. clear()
		aList3.clear();
		System.out.println( aList3.toString()); // []
		
		// ������ ���� ����
		// # 9. isEmpty(); ����ִ��� Ȯ��
		System.out.println( aList3.isEmpty()); // true
		
		// # 10. size()
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println( aList3.toString()); // [1,2,3]
		System.out.println( "size :" + aList3.size() ); // size : 3
		
		
		// # 11. get ( int index )  
		System.out.println( "0��° :" + aList3.get(0));  // 0��° : 1
		System.out.println( "1��° :" + aList3.get(1));  // 1��° : 2
		System.out.println( "2��° :" + aList3.get(2));  // 2��° : 3
		
		for ( int i=0; i<aList3.size(); i++) {
			System.out.println( i + "��° :" + aList3.get(i));
		}
		
		
		// ����Ʈ -> �迭
		// # 12. toArray() List(Integer) -> Array(Object) 
		Object[] object = aList3.toArray();
		System.out.println( Arrays.toString(object)); // [1,2,3]
		
		// 13-1. toArray(T[] t ) --> T []
		Integer[] integer1 = aList3.toArray(new Integer[0]); // �۾Ƶ� List�� ũ�⸸ŭ �������
		System.out.println( Arrays.toString(integer1)); // [ 1,2,3 ]
		
		// 13-2. toArray(T[] t )
		Integer[] integer2 = aList3.toArray(new Integer[5]); // integer�� 5���� ����
		System.out.println( Arrays.toString(integer2)); // [ 1,2,3,4,5 ]
		
		// list�� size() >= �迭�� length -> list�� size ũ�⸦ ������ �迭 ����
		// list�� size() < �迭�� length -> �迭 length ũ�⸦ ������ �迭 ����
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
