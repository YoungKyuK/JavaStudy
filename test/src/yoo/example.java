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
		 *  1 ) Key는 사람이름 - 정호 , 영규 , 규진
		 *  2 ) Value는 친구이름 [ 적어도 5명이상이 있어야함 ] - 동명이인이 있음
		 *   
		 * **/
		Map<String, List<String>> test = new HashMap<>();
		
		test.put( "김", Arrays.asList("낙타1" , "낙타2" , "낙타3"));
		test.put( "유", Arrays.asList("영규1" , "영규2" , "영규3"));
		test.put( "정", Arrays.asList("정호1" , "정호2" , "정호3"));
		
		// 200 , 400 ,600
		final List<String> VALIDATION_CHECK = Arrays.asList( "200" , "400" , "600");
		
		String 넘어온변수 = null; //request.get("params"); << Client에서 넘어온 변수
		if( VALIDATION_CHECK.contains(넘어온변수)) {
			// 이런식으로 VALIDATION_CHECK가 가능함
		}
		
		////////////////////////////////
		
		// 1) key값 뭐있어?
		
		// 2) value 뿌려봐
		
		// 한줄 한줄
		// ex 1) 
		// 김
		// 유
		// 정
		
		// ex 2)
		// ["낙타1" , "낙타2" , "낙타3"]
		// ["정호1" , "정호2" , "정호3"]
		// ["영규1" , "영규2" , "영규3"]
		
		//test.keySet().forEach( ( data->{
		//	System.out.println( data );
		//})); // Key를 뽑아낸다.
		
		// 람다식
		test.keySet().forEach(System.out::println);
		
		List<String> arr = Arrays.asList( "apple", "banana", "orange"); 
		arr.get(0).toUpperCase(); // 데이터타입이 문자일경우 사용가능
		
		String abcd = "yoo";
		abcd.toUpperCase();
		
		///////// list는 stream이랑 거의 한몸이다.
	    // 이거 잘하면 코드 100줄짜리 10줄로 바뀜
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
