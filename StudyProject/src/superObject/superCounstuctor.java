package superObject;

//class A{
//	A( int a){
//		System.out.println( "A ������");
//	}
//}
//
//class B extends A{
//	super();
//}
// �⺻�����ڰ� ��� ����

class C{
	C(){
		this(3);
		System.out.println( "C������ 1");
	}
	C( int a){
		System.out.println( "C������ 2");
	}
}

class D extends C{
	D(){
		this(3); // D(3); ȣ�� ( �����Ϸ��� �ڵ����� �߰��� super();ȣ�� ) -> C������2(this3) ȣ�� -> C������1 ȣ�� -> D������ 2ȣ�� -> D������1 ȣ��
		System.out.println( "D������ 1");
	}
	D( int a){
		// super(); �����Ϸ��� �ڵ� �߰�
		System.out.println( "D������ 2");
	}
	
}

public class superCounstuctor {
	public static void main(String[] args) {
		
		//C c1 = new C();
		//C c2 = new C(2);
		D d1 = new D();
		System.out.println();
		D d2 = new D(2);
	}
}
