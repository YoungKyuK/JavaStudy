package ObjectStudy;

class C{
	String name;
	C( String name){
		this.name = name;
	}
}

class D{
	
	String name;
	D( String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
						// D타입으로 다운캐스팅
		if ( this.name == ((D)obj).name) {
			return true;
		} else {
			return false;
		}
	
	}
}

public class ObjectEquals {

	public static void main(String[] args) {
		
		C c1 = new C("안녕");
		C c2 = new C("안녕");
		
		System.out.println( c1==c2 ); // false ( 객체의 위치값비교 )
		System.out.println( c1.equals(c2)); // false ( Object의 equals를 그대로 사용하여 false )
		
		D d1 = new D("안녕");
		D d2 = new D("안녕");
		
		System.out.println( d1==d2 ); // false ( 객체의 위치값비교 )
		System.out.println( d1.equals(d2)); // true
	}
}
