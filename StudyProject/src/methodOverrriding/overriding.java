package methodOverrriding;


class Animal{
	void cry() {
		
	}
}

class Bird extends Animal{
	void cry() {
		System.out.println("±±");
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}
	
}

class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
	}
}

public class overriding {

	// �޼��� �������̵��̶�??
	// �θ�Ŭ�������� ��ӹ��� �޼��带 �������Ͽ� ��� ( ����� ���� ( �θ�Ŭ������ �޼��尡 �������Ŵ� �ƴ� ))
	
	// �ż��� �������̵��� �ϱ� ���� ����
	// �θ�Ŭ������ �޼���� �ñ״�ó �� ����Ÿ�� ����
	// �θ�Ŭ������ �޼��庸�� ���������ڴ� ���ų� �о�� �� ( �θ� �ۺ��̸�, �ۺ��ۿ� �� �� )
	
	// �ñ״�ó ex) void abc (int a, double b){}���� abc, int, double���� �ñ״�ó�̴�.
	
	// # �������̵��� ��ǥ���� ��

	// # 1. ������ Ÿ������ ���� + ������ Ÿ������ ��ü ����
	public static void main(String[] args) {
		
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry(); // ���X
		bb.cry(); // ±±
		cc.cry(); // �߿�
		dd.cry(); // �۸�
		System.out.println();
		
	// # 2. Animal Ÿ������ ���� + �ڽ�Ŭ���� Ÿ������ ��ü ���� ( ������ ǥ�� )
		
		Animal ab = new Bird(); // �����ڰ� ����
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();
		
		
	
	// # 3. �迭�� ���� 
		//Animal[] animals = new Animal[] { new Bird(), new Cat(), new Dog()};
		Animal[] animals = new Animal[] { ab, ac, ad};
		for ( Animal animal : animals) {
			animal.cry();
		}
		
		
		
	}
	
	
}
