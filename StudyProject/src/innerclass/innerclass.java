package innerclass;

import InterFace4.defaultMethod;

class A{
	public int a=3;
	protected int b=4;
	int c=5;
	private int d=6;
	
	void abc() {
		System.out.println( "AŬ������ �޼��� abc()");
	}
	
	// �ܺ�Ŭ������ ��� ���������� ��� ���� ���� ( �߰�ȣ�� �����ϰ� �ֱ� ���� )
	// �ܺ�Ŭ���� A.class
	// �ܺ�Ŭ����$����Ŭ����.class
	class B{
		int a=10;
		int b=11;
		
		void bcd() { 
			System.out.println( this.a); //10
			System.out.println( a );  // 10
			System.out.println( b ); // 11
			System.out.println( c ); // 5
			System.out.println( d ); // 6
			abc();
		
			System.out.println( A.this.a); // 3
			
		}
	}
}

public class innerclass {
	
	public static void main(String[] args) {
		
		
		// # 1. �ν��Ͻ� �̳�Ŭ���� ��ü ����
		// @ 1. outer Ŭ���� ��ü ����
		A a = new A();
		
		// @ 2. outer ���� �����κ��� inner Ŭ���� ��ü ����
		A.B b = a.new B();
		
		b.bcd();
		
	}
	
	

}
