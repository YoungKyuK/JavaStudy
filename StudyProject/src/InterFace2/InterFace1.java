package InterFace2;




interface A {}
interface B {}

// # 1. 단일 인터페이스 상속
class C implements A{
	
}

// # 2. 다중 인터페이스 상속
class D implements A,B{
	
}

// # 3. 클래스와 인터페이스를 한번에 상속 ( extends와 implements 순서 변경 불가 )
class E extends D implements A,B{
	
}

public interface InterFace1 {
	public static void main(String[] args) {
		
	
	}
	

}
