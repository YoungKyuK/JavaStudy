package superObject;


// super -> 부모클래스의 객체
// 필드명 중복 또는 메서드 오버라이딩으로 인해 가려진 부모의 필드/메서드를 호출할 때 사용
class A{
	void abc() {
		System.out.println( "A클래스 abc()");
	}
}

class B extends A{
	void abc() {
		System.out.println( "B클래스 abc()");
	}
	void bcd() {
		//this.abc(); 자신의 생성자 호출
		super.abc(); //부모의 생성자 호출
	}
}

public class superObject {
	
	public static void main(String[] args) {
		
		A a = new A();
		//a.abc();
		B b = new B();
		//b.abc();
		b.bcd(); // A클래스 abc ( super 키워드 사용 )
	}

}
