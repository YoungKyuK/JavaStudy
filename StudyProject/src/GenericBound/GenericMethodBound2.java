package GenericBound;


class A2{}
class B2 extends A2{}
class C2 extends B2{}
class D2 extends C2{}

class Goods<T>{
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

class test{
	
	void method1( Goods<A2> g) {}				// case 1 : A
	void method2( Goods<?> g) {}				// case 2 : A,B,C,D
	void method3( Goods<? extends B2> g ) {}		// case 3 : B,C,D
	void method4( Goods<? super B2> g) {}		// case 4 : A,B
	
	
}


public class GenericMethodBound2 {
	
	public static void main(String[] args) {
		
		test t1 = new test();
		
		// # 1. case 1
		t1.method1( new Goods<A2>());
//		t1.method1( new Goods<B2>());
//		t1.method1( new Goods<C2>());
//		t1.method1( new Goods<D2>());
		
		// # 2. case 2
		t1.method2( new Goods<A2>());
		t1.method2( new Goods<B2>());
		t1.method2( new Goods<C2>());
		t1.method2( new Goods<D2>());
		
		// # 3. case 3
//		t1.method3( new Goods<A2>());
		t1.method3( new Goods<B2>());
		t1.method3( new Goods<C2>());
		t1.method3( new Goods<D2>());
		
		// # 4. case 4
		t1.method4( new Goods<A2>());
		t1.method4( new Goods<B2>());
//		t1.method4( new Goods<C2>());
//		t1.method4( new Goods<D2>());
		
		
		
		

	}

}
