package method;

public class MethodOverLoading2 {

	public static void main(String[] args) {
		
		Print(); // �����Ͱ� �����ϴ�.
		Print(3);
		Print(5.8);
		Print(2, 3);
	
		
		
	}
	
	// �޼����̸��� ����, �ñ״��İ� �ٸ� ���(�Ű������� Ÿ���� �ٸ����) : �޼����� �����ε�
	// �̸��� ����, ������ �ٸ���.
	public static void Print() {
	
		System.out.println( "�����Ͱ� �����ϴ�.");
	}
	
	public static void Print(int a ) {
		System.out.println( a );
	}
	
	public static void Print(double a ) {
		System.out.println( a );
	}
	
	//public static void Print(double b ) { �Ұ���
	//	System.out.println( b );
	//}
	
	public static void Print(int a , int b ) {
		System.out.println( "a :" + a + "b :" + b );
	}
	
	//public static int Print(int a , int b ) { // �Ұ��� ( �޼��带 ȣ���Ҷ� ����Ÿ���� ���� �ʱ⶧�� )
	//	System.out.println( "a :" + a + "b :" + b );
	//	return a+b;
	//}
}
