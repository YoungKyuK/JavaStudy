package constructor;

public class this1 {
	
	// ��� �ʵ�� �޼���� Ȱ��� �Ҽ��� �Բ� ǥ�� �ؾ� ��
	// Ŭ���� ������ �ʵ�� �޼���� �����Ϸ��� �ڵ����� this�� �ٿ���
	// �����Ϸ��� �ڵ����� �߰�

	int m;
	int n;
	
	void init( int a , int b) {
		int c=3;
		m=a;
		n=b;
	}
	
	void work() {
		init(2,3);
	}
	
}
	// this2 this = new this2();
	// �����Ϸ��� �ڵ����� this �߰�
	class this3{
		
		int m;
		int n;
		
		void init( int a , int b) {
			// a,b,c�� ���������� this�� ����
			int c=3;
			this.m=a;
			this.n=b;
		}
		
		void work() {
			this.init(2, 3);
		}
	}
