package FinalandAbstract;


// 일반 클래스 상속하는 경우

class Animal{
	void cry() {}; // 어차피 오버라이딩 할꺼라 빈거로 냅둠.
}

class Cat extends Animal{
	void cRy() {  // 오타시 오버라이딩이 안되서 빈 메서드 출력
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}

public class AbstractA {
	
	public static void main(String[] args) {
		
		// # 1. 객체 생성
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		// # 2. 메서드 호출
		animal1.cry(); // 야옹
		animal2.cry(); // 멍멍
	}


}
