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
		hset1.add("가");
		hset1.add("나");
		hset1.add("가");
		System.out.println( hset1.toString()); // [ 가 , 나 ] 중복허용 X
		
		// # 2. addAll ( 다른 set 객체 )
		Set<String> hset2 = new HashSet<>();
		hset2.add("다");
		hset2.add("가");
		hset2.addAll(hset1);	
		System.out.println( hset2.toString()); // 가,다,나 입력순서와 출력순서가 다를 수 있다.
		
		// # 3. remove ( Object o )
		hset2.remove("나");
		System.out.println( hset2.toString()); // 가,다
		
		// # 4. clear();
		hset2.clear();
		System.out.println( hset2.toString()); // []
		
		// # 5. isEmpty();
		System.out.println( hset2.isEmpty());  // true
		
		// # 6. contains ( Object o )
		Set<String> hset3 = new HashSet<>();
		hset3.add("가");
		hset3.add("나");
		hset3.add("다");
		System.out.println( hset3.contains("나")); // true
		System.out.println( hset3.contains("라")); // false
		
		// # 7. size()
		System.out.println( hset3.size()); // 3 
		
		// # 8. Iterator() 객체를 가리킬 수 있는 데이터
		Iterator<String> iterator = hset3.iterator();
		while( iterator.hasNext()) { // 총 3바퀴
			System.out.println( iterator.next());
		}
		
		// # 9. toArray()
		Object[] objarray = hset3.toArray();
		System.out.println( Arrays.toString(objarray)); // 가 다 나
		
		// # 10. toArray( T[] t )
		String[] strarray1 = hset3.toArray(new String[0]); // 컴파일러가 개수만큼 자동추가
		System.out.println( Arrays.toString(strarray1)); // 가 다 나
		
		// # 11. toArray ( T[] t )
		String[] strarray2 = hset3.toArray(new String[5]);
		System.out.println( Arrays.toString( strarray2)); // 뒤에는 null
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
