package yoo;


public class Method {
	
	// Heap �޸𸮿� ���� �ʵ尪�� �����ʱ�ȭ ����
	// Stack �޸𸮿� ���� ���������� �����ʱ�ȭ �Ұ���
	
	// �ʵ� heap�� ���� ( ��ü�ȿ� ���� )
	int m=4;
	int n=3;

	// �޼��� stack�� ���� 
	void work1() {
		int k=5;
		System.out.println( k );
		work2(3); // work1���� work2�� 3�� �־ ȣ��
		
	}
	
	void work2( int i ) {
		// int i; ( �Ű������� �Ѿ�ð�� �߰�ȣ �ȿ��� ���ϸ��� ���� )
		// int=3�� ���ϸ��� ������
		int j=4;
		System.out.println( i+j );
	}
	
	public static void main(String[] args) {
		
	
	Method a = new Method();
	System.out.println( a.m);
	System.out.println( a.n);
	a.work1(); //5,7 ( k���� work2�� �Ű������� ���Ѱ� )
	// �޼���� ȣ�� ���� �۾�����
	
	
	}
}
