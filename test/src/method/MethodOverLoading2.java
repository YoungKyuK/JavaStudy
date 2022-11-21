package method;

public class MethodOverLoading2 {

	public static void main(String[] args) {
		
		Print(); // 데이터가 없습니다.
		Print(3);
		Print(5.8);
		Print(2, 3);
	
		
		
	}
	
	// 메서드이름만 같고, 시그니쳐가 다른 경우(매개변수의 타입이 다른경우) : 메서드의 오버로딩
	// 이름만 같고, 서명이 다르다.
	public static void Print() {
	
		System.out.println( "데이터가 없습니다.");
	}
	
	public static void Print(int a ) {
		System.out.println( a );
	}
	
	public static void Print(double a ) {
		System.out.println( a );
	}
	
	//public static void Print(double b ) { 불가능
	//	System.out.println( b );
	//}
	
	public static void Print(int a , int b ) {
		System.out.println( "a :" + a + "b :" + b );
	}
	
	//public static int Print(int a , int b ) { // 불가능 ( 메서드를 호출할때 리턴타입을 쓰지 않기때문 )
	//	System.out.println( "a :" + a + "b :" + b );
	//	return a+b;
	//}
}
