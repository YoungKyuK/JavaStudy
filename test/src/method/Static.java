package method;

public class Static {

	int a=1; // 인스턴스 필드
	static int b=2; // static(정적) 필드
	
	public static void main(String[] args) {
		
		// # 1. 인스턴스 필드 활용방법 ( 항상 객체 생성 한후 사용가능 )
		Static a1 = new Static();
		System.out.println( a1.a);
		
		// # 2. static ( 정적 ) 필드 활용방법
		// # 1 ( 객체 생성없이 클래스 이름으로 바로활용 )
		System.out.println(Static.b);
		
		// # 2 ( 객체 생성 후 활용, 인스턴스와 동일하게 : 가능한 지양)
		
		Static a2 = new Static();
		System.out.println( a2.b);
		
		
	}
}
