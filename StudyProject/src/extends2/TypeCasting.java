package extends2;


class A{
	
	int m=3;
	void abc() {
		System.out.println( "A클래스");
	}
}

class B extends A{
	
	int n=5;
	void bcd() {
		System.out.println( "B클래스");
	}
}

public class TypeCasting {

	public static void main(String[] args) {
		
		A aa =new A();
		System.out.println(aa.m);
		aa.abc();
		
		B bb = new B();
		System.out.println( bb.m);
		System.out.println( bb.n);
		bb.abc();
		bb.bcd();
		System.out.println();
		
		A ab = new B(); // A타입 / B생성자 : 다형적 표현
		System.out.println( ab.m);
		ab.abc();
	}
}
