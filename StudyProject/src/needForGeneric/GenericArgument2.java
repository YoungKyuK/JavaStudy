package needForGeneric;


class KeyValue<K,V>{
	private K Key;
	private V Value;
	
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		Key = key;
	}
	public V getValue() {
		return Value;
	}
	public void setValue(V value) {
		Value = value;
	}
	
	
	
}

public class GenericArgument2 {

	public static void main(String[] args) {
		
		KeyValue<String, Integer> kv1 = new KeyValue();
		kv1.setKey("사과");
		kv1.setValue(1000);
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key :" + key1 + " value :" + value1);
		
		
		
		KeyValue<Integer,String> kv2 = new KeyValue();
		kv2.setKey(404);
		kv2.setValue("NotFound");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("key :" + key2 + " value :" + value2);
		
		KeyValue<String, Void> kv3 = new KeyValue();
		kv3.setKey("키값만 사용");
		String key3 = kv3.getKey();
		System.out.println( "key :" + key3 );
	}
	
}
