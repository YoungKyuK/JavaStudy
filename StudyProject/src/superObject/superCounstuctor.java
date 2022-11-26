package superObject;

//class A{
//	A( int a){
//		System.out.println( "A 생성자");
//	}
//}
//
//class B extends A{
//	super();
//}
// 기본생성자가 없어서 에러

class C{
	C(){
		this(3);
		System.out.println( "C생성자 1");
	}
	C( int a){
		System.out.println( "C생성자 2");
	}
}

class D extends C{
	D(){
		this(3); // D(3); 호출 ( 컴파일러가 자동으로 추가한 super();호출 ) -> C생성자2(this3) 호출 -> C생성자1 호출 -> D생성자 2호출 -> D생성자1 호출
		System.out.println( "D생성자 1");
	}
	D( int a){
		// super(); 컴파일러가 자동 추가
		System.out.println( "D생성자 2");
	}
	
}

public class superCounstuctor {
	public static void main(String[] args) {
		
		//C c1 = new C();
		//C c2 = new C(2);
		D d1 = new D();
		System.out.println();
		D d2 = new D(2);
	}
}
