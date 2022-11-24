package private2;

import private1.A;

public class C {

	public void print() {
		
		// # 1. 객체 생성
		A a = new A(); // import A;
		
		
		// # 2. 멤버 활용
		System.out.print( a.a );
	//	System.out.println( a.b ); // 불가능 ( protected 자기 자식만 가능 )
	//	System.out.println( a.c ); // 불가능 ( default 다른패키지 불가능 )
	 // System.out.println( a.d ); // private 다른패키지라 사용불가능 
	}
}
