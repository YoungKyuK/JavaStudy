package private1;

public class B {

	public void print() {
		
		// # 1. 객체 생성
		A a = new A();
		
		
		// # 2. 멤버 활용
		System.out.print( a.a );
		System.out.print( a.b );
		System.out.print( a.c );
	 // System.out.println( a.d ); // private 다른패키지라 사용불가능 
	}
}
