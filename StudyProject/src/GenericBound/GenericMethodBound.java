package GenericBound;


class A1{
	public < T extends String> void method1( T t ) {
		System.out.println( t.charAt(0));
	}
}

interface MyinterFace{
	public abstract void print();
}

class B1{
	public < T extends MyinterFace> void method1( T t) {
		t.print();
	}
}


public class GenericMethodBound {
	
	public static void main(String[] args) {
		
		A1 a1 = new A1();
		a1.method1("¾È³ç");
		
		B1 b1 = new B1();
		b1.method1(new MyinterFace() {
			
			@Override
			public void print() {
				System.out.println("print() ±¸Çö");
			}
		});
		

	}

}
