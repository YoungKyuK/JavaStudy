package innerclass;


class A1{
	int a=3;
	static int b=4;
	
	void method1() {
		System.out.println( "�ν��Ͻ� �޼���");
	}
	
	static void method2() {
		System.out.println( "����ƽ �޼���");
	}
	
	
	static class B1{
		void bcd() {
			// # 1. outer Ŭ���� �ʵ� ����
			// System.out.println( a ); �Ұ��� static�� static�� ���� ����
			System.out.println( b );
			
			// # 2. outer Ŭ���� �޼��� ����
			//method1(); // �Ұ��� static�� static�� ���� ����
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
