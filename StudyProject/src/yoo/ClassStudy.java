package yoo;

import java.lang.reflect.Array;
import java.util.Arrays;

// 클래스의 구성 ( 정의 ) : 붕어빵 기계
class C{
	
	int m =3;
	
	void print() {
		System.out.println( "매서드 활용");
	}
	
}

public class ClassStudy {
	
	public static void main(String[] args) {
		
		int[] f = new int[] {1,2,3};
		System.out.println( Arrays.toString( f ) ); // 1,2,3
		
		String[] g = new String[3];
		for ( int k=0; k<3; k++) {
			System.out.println( k );
			for ( String z : g ) {
				System.out.println( Arrays.toString(new int[] {1,2,3}));
			}
		}
		
		
		// 클래스로부터 객체 생성 : 붕어빵
		C c = new C();
		
		// 클래스의 멤버 활용 ( 필드 활용 : 필드의 값을 쓰기/읽기 )
		c.m = 8;
		System.out.println( c.m );
		// 메서드 활용 : 메서드 호출, 붕어빵을 먹기
		c.print();
	}

	// 클래스 안에 올 수 있는 4가지
	
	// 1. 필드 (멤버) : 클래스 특징을 나타내는 변수
		int age = 30;
	
	// 2. 메서드(멤버) : 클래스의 기능 ( 리턴타입 + 메서드이름 + () + {}로 구성 )
		String hobby() {
			return "soccer";
		}
		
	// 3. 생성자 : 객체 생성 기능 ( 생성자이름 + () + {} ), 생성자의 이름은 클래스의 이름과 동일해야함.
	// 		클래스를 가지고 객체 생성
		public ClassStudy() {
			// TODO Auto-generated constructor stub
		}
	
	// 4. 내부 클래스(inner class)(멤버) : 클래스 내부의 정의된 클래스
		class A{
			class B{
				
			}
		}
		//			=> : 인스턴스화ㅇ
	//  class(붕어빵기계) => Object(객체생성) ( Object에 멤버가 들어감 (필드,메서드,이너클래스) )
	// Object = 클래스의 인스턴스
	
		

	
}
	
	
		
		
	

		

