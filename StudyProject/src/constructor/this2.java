package constructor;

public class this2 {
	
	// 모든 필드와 메서드는 활용시 소속을 함께 표시 해야 함
	// 클래스 내부의 필드와 메서드는 컴파일러가 자동으로 this를 붙여줌
	// 컴파일러가 자동으로 추가

	int m;
	int n;
	
	void init( int m , int n) {
		m=m;
		n=n;
	}
	
	int i;
	int j;
	
	void init2( int i, int j) {
		// this => 필드라고 알려줌 ( this.i => 객체 뱃속 )
		this.i=i;
		this.j=j;
	}
	
	this2(){
		System.out.println("첫번째 생성자");
	}
	
	this2(String a ){
		this(); // 첫번째줄에만 올 수있다.(첫번쨰 생성자 호출)
		System.out.println("두번째 생성자");
	}
	
	public static void main(String[] args) {
		
		this2 a = new this2();
		a.init(3, 4);
		System.out.println(a.m);
		System.out.println(a.n);
		
		this2 b = new this2();
		b.init2(3, 4);
		System.out.println( b.i);
		System.out.println( b.j);
		
		this2 c = new this2("하이");
		
		
	}
	
	
	
}
	
