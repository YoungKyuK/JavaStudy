package needForGeneric;


class MyClass<T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	
}

public class GenericArgument {

	public static void main(String[] args) {
		
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("æ»≥Á");
		System.out.println( mc1.get());
		
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.set(100);
		System.out.println( mc2.get());
		
//		MyClass<Integer> mc3 = new MyClass();
//		mc3.set("æ»≥Á"); // ∞≠«—≈∏¿‘√º≈©
	}
	
}
