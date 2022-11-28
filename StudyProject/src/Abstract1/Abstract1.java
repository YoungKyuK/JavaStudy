package Abstract1;

// �߻�Ŭ������ ? ( �ؾ��� ��ǰ ) �Ϲ�Ŭ������ ����Ͽ� ��ü �����ؾ� ��.
// �߻�޼��带 ������ Ŭ���� ( �޼����� ��ü({})�� ���ǵ������� �̿ϼ� �޼��� )
// ex ) abstract void abc();
// ��ü���� �Ұ��� ( �̿ϼ� �޼��带 �����ϴ� Ŭ�����̱� ���� ) 
// heap�޸𸮴� �����ʱ�ȭ������ ���µ�, stack�޸𸮴� ���� �� ������ ��ĭ���� �����ϱ� ����


abstract class A{
	abstract void abc();
}

class B extends A{
	void abc() {
		System.out.println("�Ϲ�Ŭ������ ����Ͽ� ��ü����");
	};
}

abstract class C{
	abstract void cde();
}


public class Abstract1 {
	
	public static void main(String[] args) {
		
	//  # 1.�߻�Ŭ������ �Ϲ�Ŭ������ ����Ͽ� ��ü���� ( ��ü ������ ���鶧 ��� )
		B b1 = new B();
		B b2 = new B();
		
		b1.abc();
		b2.abc();
		
	// # 2. �͸��̳�Ŭ������ ����Ͽ� ��ü���� ( ����Ҷ����� ��ü �����ؾ��ؼ� ��ȸ���� �� ����.. ���� Ŭ������ �� ���� �� )
		C c1 = new C() {
			void cde() {
				System.out.println("�͸� �̳�Ŭ���� ����Ͽ� ��ü����");
			}
		};
		
		C c2 = new C() {
			void cde() {
				System.out.println("�͸� �̳�Ŭ���� ����Ͽ� ��ü����");
			}
		};
		
		c1.cde();
	}

	
}
