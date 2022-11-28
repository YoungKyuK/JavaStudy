package FinalandAbstract;


// 추상클래스 / 추상메서드 상속하는 경우

abstract class Animal1{
	abstract void cry(); // 추상메서드가 하나라도 있으면 abstract클래스로 정의 해야함.
}

 class Cat1 extends Animal1{
	void cry() {  // 오타시 오류
		System.out.println("야옹");
	}
}

 class Dog1 extends Animal1{
	void cry() {
		System.out.println("멍멍");
	}
}

public class AbstractB {
	
	public static void main(String[] args) {
		
		// # 1. 객체 생성
		Animal1 animal1 = new Cat1();
		Animal1 animal2 = new Dog1();
		
		// # 2. 메서드 호출
		animal1.cry(); // 야옹
		animal2.cry(); // 멍멍
	}


}
