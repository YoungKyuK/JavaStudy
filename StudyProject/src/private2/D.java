package private2;

import private1.A;

public class D extends A{ // D클래스는 A클래스의 자식클래스이다.

public void print() { // a,b,c,d
		
		
		
		
		// # 2. 멤버 활용 
		// 상속시 객체도 같이 넘어옴
		System.out.print( a );
		System.out.print( b ); 
	//	System.out.println( c ); // 불가능 ( default 다른패키지 불가능 )
	 // System.out.println( d ); // private 다른패키지라 사용불가능 
	}
}
