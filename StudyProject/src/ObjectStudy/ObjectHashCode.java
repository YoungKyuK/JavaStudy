package ObjectStudy;

import java.util.HashMap;

class A1{
	
	String name;
	A1( String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
						// D타입으로 다운캐스팅
		if ( this.name == ((A1)obj).name) {
			return true;
		} else {
			return false;
		}
	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}

class B1{
	
	String name;
	B1( String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
						// D타입으로 다운캐스팅
		if ( this.name == ((B1)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
	
		return name.hashCode(); // name이란 문자열의 해쉬코드가 리턴됨 (같은 문자면 같은 해쉬코드 리턴 )
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}


public class ObjectHashCode {

	public static void main(String[] args) {
		
		//     KEY ( 중복 x ),  values
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		System.out.println( hm1 ); // 데이터 2개 출력 ( key값 중복되어서 1 덮어씌움 )
		
		
		HashMap<A1, String> hm2 = new HashMap<>();
		hm2.put( new A1("첫번째"), "데이터1");
		hm2.put( new A1("첫번째"), "데이터2");
		hm2.put( new A1("두번째"), "데이터3");
		
		System.out.println( hm2 ); // 데이터 3개 출력 ( hashcode 오버라이딩 하지 않아서 )
		
		HashMap<B1, String> hm3 = new HashMap<>();
		hm3.put( new B1("첫번째"), "데이터1");
		hm3.put( new B1("첫번째"), "데이터2");
		hm3.put( new B1("두번째"), "데이터3");
		
		System.out.println( hm3 ); // 데이터 2개 출력 ( hashcode,equals 오버라이딩해서 중복 )
								   // 위치와 문자값 둘다 오버라이딩해서 같게 만들어서 비교
		
		
		
	}
}
