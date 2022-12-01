package HashSetEx01;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class A{
	int data;

	public A(int data) {
		this.data = data;
	}
}

class B {
	int data;

	public B(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof B) {
		this.data = ((B)obj).data;
		return true;
	}
		return false;
	}
}

class C {
	int data;

	public C(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof C) {
		this.data = ((C)obj).data;
		return true;
	}
		return false;
	}
	
	@Override
	public int hashCode() {
		// Objects.hashCode(data) 데이터를 기반으로 해쉬코드 생성
		// == data 이렇게 적어도됌 근데 위에것이 더 좋음
		return Objects.hashCode(data);
	}
}

public class set02 {
	public static void main(String[] args) {
		
		// #1. 어떤것도 오버라이딩 하지 않음
		Set<A> hashSet1 = new HashSet<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println( a1==a2 ); //stack메모리의 값이 같은가 ( 위치정보 )
		System.out.println( a1.equals(a2)); // Object의 equals를 사용 ( object equals는 == 과 동일함 )
		System.out.println( a1.hashCode() + "," + a2.hashCode());
		hashSet1.add(a1);
		hashSet1.add(a2);
		System.out.println( hashSet1.size()); // 2 (다른객체)
		System.out.println();
		
		// #2. equals만 오버라이딩
		Set<B> hashSet2 = new HashSet<>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println( b1==b2 ); //stack메모리의 값이 같은가 ( 위치정보 )
		System.out.println( b1.equals(b2)); // true equals 메서드만 오버라이딩 
		System.out.println( b1.hashCode() + "," + b2.hashCode());
		hashSet2.add(b1);
		hashSet2.add(b2);
		System.out.println( hashSet2.size()); // 2 (다른객체)
		System.out.println();
		
		// #3. equals() +  hashcode() 오버라이딩
		Set<C> hashSet3 = new HashSet<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println( c1==c2 ); //stack메모리의 값이 같은가 ( 위치정보 ) false
		System.out.println( c1.equals(c2)); // true equals 메서드만 오버라이딩 
		System.out.println( c1.hashCode() + "," + c2.hashCode()); // 같은 hashcode
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println( hashSet3.size()); // 1
		
		
		
		
	}
	
}
