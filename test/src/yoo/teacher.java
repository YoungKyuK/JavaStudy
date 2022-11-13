package yoo;

public class teacher {
	public static void main(String[] args) {
		
		String num = "1";
		String num2 = "113";
		
		/*
		 * - 복사 : 행잡고 컨트롤 알트 방향키
		 * - 이모지 : 윈도우 + . << 공부할 떄 자주쓴다.
		 * */
		
		
		/*
		 * ✔ 형변환
		 * <strong>valueOf</strong>는 앞에 형식에 맞게 다 바꿔짐
		 * 
		 * 형변환은 valueOf만 쓴다.*/
	     int a = Integer.valueOf(num);
	     int b = Integer.valueOf(num2);
	     String.valueOf(false); // 어떤것이든 문자열로 변환
	     Boolean.valueOf(false); // 어떤것이든 참 거짓 -- 값이 0 이외는 다 참일거임
	     Double.valueOf(b); // 실수형으로 변환
	     
	     int numstr = 123;
	     int numstr2 = 444;
	     
	     // String --> 123444
	     
	     String.valueOf( numstr);
	     
		System.out.println( a + b);
		
		
		
	}
}
