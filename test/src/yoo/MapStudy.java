package yoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStudy {
	public static void main(String[] args) {
		
		// 맵의 특징 ? key : value 쌍으로 이뤄져 있다.
		// ✔ 순서를 지키는 map
		// 가장 큰 특징 key 중복이 X // Value는 중복이 가능하다.
		
		/**
		 * List<Map> data = /~~~~;
		 * 
		 * List<String> success = new ArrayList<>();
		 * data.forEach( i->{
		 * 	if(){
		 *  		success.add(i); 이런식으로 많이 쓴다.
		 * 		}
		 * })
		 * **/ 
		
		// 맵의 변수명은 addr -> key(String)는 사람이름 value(int) 전화번호임
		
		Map<String, Long> addr = new HashMap<>();
		
		addr.put( "yoo", 7325L);
		addr.put( "yoo2", 1026L);
		addr.put( "yoo2", 124L); // 이거는 key 중복이라 안 나온다.
		
		/**
		 * 만약 중복된 Key가 put되면 새로운 Value로 덮어씌어진다.
		 */
		
		System.out.println( addr );
		
		// 가장 많이쓰는 Map 2개 
		// Map<?,?> 순서유지 X = new HashMap<>();
		// Map<?,?> 순서유지 O = new LinkedHashMap<>();
		
		
	}
}
