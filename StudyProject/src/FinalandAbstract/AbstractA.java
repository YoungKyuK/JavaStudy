package FinalandAbstract;


// �Ϲ� Ŭ���� ����ϴ� ���

class Animal{
	void cry() {}; // ������ �������̵� �Ҳ��� ��ŷ� ����.
}

class Cat extends Animal{
	void cRy() {  // ��Ÿ�� �������̵��� �ȵǼ� �� �޼��� ���
		System.out.println("�߿�");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
	}
}

public class AbstractA {
	
	public static void main(String[] args) {
		
		// # 1. ��ü ����
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		// # 2. �޼��� ȣ��
		animal1.cry(); // �߿�
		animal2.cry(); // �۸�
	}


}
