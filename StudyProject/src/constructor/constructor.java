package constructor;

public class constructor {
	
	

	public static void main(String[] args) {
		
		// ��ü ���� �� �ʵ� �ʱ�ȭ
		// ��� Ŭ������ �����ڸ� �����Ѵ�
		// �����ڵ� �����ε� ���� ( ������ 3�� -> ��ü������� 3�� )
		
		class A {
			int m;
			void work() {
				System.out.println(m);
			}
		}
		
		class B {
			int m;
			void work() {
				System.out.println(m);
			}
		}
		
		class C {
			int m;
			void work() {
				System.out.println(m);
			}
			C (int a){
				m=a;
			}
		}
		
		
		
		A a = new A();
		a.work(); // 0
		
		B b = new B();
		b.work(); // 0
		
		C c = new C(3);
		c.work(); // 3;
		
	
		
		
	}
	
	
	

}
