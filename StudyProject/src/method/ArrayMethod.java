package method;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		
		// �迭�� �Ű������� ������ �޼��� ȣ��
		//int[] a = new int[] {1,2,3};
		// = printArray( a );
		
		printArray( new int[] {1,2,3});
	}
	
	public static void printArray( int[] a ) {
		// int[] a;
		// a = new int[] {1,2,3};
		System.out.println( Arrays.toString(a));
	}
}
