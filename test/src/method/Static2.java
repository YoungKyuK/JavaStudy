package method;


// static �ʵ��� ���� Ư¡

class B{
	int m=3; // �ν��Ͻ� �ʵ�
	static int n=5; // ���� �ʵ�
}

public class Static2 {

	public static void main(String[] args) {
		
		B b1 = new B();
		B b2 = new B();
		
		// �ν��Ͻ� �ʵ�
		b1.m=6;
		b2.m=8;
		
		System.out.println( b1.m);
		System.out.println( b2.m);
		
		// �����ʵ�
		
		b1.n=10;
		b2.n=11;
		
		System.out.println( b1.n); // 11
		System.out.println( b2.n); // 11
		
		B.n=9;
		System.out.println( );
		System.out.println( b1.n); // 9
		System.out.println( b2.n); // 9
		
	}
	
	
}
