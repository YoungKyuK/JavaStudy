package memo;

import java.util.Arrays;

public class Memo {

	public static void main(String[] args) {
		
		//private static final String String = null;
		// �޸𸮴� ũ�� 3���� ������.
		// class,static,final,�޼��念�� // Stack���� // Heap����
		
		// �⺻�ڷ����� ���� Stack�޸� (��)�� ����
		// ����(��ġ�� ����Ų��) �ڷ����� ���� Heap�޸� (��ġ)�� ����
		
		// ��纯���� Stack�޸𸮿� ��
		
		// �������ڴ� Short CirCuit ( �������� Ȯ���Ǹ� ������ ������ �������� �ʴ� �� )�� �Ѵ�.
		// ��Ʈ������ ( | , & , ^ )�� Short CirCuit�� �������� �ʴ´�. ( ������ �ڿ��͵� ��� )
		// ex ) int a = 3 
		// System.out.println( true ^ a++>6);
		// System.out.println ( a ); a=4
		// a++>6 �� a>6���� ���� �� ++ ������� 
		
		// ����
		// a = a + b 
		// a += b ( a���� �� ��ȣ�� ���� �ڿ��� )
		// a = a * b
		// a *= b
		
		// ���׿�����
		// ( �� �Ǵ� ���� ) ? �� �ΰ�� ���� : ������ ��� ����;
		
		// null�� �����ڷ����� �ʱⰪ ( ����Ű�� ��ü�� ���� )
		
		// int[] a = 3;
		// a = new int[3];
		//     new = (heap�޸𸮿� ���� ����).. �� �� �� 3�� ����
		
		// int[] a = new int[3];
		// �迭�� ������ ������ �����Ǿ�� ��
		// int[] a = new int[]{1,2,3};
		
		
		// for-Each ����
		// int[] a = new int[100];
		// a[0]=1;...a[99]=100;
		// for ( int k ( �����ڷ��� ���� ): a ���� �����ڷ��� ( �迭, �÷��ǵ� ���հ�ü ) ) {
			// System.out.println( k )
		//	}
		
		// System.out.println( Arrays.toString(new int[]{1,2,3}); // 1,2,3
		
		String[] arrays = new String[3];
		
		for ( int i=0; i<3; i++) {
			System.out.println( arrays[i] + " " );
		}
		System.out.println( Arrays.toString(new int[] {1,2,3}));
		
		
		// 
		
		
		
		
		
	}
	
	
	
		

}
