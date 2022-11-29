package AnonymousClass;


// 익명 이너클래스를 사용하는 경우 이름이 없어 한번에 객체 2개이상 생성 불가능

class A {
	C c = new B();
	
	void abc() { // # 1
		c.bcd();
	}

class B implements C{
	@Override
	public void bcd() { // # 2
	System.out.println( "인스턴스 이너클래스");		
	}
}

}
interface C {
	public abstract void bcd();
}


public class AnonymousClass {

	public static void main(String[] args) {
		
		A a = new A();
		a.abc(); // 인스턴스 이너클래스
		
	}
}
