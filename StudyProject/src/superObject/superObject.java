package superObject;


// super -> �θ�Ŭ������ ��ü
// �ʵ�� �ߺ� �Ǵ� �޼��� �������̵����� ���� ������ �θ��� �ʵ�/�޼��带 ȣ���� �� ���
class A{
	void abc() {
		System.out.println( "AŬ���� abc()");
	}
}

class B extends A{
	void abc() {
		System.out.println( "BŬ���� abc()");
	}
	void bcd() {
		//this.abc(); �ڽ��� ������ ȣ��
		super.abc(); //�θ��� ������ ȣ��
	}
}

public class superObject {
	
	public static void main(String[] args) {
		
		A a = new A();
		//a.abc();
		B b = new B();
		//b.abc();
		b.bcd(); // AŬ���� abc ( super Ű���� ��� )
	}

}
