package method;

public class PlusMethod {

	// 1. 접근자
	// 2. 반환타입
	// 3. 변수명
	// 4. 파라미터(받는 값)
	// 접근 쉽게하기 위해
	public int plus(int 첫숫자, int 두번째숫자) {
		return 첫숫자+두번째숫자; // 2번 반환값 섞어주면 끝
	};
	
	private void tt() {
		
	}
	
	/**
	 * void는 return을 안해줘도 문제없다.
	 * 
	 * 나머지는 전부 return 필수
	 * */
	
		// 바로 접근가능 ( static )
	public static int 마이너스( int 숫자1, int 숫자2) {
		return 숫자1-숫자2;
	}
}
