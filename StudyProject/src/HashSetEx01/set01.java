package HashSetEx01;

import java.io.FilterWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set01 {

	public static void main(String[] ars) {
		
		// # 1. add ( E element )
		Set<String> hset1 = new HashSet<>();
		hset1.add("��");
		hset1.add("��");
		hset1.add("��");
		System.out.println( hset1.toString()); // [ �� , �� ] �ߺ���� X
		
		// # 2. addAll ( �ٸ� set ��ü )
		Set<String> hset2 = new HashSet<>();
		hset2.add("��");
		hset2.add("��");
		hset2.addAll(hset1);	
		System.out.println( hset2.toString()); // ��,��,�� �Է¼����� ��¼����� �ٸ� �� �ִ�.
		
		// # 3. remove ( Object o )
		hset2.remove("��");
		System.out.println( hset2.toString()); // ��,��
		
		// # 4. clear();
		hset2.clear();
		System.out.println( hset2.toString()); // []
		
		// # 5. isEmpty();
		System.out.println( hset2.isEmpty());  // true
		
		// # 6. contains ( Object o )
		Set<String> hset3 = new HashSet<>();
		hset3.add("��");
		hset3.add("��");
		hset3.add("��");
		System.out.println( hset3.contains("��")); // true
		System.out.println( hset3.contains("��")); // false
		
		// # 7. size()
		System.out.println( hset3.size()); // 3 
		
		// # 8. Iterator() ��ü�� ����ų �� �ִ� ������
		Iterator<String> iterator = hset3.iterator();
		while( iterator.hasNext()) { // �� 3����
			System.out.println( iterator.next());
		}
		
		// # 9. toArray()
		Object[] objarray = hset3.toArray();
		System.out.println( Arrays.toString(objarray)); // �� �� ��
		
		// # 10. toArray( T[] t )
		String[] strarray1 = hset3.toArray(new String[0]); // �����Ϸ��� ������ŭ �ڵ��߰�
		System.out.println( Arrays.toString(strarray1)); // �� �� ��
		
		// # 11. toArray ( T[] t )
		String[] strarray2 = hset3.toArray(new String[5]);
		System.out.println( Arrays.toString( strarray2)); // �ڿ��� null
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
