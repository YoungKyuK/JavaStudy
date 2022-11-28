package InterFace3;

import InterFace3.A;
import InterFace3.B;
import InterFace3.C;

// ��� # 1. �ڽ�Ŭ���� ���� + �ڽ�Ŭ���� �����ڷ� ��ü ����

interface A1 {
	int a =3;
	void abc();
}

class B1 implements A1{
	@Override
	public void abc() {
		System.out.println("��� #1.�ڽ�Ŭ���� ���� + �ڽ�Ŭ���� �����ڷ� ��ü ����");
	}
}

// ��� # 2. �͸��̳�Ŭ������ �̿��� ��ü ����

interface C1 {
	int a =3;
	void abc();
}


public interface Interface2 {
	public static void main(String[] args) {
		
		// #1. ��ü ����
		A1 b1 = new B1();
		B1 b2 = new B1();
		
		// #2. �޼��� ȣ��
		b1.abc();
		b2.abc();
		
		C c1 = new C() {
			public void abc() {
				System.out.println("��� # 2. �͸��̳�Ŭ������ �̿��� ��ü ����");
			};
			
		};
		
		C c2 = new C() {
			public void abc() {
				System.out.println("��� # 2. �͸��̳�Ŭ������ �̿��� ��ü ����");
			};
			
		};
		// �޼��� ȣ��
		c1.abc();
		c2.abc();
		
	}
	

}
