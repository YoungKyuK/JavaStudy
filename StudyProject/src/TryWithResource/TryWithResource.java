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
			System.out.println( "���ҽ��� �����Ǿ����ϴ�.");
		}
		
	}
	 
	
}


 // catch ���� ū���� �Ʒ��ʿ� ��ġ.. ���������� ���������� ����
public class TryWithResource {

	public static void main(String[] args) {
		
		// ���ҽ��� ����ϰ� finally���� ���ҽ� ���� �����ϱ�
		A a1 = null;
		try {
			a1 = new A("Ư������");
			a1.abc();
		} catch (Exception e) {
			System.out.println("����ó��");
		} finally {
			// ���ҽ� ��������
			if (a1.resource!=null) {
				try {a1.close();} catch( Exception e) {}
			}
		}
		
		// �ڵ� ���ҽ� ���� ( A implements AutoCloseable�� ���ְ� resource close() �������̵��ؼ� ó���� )
		try ( A a2 = new A("Ư������");){ // try���ٰ� ��ü ����
			a2.abc();
		} catch (Exception e) {
			System.out.println("����ó��");
		}
	}
}
