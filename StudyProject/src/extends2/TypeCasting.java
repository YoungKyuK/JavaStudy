package extends2;


class A{
	
	int m=3;
	void abc() {
		System.out.println( "AŬ����");
	}
}

class B extends A{
	
	int n=5;
	void bcd() {
		System.out.println( "BŬ����");
	}
}

public class TypeCasting {

	public static void main(String[] args) {
		
		A aa =new A();
		System.out.println(aa.m);
		aa.abc();
		
		B bb = new B();
		System.out.println( bb.m);
		System.out.println( bb.n);
		bb.abc();
		bb.bcd();
		System.out.println();
		
		A ab = new B(); // AŸ�� / B������ : ������ ǥ��
		System.out.println( ab.m);
		ab.abc();
	}
}
