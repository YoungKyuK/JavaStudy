package InterFace1;


// 모든필드가 public static final로 정의
// 모든 메서드가 public abstract으로 정의
// 디폴트 메서드는 public으로 정의

// 자체적으로 객체생성 불가

interface A {
	
	int a = 3; //생략시 public static final 자동으로 추가
	void abc(); //생략시 public abstract 자동으로 추가
}

interface B {
	
	public static final int b = 3; 
	public abstract void bcd(); 
}

public interface InterFace1 {
	public static void main(String[] args) {
		
		// # 1. 필드의 static 특징 확인 ( 클래스/인터페이스 이름으로 바로 접근가능)
		System.out.println( A.a);
		System.out.println( B.b);
		
		// # 2. 필드의 final 특징 확인 ( 값 변경 불가 )
		// A.a=4;
		// B.b=4;
	}
	

}
