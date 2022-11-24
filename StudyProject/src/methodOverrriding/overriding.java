package methodOverrriding;


class Animal{
	void cry() {
		
	}
}

class Bird extends Animal{
	void cry() {
		System.out.println("짹짹");
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
	
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}

public class overriding {

	// 메서드 오버라이딩이란??
	// 부모클래스에게 상속받은 메서드를 재정의하여 사용 ( 덮어쓰기 개념 ( 부모클래스의 메서드가 없어진거는 아님 ))
	
	// 매서드 오버라이딩을 하기 위한 조건
	// 부모클래스의 메서드와 시그니처 및 리턴타입 동일
	// 부모클래스의 메서드보다 접근지정자는 같거나 넓어야 함 ( 부모가 퍼블릭이면, 퍼블릭밖에 못 씀 )
	
	// 시그니처 ex) void abc (int a, double b){}에서 abc, int, double등이 시그니처이다.
	
	// # 오버라이딩의 대표적인 예

	// # 1. 각각의 타입으로 선언 + 각각의 타입으로 객체 생성
	public static void main(String[] args) {
		
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry(); // 출력X
		bb.cry(); // 짹짹
		cc.cry(); // 야옹
		dd.cry(); // 멍멍
		System.out.println();
		
	// # 2. Animal 타입으로 선언 + 자식클래스 타입으로 객체 생성 ( 다형적 표현 )
		
		Animal ab = new Bird(); // 생성자가 기준
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();
		
		
	
	// # 3. 배열로 관리 
		//Animal[] animals = new Animal[] { new Bird(), new Cat(), new Dog()};
		Animal[] animals = new Animal[] { ab, ac, ad};
		for ( Animal animal : animals) {
			animal.cry();
		}
		
		
		
	}
	
	
}
