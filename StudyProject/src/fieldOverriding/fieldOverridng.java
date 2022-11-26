package fieldOverriding;

class A{
	 static int m=3;
}

class B extends A{
	static int m=4;
}

public class fieldOverridng {

	public static void main(String[] args) {
		
		// 인스턴스 필드는 오버라이딩 되지 않음
		// 공간상에서 분리되서 만들어져 덮어씌어지지 않는다
		
		// #1. 객체 생성
		A a = new A();
		B b = new B();
		
		// A타입선언 B 생성
		A ab = new B();
	
		// #2. 인스턴스 필드
		System.out.println( a.m); // 3
		System.out.println( b.m); // 4 
		System.out.println( ab.m); // 3 
		
	}
}
