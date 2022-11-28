package innerclass;

import InterFace4.defaultMethod;

class A{
	public int a=3;
	protected int b=4;
	int c=5;
	private int d=6;
	
	void abc() {
		System.out.println( "A클래스의 메서드 abc()");
	}
	
	// 외부클래스의 모든 접근지정자 멤버 접근 가능 ( 중괄호가 포함하고 있기 때문 )
	// 외부클래스 A.class
	// 외부클래스$내부클래스.class
	class B{
		int a=10;
		int b=11;
		
		void bcd() { 
			System.out.println( this.a); //10
			System.out.println( a );  // 10
			System.out.println( b ); // 11
			System.out.println( c ); // 5
			System.out.println( d ); // 6
			abc();
		
			System.out.println( A.this.a); // 3
			
		}
	}
}

public class innerclass {
	
	public static void main(String[] args) {
		
		
		// # 1. 인스턴스 이너클래스 객체 생성
		// @ 1. outer 클래스 객체 생성
		A a = new A();
		
		// @ 2. outer 참조 변수로부터 inner 클래스 객체 생성
		A.B b = a.new B();
		
		b.bcd();
		
	}
	
	

}
