package AnonymousClass;


// 익명 이너클래스를 사용하는 경우 이름이 없어 한번에 객체 2개이상 생성 불가능

// 익명이너클래스로 객체 생성
class A1 {
	C1 c1 = new C1() {
		public void bcd() { // # 2
			System.out.println( "익명이너클래스");	
		}
	};
	
	void abc() { // # 1
		c1.bcd();
	}


	}


interface C1 {
	public abstract void bcd();
}


public class AnonymousClass2 {

	public static void main(String[] args) {
		
		A1 a1 = new A1();
		a1.abc(); // 익명이너클래스
		
	}
}
