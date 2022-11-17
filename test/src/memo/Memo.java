package memo;

public class Memo {

	
	private static final String String = null;
	// 메모리는 크게 3개로 나뉜다.
	// class,static,final,메서드영역 // Stack영역 // Heap영역
	
	// 기본자료형은 값을 Stack메모리 (값)에 저장
	// 참조(위치를 가리킨다) 자료형은 값을 Heap메모리 (위치)에 저장
	
	// 모든변수는 Stack메모리에 들어감
	
	// 논리연산자는 Short CirCuit ( 연산결과가 확정되면 나머지 연산을 수행하지 않는 것 )을 한다.
	// 비트연산자 ( | , & , ^ )는 Short CirCuit을 수행하지 않는다. ( 무조건 뒤에것도 계산 )
	// ex ) int a = 3 
	// System.out.println( true ^ a++>6);
	// System.out.println ( a ); a=4
	// a++>6 은 a>6부터 비교한 후 ++ 증감계산 
	
	// 대입
	// a = a + b 
	// a += b ( a삭제 후 등호는 제일 뒤에옴 )
	// a = a * b
	// a *= b
	
	// 삼항연산자
	// ( 참 또는 거짓 ) ? 참 인경우 수행 : 거짓인 경우 수행;
	
	// null은 참조자료형의 초기값 ( 가리키는 객체가 없다 )
	
	// int[] a = 3;
	// a = new int[3];
	//     new = (heap메모리에 값을 저장).. 값 들어갈 방 3개 생성
	
	// int[] a = new int[3];
	// 배열은 생성시 개수가 지정되어야 함
	// int[] a = new int[]{1,2,3};
	
		
	
}
