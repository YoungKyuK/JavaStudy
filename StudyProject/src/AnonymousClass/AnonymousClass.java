package AnonymousClass;


// �͸� �̳�Ŭ������ ����ϴ� ��� �̸��� ���� �ѹ��� ��ü 2���̻� ���� �Ұ���

class A {
	C c = new B();
	
	void abc() { // # 1
		c.bcd();
	}

class B implements C{
	@Override
	public void bcd() { // # 2
	System.out.println( "�ν��Ͻ� �̳�Ŭ����");		
	}
}

}
interface C {
	public abstract void bcd();
}


public class AnonymousClass {

	public static void main(String[] args) {
		
		A a = new A();
		a.abc(); // �ν��Ͻ� �̳�Ŭ����
		
	}
}
