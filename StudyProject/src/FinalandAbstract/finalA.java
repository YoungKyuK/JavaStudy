package FinalandAbstract;

class A1{
	int a = 3;
	final int b = 5;
	A1(){
		int b = 9; // 불가능
	}
}
	
	
class A2{
	int a = 3;
	final int b;
	A2(){
		a = 3 ;
		b = 5 ;
	}
}

	public class finalA {

	public static void main(String[] args) {
		
		// # 1. 객체 생성
		A1 a1 = new A1();
		A2 a2 = new A2();
		a1.a = 7;
     // a1.b = 9; 파이널필드는 한번 정해진 값을 다시 바꿀 수 없다.
		
		a2.a = 7;
	// a2.b = 9; 파이널필드는 한번 정해진 값을 다시 바꿀 수 없다.
		
		
	}
}
