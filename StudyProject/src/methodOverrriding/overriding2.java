package methodOverrriding;


class A{

	void print1() {
		System.out.println( "AŬ���� print1");
	}
	
	void print2() {
		System.out.println( "AŬ���� print2");
	}
}

class B extends A{
	
	// print1()�� �������̵�
	void print1() {
		System.out.println( "BŬ���� print1");
	}
	
	// print2()�� �����ε�
	void prinbt2( int a ) {
		System.out.println( "BŬ���� print2");
	}
}


public class overriding2 {

	// �޼��� �������̵� vs �����ε�
	// �������̵��� ����� �� ������
	// �����ε��� ������ �޼��� �̸��� �����ѵ�, �ñ״�ó (�Ű�����)�� �޶� �������� ���� �ϴ� ��
	// �����ε� ex) a.jpg , a.png�� �����̸��� �����ѵ� Ȯ���ڰ� �޶� ���������� ���� �� �ִ�.
	// �������̵� ex) a.jpg , a.jpg�� �� ����־ ����� 
	
	public static void main(String[] args) {
		
		// # 1. AŸ�� A��ü ����
		A aa = new A();
		aa.print1(); // AŬ���� print1
		aa.print2(); // AŬ���� print2
		
		System.out.println();
		
		// # 2. BŸ�� B��ü ����
		B bb =new B();
		bb.print1(); // BŬ���� print1
		bb.print2(); // AŬ���� print2 (���)
		bb.prinbt2(3); // BŬ���� print2
		
		System.out.println();
		
		// # 3. AŸ�� ���� B��ü ����
		// AŸ������ �����ؼ� AŸ���� �͸� �޼���ȣ�Ⱑ��, print1�� �������̵�(�����)�Ǽ� BŬ������.
		A ab = new B();
		ab.print1(); // BŬ���� print1 �������̵��Ǽ� BŬ����
		ab.print2(); // AŬ���� print2
//		ab.print2(3); ����
	}
	
}
	
	

