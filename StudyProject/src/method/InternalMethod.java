package method;

public class InternalMethod {

	public static void main(String[] args) {
		
		// ���� Ŭ���� �ȿ� �ִ� ���θ޼��� ȣ�� ( ������������ �޼��� ��������..��ü �ʿ���� )
		print();
		
		int a = twice(3);
		System.out.println( a ); // 6
		
		double b = sum( a, 5.8);
		System.out.println( b ); // 11.8
		
		
		
	}
	
	public static void print() {
		System.out.println("�ȳ�");
	}
	
	public static int twice(int k) {
		/// ...
		return k*2;
	}
	
	public static double sum (int m, double n) {
		return m+n;
	}
}
