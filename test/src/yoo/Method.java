package yoo;


public class Method {
	
	// Heap 메모리에 들어가는 필드값은 강제초기화 가능
	// Stack 메모리에 들어가는 지역변수는 강제초기화 불가능
	
	// 필드 heap에 저장 ( 객체안에 저장 )
	int m=4;
	int n=3;

	// 메서드 stack에 저장 
	void work1() {
		int k=5;
		System.out.println( k );
		work2(3); // work1에서 work2에 3을 넣어서 호출
		
	}
	
	void work2( int i ) {
		// int i; ( 매개변수로 넘어올경우 중괄호 안에서 제일먼저 실행 )
		// int=3이 제일먼저 실행됌
		int j=4;
		System.out.println( i+j );
	}
	
	public static void main(String[] args) {
		
	
	Method a = new Method();
	System.out.println( a.m);
	System.out.println( a.n);
	a.work1(); //5,7 ( k값과 work2의 매개변수를 합한값 )
	// 메서드는 호출 한후 작업실행
	
	
	}
}
