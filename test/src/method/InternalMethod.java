package method;

public class InternalMethod {

	public static void main(String[] args) {
		
		// 같은 클래스 안에 있는 내부메서드 호출 ( 참조변수없이 메서드 생성가능..객체 필요없음 )
		print();
		
		int a = twice(3);
		System.out.println( a ); // 6
		
		double b = sum( a, 5.8);
		System.out.println( b ); // 11.8
		
		
		
	}
	
	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int k) {
		/// ...
		return k*2;
	}
	
	public static double sum (int m, double n) {
		return m+n;
	}
}
