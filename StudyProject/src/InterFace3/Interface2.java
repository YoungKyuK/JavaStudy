package InterFace3;

import InterFace3.A;
import InterFace3.B;
import InterFace3.C;

// 방법 # 1. 자식클래스 생성 + 자식클래스 생성자로 객체 생성

interface A1 {
	int a =3;
	void abc();
}

class B1 implements A1{
	@Override
	public void abc() {
		System.out.println("방법 #1.자식클래스 생성 + 자식클래스 생성자로 객체 생성");
	}
}

// 방법 # 2. 익명이너클래스를 이용한 객체 생성

interface C1 {
	int a =3;
	void abc();
}


public interface Interface2 {
	public static void main(String[] args) {
		
		// #1. 객체 생성
		A1 b1 = new B1();
		B1 b2 = new B1();
		
		// #2. 메서드 호출
		b1.abc();
		b2.abc();
		
		C c1 = new C() {
			public void abc() {
				System.out.println("방법 # 2. 익명이너클래스를 이용한 객체 생성");
			};
			
		};
		
		C c2 = new C() {
			public void abc() {
				System.out.println("방법 # 2. 익명이너클래스를 이용한 객체 생성");
			};
			
		};
		// 메서드 호출
		c1.abc();
		c2.abc();
		
	}
	

}
