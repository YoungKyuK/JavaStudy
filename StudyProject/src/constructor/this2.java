package constructor;

public class this2 {
	
	// ��� �ʵ�� �޼���� Ȱ��� �Ҽ��� �Բ� ǥ�� �ؾ� ��
	// Ŭ���� ������ �ʵ�� �޼���� �����Ϸ��� �ڵ����� this�� �ٿ���
	// �����Ϸ��� �ڵ����� �߰�

	int m;
	int n;
	
	void init( int m , int n) {
		m=m;
		n=n;
	}
	
	int i;
	int j;
	
	void init2( int i, int j) {
		// this => �ʵ��� �˷��� ( this.i => ��ü ��� )
		this.i=i;
		this.j=j;
	}
	
	this2(){
		System.out.println("ù��° ������");
	}
	
	this2(String a ){
		this(); // ù��°�ٿ��� �� ���ִ�.(ù���� ������ ȣ��)
		System.out.println("�ι�° ������");
	}
	
	public static void main(String[] args) {
		
		this2 a = new this2();
		a.init(3, 4);
		System.out.println(a.m);
		System.out.println(a.n);
		
		this2 b = new this2();
		b.init2(3, 4);
		System.out.println( b.i);
		System.out.println( b.j);
		
		this2 c = new this2("����");
		
		
	}
	
	
	
}
	
