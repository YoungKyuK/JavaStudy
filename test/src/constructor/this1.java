package constructor;

public class this1 {
	
	// 모든 필드와 메서드는 활용시 소속을 함께 표시 해야 함
	// 클래스 내부의 필드와 메서드는 컴파일러가 자동으로 this를 붙여줌
	// 컴파일러가 자동으로 추가

	int m;
	int n;
	
	void init( int a , int b) {
		int c=3;
		m=a;
		n=b;
	}
	
	void work() {
		init(2,3);
	}
	
}
	// this2 this = new this2();
	// 컴파일러가 자동으로 this 추가
	class this3{
		
		int m;
		int n;
		
		void init( int a , int b) {
			// a,b,c는 지역변수로 this가 없음
			int c=3;
			this.m=a;
			this.n=b;
		}
		
		void work() {
			this.init(2, 3);
		}
	}
