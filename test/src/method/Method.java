package method;

public class Method {

	public static void main(String[] args) {
		
		int a = 3;
		int result1 = twice(3);
		System.out.println( result1 ); // 6
		
		int result2 = twice(a);
		System.out.println( result2); // 6
		
		System.out.println( a ); // 3
	}
	
						// 3으로 내려받고 매개변수에 대입, 그 후 a=a*2 계산하고 a로 리턴
	public static int twice (int a) {
		a= a*2;
		return a;
	}
}
