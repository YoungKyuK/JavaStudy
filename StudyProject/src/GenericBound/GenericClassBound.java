package GenericBound;


class A{}
class B extends A {}
class C extends B {}

class D <T extends B>{ // B�� ����ؼ� B���� �� �� �ִ� ( B, C )
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}


public class GenericClassBound {
	
	public static void main(String[] args) {
		
//		D<A> d1 = new D<>(); // �Ұ��� ( B,C�� �� �� ���� )
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D(); // D�� �ֻ����� BŸ������ ����Ȱſ� ����. D<B> d43= new D<>();
		
		d2.set(new B());
		d3.set(new C());
		
//		d3.set(new B()); // �Ұ���
		d3.set(new C());
		
		d4.set(new B());
		d4.set(new C());
	}

}
