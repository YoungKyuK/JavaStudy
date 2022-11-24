package methodOverrriding;


class A{

	void print1() {
		System.out.println( "A클래스 print1");
	}
	
	void print2() {
		System.out.println( "A클래스 print2");
	}
}

class B extends A{
	
	// print1()은 오버라이딩
	void print1() {
		System.out.println( "B클래스 print1");
	}
	
	// print2()는 오버로딩
	void prinbt2( int a ) {
		System.out.println( "B클래스 print2");
	}
}


public class overriding2 {

	// 메서드 오버라이딩 vs 오버로딩
	// 오버라이딩은 상속할 때 재정의
	// 오버로딩은 동일한 메서드 이름은 동일한데, 시그니처 (매개변수)가 달라서 여러개를 정의 하는 것
	// 오버로딩 ex) a.jpg , a.png는 파일이름은 동일한데 확장자가 달라서 같은공간에 있을 수 있다.
	// 오버라이딩 ex) a.jpg , a.jpg를 또 집어넣어서 덮어쓰기 
	
	public static void main(String[] args) {
		
		// # 1. A타입 A객체 생성
		A aa = new A();
		aa.print1(); // A클래스 print1
		aa.print2(); // A클래스 print2
		
		System.out.println();
		
		// # 2. B타입 B객체 생성
		B bb =new B();
		bb.print1(); // B클래스 print1
		bb.print2(); // A클래스 print2 (상속)
		bb.prinbt2(3); // B클래스 print2
		
		System.out.println();
		
		// # 3. A타입 선언 B객체 생성
		// A타입으로 선언해서 A타입인 것만 메서드호출가능, print1은 오버라이딩(덮어쓰기)되서 B클래스다.
		A ab = new B();
		ab.print1(); // B클래스 print1 오버라이딩되서 B클래스
		ab.print2(); // A클래스 print2
//		ab.print2(3); 오류
	}
	
}
	
	

