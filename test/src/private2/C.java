package private2;

import private1.A;

public class C {

	public void print() {
		
		// # 1. ��ü ����
		A a = new A(); // import A;
		
		
		// # 2. ��� Ȱ��
		System.out.print( a.a );
	//	System.out.println( a.b ); // �Ұ��� ( protected �ڱ� �ڽĸ� ���� )
	//	System.out.println( a.c ); // �Ұ��� ( default �ٸ���Ű�� �Ұ��� )
	 // System.out.println( a.d ); // private �ٸ���Ű���� ���Ұ��� 
	}
}
