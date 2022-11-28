package InterFace4;


interface A{ 
	void abc(); // 2021년 생성
	default void bcd() {
		System.out.println("A 인터페이스의 bcd()");
	} // 2022년 생성 ( 완성된 메서드 )
}

class B implements A{ // 2021년 생성
	
	@Override
	public void abc() {
		A.super.bcd(); // super.bcd();라고 적으면 부모클래스의 bcd();를 호출하란 소리 부모클래스의 bcd는 오브젝트가 나와서 A(인터페이스)를 적어줘야함.
		System.out.println( "B클래스의 abc()");
		
	}
}
class C implements A {
	
	@Override
	public void abc() {
		System.out.println( "C클래스의 abc()");	
	}
	@Override
	public void bcd() {
		System.out.println( "C클래스의 bcd()");	
	}
}

public class defaultMethod {
	
	public static void main(String[] args) {
		
		// # 1. 객체 생성
		A a1 = new B();
		A a2 = new C();
		
		// # 2. 메서드 호출
		a1.abc(); // B클래스의 abc()
		a1.bcd(); // A 인터페이스의 bcd()
		
		a2.abc(); // C클래스의 abc()
		a2.bcd(); // C클래스의 bcd()
		
		
		
	}

}
