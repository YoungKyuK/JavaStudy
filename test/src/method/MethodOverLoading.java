package method;

import java.util.Arrays;

public class MethodOverLoading {

	public static void main(String[] args) {
	
	
		// # 1.
		
		method1(1,2);
		method1(1,2,3);
		method1();
		
		// # 2.
		
		method2("�ȳ�","�氡");
		method2("��ť","����","����");
		method2();
		
	}
	
	public static void method1( int...values) { // �������� �迭
		System.out.println( "�迭�� ���� : " + values.length);
		
//		for( int i=0; i<values.length; i++) {
//			System.out.print( values[i]);
//		}
		
		for( int k : values) {
			System.out.print( k);
		}
		
		//System.out.println( Arrays.toString( values ));
		
		System.out.println();
	}
	
//	public static void method1() {
//		
//	}
//	
//	public static void method1( int a , int b) {
//		
//	}
//	
//	public static void method1( int a , int b, int c) {
//		
//	}
	
	public static void method2(String...values) {
		System.out.println( "�迭�� ���� :" + values.length);
		
		for( String k : values) {
			System.out.print( k + " ");
		}
		System.out.println();
	}
	

	
	
	
	
	
	
	
	
	
}
