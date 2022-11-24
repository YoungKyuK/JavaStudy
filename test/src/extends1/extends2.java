package extends1;

// 상속관계 만들기

class A{
	
}

class B extends A{
	
}

class C extends B{

}

class D extends B{
	
}

public class extends2 {

	public static void main(String[] args) {
		
		// # 1. A타입의 다형적 표현
		A a1 = new A(); // A는 A이다. O
		A a2 = new B(); // B는 A이다. O
		A a3 = new C(); // C는 A이다. O
		A a4 = new D(); // D는 A이다. O

		// # 2. B타입의 다형적 표현
//		B b1 = new A(); // A는 B이다. X
		B b2 = new B(); // B는 B이다. O
		B b3 = new C(); // C는 B이다. O
		B b4 = new D(); // D는 B이다. O
		
		// # 3. C타입의 다형적 표현
//		C c1 = new A(); // A는 C이다. X
//		C c2 = new B(); // B는 C이다. X
		C c3 = new C(); // C는 C이다. O
//		C c4 = new D(); // D는 C이다. X
		
		// # 4. D타입의 다형적 표현
//		D d1 = new A(); // A는 D이다. X
//		D d2 = new B(); // B는 D이다. X
//		D d3 = new C(); // C는 D이다. X
		D d4 = new D(); // D는 D이다. O
		
		
		
		// 업캐스팅 ( 자식 -> 부모 ) 항상 가능 ( 컴파일러가 자동캐스팅 ) 학생은 사람이다.
		// 다운캐스팅 ( 부모 -> 자식 ) 사람은 학생이다(X) 가능한 경우에는 수동으로 캐스팅해야함
				
			// B까지 생성해서 C객체는 Heap메모리에 객체가 없어서 다운캐스팅 불가능
		
				// #1. 업캐스팅 (자동변환) : 생략시 컴파일러가 자동추가
				A ac = (A)new C(); // C->A 업캐스팅 (자동변환)
				B bc = (B)new C(); // C->B 업캐스팅 (자동변환)

				B bb = new B();
				A a = (A)bb; // B->A 업캐스팅 (자동변환)
				
				// #2. 다운캐스팅 (수동변환) : 캐스팅이 불가능한 경우 (실행시 예외발생)
				A aa = new A();
				B b= (B)aa; // A->B 다운캐스팅 ( 수동변환 )
				
				
		
				
				
		
		
		
		
	}
}
