package FinalandAbstract;


// �߻�Ŭ���� / �߻�޼��� ����ϴ� ���

abstract class Animal1{
	abstract void cry(); // �߻�޼��尡 �ϳ��� ������ abstractŬ������ ���� �ؾ���.
}

 class Cat1 extends Animal1{
	void cry() {  // ��Ÿ�� ����
		System.out.println("�߿�");
	}
}

 class Dog1 extends Animal1{
	void cry() {
		System.out.println("�۸�");
	}
}

public class AbstractB {
	
	public static void main(String[] args) {
		
		// # 1. ��ü ����
		Animal1 animal1 = new Cat1();
		Animal1 animal2 = new Dog1();
		
		// # 2. �޼��� ȣ��
		animal1.cry(); // �߿�
		animal2.cry(); // �۸�
	}


}
