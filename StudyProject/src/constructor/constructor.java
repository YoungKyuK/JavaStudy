package constructor;

public class constructor {
	
	

	public static void main(String[] args) {
		
		// 객체 생성 및 필드 초기화
		// 모든 클래스는 생성자를 포함한다
		// 생성자도 오버로딩 가능 ( 생성자 3개 -> 객체생성방법 3개 )
		
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
