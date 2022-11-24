package yoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class example {

	public static void main(String[] args) {
		
		/**
		 * 
		 *  1 ) Key�� ����̸� - ��ȣ , ���� , ����
		 *  2 ) Value�� ģ���̸� [ ��� 5���̻��� �־���� ] - ���������� ����
		 *   
		 * **/
		Map<String, List<String>> test = new HashMap<>();
		
		test.put( "��", Arrays.asList("��Ÿ1" , "��Ÿ2" , "��Ÿ3"));
		test.put( "��", Arrays.asList("����1" , "����2" , "����3"));
		test.put( "��", Arrays.asList("��ȣ1" , "��ȣ2" , "��ȣ3"));
		
		// 200 , 400 ,600
		final List<String> VALIDATION_CHECK = Arrays.asList( "200" , "400" , "600");
		
		String �Ѿ�º��� = null; //request.get("params"); << Client���� �Ѿ�� ����
		if( VALIDATION_CHECK.contains(�Ѿ�º���)) {
			// �̷������� VALIDATION_CHECK�� ������
		}
		
		////////////////////////////////
		
		// 1) key�� ���־�?
		
		// 2) value �ѷ���
		
		// ���� ����
		// ex 1) 
		// ��
		// ��
		// ��
		
		// ex 2)
		// ["��Ÿ1" , "��Ÿ2" , "��Ÿ3"]
		// ["��ȣ1" , "��ȣ2" , "��ȣ3"]
		// ["����1" , "����2" , "����3"]
		
		//test.keySet().forEach( ( data->{
		//	System.out.println( data );
		//})); // Key�� �̾Ƴ���.
		
		// ���ٽ�
		test.keySet().forEach(System.out::println);
		
		List<String> arr = Arrays.asList( "apple", "banana", "orange"); 
		arr.get(0).toUpperCase(); // ������Ÿ���� �����ϰ�� ��밡��
		
		String abcd = "yoo";
		abcd.toUpperCase();
		
		///////// list�� stream�̶� ���� �Ѹ��̴�.
	    // �̰� ���ϸ� �ڵ� 100��¥�� 10�ٷ� �ٲ�
		/*
		List<String> arr2 = Arrays.asList( "apple", "banana", "orange");
		
		List changeUpper = new ArrayList<>();
		for ( String abc : arr2) {
			changeUpper.add(abc.toUpperCase());
		}
		changeUpper.forEach(System.out::println);
		*/
		
		List<String> changeUpperStream 
			= arr.stream().map(String::toUpperCase)
				.collect(Collectors.toList());
		
		changeUpperStream.forEach(System.out::println);
	
		

		
		
		
		
		

	       
	        
	   
		
	}
}
