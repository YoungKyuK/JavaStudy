package method;

// Ŭ���� �ܺο��� �޼��� ȣ��

// # 1. Ŭ������ ����
class A{
	// @ 1. ����Ÿ�� : void + �Ű����� ����
	void print() {
		System.out.println("�ȳ�");
	}
	
	// @ 2. ����Ÿ�� : int + �Ű����� ����
		 int data() {
			 /// ... 
			return 3;
		}
		 
		// @ 3. ����Ÿ�� : doule + �Ű����� 2��
			double sum( int c , double d) {
				return c+d;
			}
		// @ 4. ���� Ÿ�� : void + ���ο� �������� ( �Լ��� �����Ѵٴ� �ǹ� )
			void printMonth( int m ) {
				if( m<0 || m>12) {
					System.out.println( "�߸��� �Է�");
					return;
				}
				System.out.println(  m + "���Դϴ�.");
			}
}

public class MethodStudy {

	public static void main(String[] args) {
		
		// # 2. ��ü ����
		A a = new A();
		
		// # 3. �޼��� ȣ�� ( ��� Ȱ�� )
		a.print(); // �ȳ�
		
		int k = a.data();
		System.out.println(k); // 3
		
		double result = a.sum(3 , 5.2);
		System.out.println( result ); // 8.2
		
		a.printMonth(5); // 5��
		a.printMonth(15); // �߸��� �Է�
		
		
		
		
		
		// 1 + 1 = 2
		// 2 + 2 = 4
		
		//PlusMethod a = new PlusMethod();
		
		
		//System.out.println( a.plus(1, 100) );
		//System.out.println( a.plus(5, 100)  );
		
		System.out.println(PlusMethod.min(100, 9));
		PlusMethod b = new PlusMethod();
		
		System.out.println( b.plus(8, 5));
		
		 
		
		
		
		
		
	}
	
	
}
