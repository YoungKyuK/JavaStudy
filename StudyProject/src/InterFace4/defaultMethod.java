package InterFace4;


interface A{ 
	void abc(); // 2021�� ����
	default void bcd() {
		System.out.println("A �������̽��� bcd()");
	} // 2022�� ���� ( �ϼ��� �޼��� )
}

class B implements A{ // 2021�� ����
	
	@Override
	public void abc() {
		A.super.bcd(); // super.bcd();��� ������ �θ�Ŭ������ bcd();�� ȣ���϶� �Ҹ� �θ�Ŭ������ bcd�� ������Ʈ�� ���ͼ� A(�������̽�)�� ���������.
		System.out.println( "BŬ������ abc()");
		
	}
}
class C implements A {
	
	@Override
	public void abc() {
		System.out.println( "CŬ������ abc()");	
	}
	@Override
	public void bcd() {
		System.out.println( "CŬ������ bcd()");	
	}
}

public class defaultMethod {
	
	public static void main(String[] args) {
		
		// # 1. ��ü ����
		A a1 = new B();
		A a2 = new C();
		
		// # 2. �޼��� ȣ��
		a1.abc(); // BŬ������ abc()
		a1.bcd(); // A �������̽��� bcd()
		
		a2.abc(); // CŬ������ abc()
		a2.bcd(); // CŬ������ bcd()
		
		
		
	}

}
