package method;


// static 필드의 공유 특징

class B{
	int m=3; // 인스턴스 필드
	static int n=5; // 정적 필드
}

public class Static2 {

	public static void main(String[] args) {
		
		B b1 = new B();
		B b2 = new B();
		
		// 인스턴스 필드
		b1.m=6;
		b2.m=8;
		
		System.out.println( b1.m);
		System.out.println( b2.m);
		
		// 정적필드
		
		b1.n=10;
		b2.n=11;
		
		System.out.println( b1.n); // 11
		System.out.println( b2.n); // 11
		
		B.n=9;
		System.out.println( );
		System.out.println( b1.n); // 9
		System.out.println( b2.n); // 9
		
	}
	
	
}
