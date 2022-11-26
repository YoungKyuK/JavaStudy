package ObjectStudy;


// Object : 모든 자바 클래스의 부모 클래스

class A{ // 아무런 클래스도 상속하지않으면 컴파일러는 자동으로 extends object를 한다.
	
	int a=3;
	int b=4;
}

class B{
	
	int a=3;
	int b=4;
	
	
	public String toString() {
		
		return "필드값(a, b) =" +  a + " " + b;
	}
}

public class ObjectToString {

	public static void main(String[] args) {
		
		// #1. 객체 생성
		A a = new A();
		B b = new B();
		
		// #2. 메서드 호출           object의 메서드
		System.out.printf("%x\n", a.hashCode()); // hashcode를 16진수로 표현
		System.out.println( a ); // 패키지이름, 클래스이름 , hashcode
		System.out.println( a.toString()); // toString() 메서드는 생략시 자동추가
		System.out.println( b );
	}
}
