package ObjectStudy;


// Object : ��� �ڹ� Ŭ������ �θ� Ŭ����

class A{ // �ƹ��� Ŭ������ ������������� �����Ϸ��� �ڵ����� extends object�� �Ѵ�.
	
	int a=3;
	int b=4;
}

class B{
	
	int a=3;
	int b=4;
	
	
	public String toString() {
		
		return "�ʵ尪(a, b) =" +  a + " " + b;
	}
}

public class ObjectToString {

	public static void main(String[] args) {
		
		// #1. ��ü ����
		A a = new A();
		B b = new B();
		
		// #2. �޼��� ȣ��           object�� �޼���
		System.out.printf("%x\n", a.hashCode()); // hashcode�� 16������ ǥ��
		System.out.println( a ); // ��Ű���̸�, Ŭ�����̸� , hashcode
		System.out.println( a.toString()); // toString() �޼���� ������ �ڵ��߰�
		System.out.println( b );
	}
}
