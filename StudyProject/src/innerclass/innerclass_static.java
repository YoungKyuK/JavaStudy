package innerclass;


class A1{
	int a=3;
	static int b=4;
	
	void method1() {
		System.out.println( "인스턴스 메서드");
	}
	
	static void method2() {
		System.out.println( "스테틱 메서드");
	}
	
	
	static class B1{
		void bcd() {
			// # 1. outer 클래스 필드 접근
			// System.out.println( a ); 불가능 static은 static만 포함 가능
			System.out.println( b );
			
			// # 2. outer 클래스 메서드 접근
			//method1(); // 불가능 static은 static만 포함 가능
			method2(); 
		}
	}
}


public class innerclass_static {
	
	public static void main(String[] args) {
		A1.B1 b = new A1.B1();
		
		b.bcd();
	}
	

}
