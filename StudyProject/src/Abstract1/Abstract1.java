package Abstract1;

// 추상클래스란 ? ( 붕어빵기계 부품 ) 일반클래스로 상속하여 객체 생성해야 함.
// 추상메서드를 포함한 클래스 ( 메서드의 본체({})가 정의되지않은 미완성 메서드 )
// ex ) abstract void abc();
// 객체생성 불가능 ( 미완성 메서드를 포함하는 클래스이기 때문 ) 
// heap메모리는 강제초기화값으로 들어가는데, stack메모리는 값을 안 넣으면 빈칸으로 존재하기 떄문


abstract class A{
	abstract void abc();
}

class B extends A{
	void abc() {
		System.out.println("일반클래스로 상속하여 객체생성");
	};
}

abstract class C{
	abstract void cde();
}


public class Abstract1 {
	
	public static void main(String[] args) {
		
	//  # 1.추상클래스를 일반클래스로 상속하여 객체생성 ( 객체 여러개 만들때 사용 )
		B b1 = new B();
		B b2 = new B();
		
		b1.abc();
		b2.abc();
		
	// # 2. 익명이너클래스를 사용하여 객체생성 ( 사용할때마다 객체 생성해야해서 일회성일 때 좋음.. 따로 클래스를 안 만들어도 됌 )
		C c1 = new C() {
			void cde() {
				System.out.println("익명 이너클래스 사용하여 객체생성");
			}
		};
		
		C c2 = new C() {
			void cde() {
				System.out.println("익명 이너클래스 사용하여 객체생성");
			}
		};
		
		c1.cde();
	}

	
}
