package extends1;

// ��Ӱ��� �����

class A{
	
}

class B extends A{
	
}

class C extends B{

}

class D extends B{
	
}

public class extends2 {

	public static void main(String[] args) {
		
		// # 1. AŸ���� ������ ǥ��
		A a1 = new A(); // A�� A�̴�. O
		A a2 = new B(); // B�� A�̴�. O
		A a3 = new C(); // C�� A�̴�. O
		A a4 = new D(); // D�� A�̴�. O

		// # 2. BŸ���� ������ ǥ��
//		B b1 = new A(); // A�� B�̴�. X
		B b2 = new B(); // B�� B�̴�. O
		B b3 = new C(); // C�� B�̴�. O
		B b4 = new D(); // D�� B�̴�. O
		
		// # 3. CŸ���� ������ ǥ��
//		C c1 = new A(); // A�� C�̴�. X
//		C c2 = new B(); // B�� C�̴�. X
		C c3 = new C(); // C�� C�̴�. O
//		C c4 = new D(); // D�� C�̴�. X
		
		// # 4. DŸ���� ������ ǥ��
//		D d1 = new A(); // A�� D�̴�. X
//		D d2 = new B(); // B�� D�̴�. X
//		D d3 = new C(); // C�� D�̴�. X
		D d4 = new D(); // D�� D�̴�. O
		
		
		
		// ��ĳ���� ( �ڽ� -> �θ� ) �׻� ���� ( �����Ϸ��� �ڵ�ĳ���� ) �л��� ����̴�.
		// �ٿ�ĳ���� ( �θ� -> �ڽ� ) ����� �л��̴�(X) ������ ��쿡�� �������� ĳ�����ؾ���
				
			// B���� �����ؼ� C��ü�� Heap�޸𸮿� ��ü�� ��� �ٿ�ĳ���� �Ұ���
		
				// #1. ��ĳ���� (�ڵ���ȯ) : ������ �����Ϸ��� �ڵ��߰�
				A ac = (A)new C(); // C->A ��ĳ���� (�ڵ���ȯ)
				B bc = (B)new C(); // C->B ��ĳ���� (�ڵ���ȯ)

				B bb = new B();
				A a = (A)bb; // B->A ��ĳ���� (�ڵ���ȯ)
				
				// #2. �ٿ�ĳ���� (������ȯ) : ĳ������ �Ұ����� ��� (����� ���ܹ߻�)
				A aa = new A();
				B b= (B)aa; // A->B �ٿ�ĳ���� ( ������ȯ )
				
				
		
				
				
		
		
		
		
	}
}
