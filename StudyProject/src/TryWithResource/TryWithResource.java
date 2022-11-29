package TryWithResource;

class A implements AutoCloseable{
	String resource;
	 A( String resource) {
		this.resource = resource;
	}
	 void abc() throws Exception {
		 
	 }
	 
	 @Override
	public void close() throws Exception {
		if ( resource != null) {
			resource = null;
			System.out.println( "리소스가 해제되었습니다.");
		}
		
	}
	 
	
}


 // catch 블럭은 큰것을 아래쪽에 배치.. 위에서부터 순차적으로 읽음
public class TryWithResource {

	public static void main(String[] args) {
		
		// 리소스를 사용하고 finally에서 리소스 수동 해제하기
		A a1 = null;
		try {
			a1 = new A("특정파일");
			a1.abc();
		} catch (Exception e) {
			System.out.println("예외처리");
		} finally {
			// 리소스 수동해제
			if (a1.resource!=null) {
				try {a1.close();} catch( Exception e) {}
			}
		}
		
		// 자동 리소스 해제 ( A implements AutoCloseable를 해주고 resource close() 오버라이드해서 처리함 )
		try ( A a2 = new A("특정파일");){ // try에다가 객체 생성
			a2.abc();
		} catch (Exception e) {
			System.out.println("예외처리");
		}
	}
}
