package AnonymousClass;


// �͸� �̳�Ŭ������ ����ϴ� ��� �̸��� ���� �ѹ��� ��ü 2���̻� ���� �Ұ���

// �͸��̳�Ŭ������ ��ü ����
class A1 {
	C1 c1 = new C1() {
		public void bcd() { // # 2
			System.out.println( "�͸��̳�Ŭ����");	
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
		a1.abc(); // �͸��̳�Ŭ����
		
	}
}
