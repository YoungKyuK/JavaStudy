package yoo;

import java.lang.reflect.Array;
import java.util.Arrays;

// Ŭ������ ���� ( ���� ) : �ؾ ���
class C{
	
	int m =3;
	
	void print() {
		System.out.println( "�ż��� Ȱ��");
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
		
		
		// Ŭ�����κ��� ��ü ���� : �ؾ
		C c = new C();
		
		// Ŭ������ ��� Ȱ�� ( �ʵ� Ȱ�� : �ʵ��� ���� ����/�б� )
		c.m = 8;
		System.out.println( c.m );
		// �޼��� Ȱ�� : �޼��� ȣ��, �ؾ�� �Ա�
		c.print();
	}

	// Ŭ���� �ȿ� �� �� �ִ� 4����
	
	// 1. �ʵ� (���) : Ŭ���� Ư¡�� ��Ÿ���� ����
		int age = 30;
	
	// 2. �޼���(���) : Ŭ������ ��� ( ����Ÿ�� + �޼����̸� + () + {}�� ���� )
		String hobby() {
			return "soccer";
		}
		
	// 3. ������ : ��ü ���� ��� ( �������̸� + () + {} ), �������� �̸��� Ŭ������ �̸��� �����ؾ���.
	// 		Ŭ������ ������ ��ü ����
		public ClassStudy() {
			// TODO Auto-generated constructor stub
		}
	
	// 4. ���� Ŭ����(inner class)(���) : Ŭ���� ������ ���ǵ� Ŭ����
		class A{
			class B{
				
			}
		}
		//			=> : �ν��Ͻ�ȭ��
	//  class(�ؾ���) => Object(��ü����) ( Object�� ����� �� (�ʵ�,�޼���,�̳�Ŭ����) )
	// Object = Ŭ������ �ν��Ͻ�
	
		

	
}
	
	
		
		
	

		

