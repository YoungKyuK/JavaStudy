package ObjectStudy;

import java.util.HashMap;

class A1{
	
	String name;
	A1( String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
						// DŸ������ �ٿ�ĳ����
		if ( this.name == ((A1)obj).name) {
			return true;
		} else {
			return false;
		}
	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}

class B1{
	
	String name;
	B1( String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
						// DŸ������ �ٿ�ĳ����
		if ( this.name == ((B1)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
	
		return name.hashCode(); // name�̶� ���ڿ��� �ؽ��ڵ尡 ���ϵ� (���� ���ڸ� ���� �ؽ��ڵ� ���� )
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}


public class ObjectHashCode {

	public static void main(String[] args) {
		
		//     KEY ( �ߺ� x ),  values
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "������1");
		hm1.put(1, "������2");
		hm1.put(2, "������3");
		System.out.println( hm1 ); // ������ 2�� ��� ( key�� �ߺ��Ǿ 1 ����� )
		
		
		HashMap<A1, String> hm2 = new HashMap<>();
		hm2.put( new A1("ù��°"), "������1");
		hm2.put( new A1("ù��°"), "������2");
		hm2.put( new A1("�ι�°"), "������3");
		
		System.out.println( hm2 ); // ������ 3�� ��� ( hashcode �������̵� ���� �ʾƼ� )
		
		HashMap<B1, String> hm3 = new HashMap<>();
		hm3.put( new B1("ù��°"), "������1");
		hm3.put( new B1("ù��°"), "������2");
		hm3.put( new B1("�ι�°"), "������3");
		
		System.out.println( hm3 ); // ������ 2�� ��� ( hashcode,equals �������̵��ؼ� �ߺ� )
								   // ��ġ�� ���ڰ� �Ѵ� �������̵��ؼ� ���� ���� ��
		
		
		
	}
}
