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
						// DŸ������ �ٿ�ĳ����
		if ( this.name == ((D)obj).name) {
			return true;
		} else {
			return false;
		}
	
	}
}

public class ObjectEquals {

	public static void main(String[] args) {
		
		C c1 = new C("�ȳ�");
		C c2 = new C("�ȳ�");
		
		System.out.println( c1==c2 ); // false ( ��ü�� ��ġ���� )
		System.out.println( c1.equals(c2)); // false ( Object�� equals�� �״�� ����Ͽ� false )
		
		D d1 = new D("�ȳ�");
		D d2 = new D("�ȳ�");
		
		System.out.println( d1==d2 ); // false ( ��ü�� ��ġ���� )
		System.out.println( d1.equals(d2)); // true
	}
}
