package fieldOverriding;

class A{
	 static int m=3;
}

class B extends A{
	static int m=4;
}

public class fieldOverridng {

	public static void main(String[] args) {
		
		// �ν��Ͻ� �ʵ�� �������̵� ���� ����
		// �����󿡼� �и��Ǽ� ������� ��������� �ʴ´�
		
		// #1. ��ü ����
		A a = new A();
		B b = new B();
		
		// AŸ�Լ��� B ����
		A ab = new B();
	
		// #2. �ν��Ͻ� �ʵ�
		System.out.println( a.m); // 3
		System.out.println( b.m); // 4 
		System.out.println( ab.m); // 3 
		
	}
}
