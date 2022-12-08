package MapList;

import java.util.HashMap;
import java.util.Map;

public class MapList1 {
	
	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "youngkyu");
		map.put("age", "30");
		map.put("hobby", "tenis");
		
		for ( String key : map.keySet()) {
			String value= (String)map.get(key);
			System.out.println( key + ":" + value);
		}
	}

}
