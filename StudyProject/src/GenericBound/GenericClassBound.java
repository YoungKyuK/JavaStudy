package GenericBound;


class A{}
class B extends A {}
class C extends B {}

class D <T extends B>{ // B를 상속해서 B까지 올 수 있다 ( B, C )
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
		
//		D<A> d1 = new D<>(); // 불가능 ( B,C만 올 수 있음 )
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D(); // D는 최상위인 B타입으로 선언된거와 같음. D<B> d43= new D<>();
		
		d2.set(new B());
		d3.set(new C());
		
//		d3.set(new B()); // 불가능
		d3.set(new C());
		
		d4.set(new B());
		d4.set(new C());
	}

}
