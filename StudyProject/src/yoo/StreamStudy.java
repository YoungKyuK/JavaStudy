package yoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy {
	public static void main(String[] args) {
		
		// ✔ Stream이란 ? ( 데이터의 연속적인 흐름 )
		// 		다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
		// Stream이 제공하는 기능 - 중간 연산과 최종 연산
		// 		- 중간 연산 : 연산결과가 스트림인 연산, 반복적으로 적용가능 ( 0 ~ n번 )


		List<Integer> list = Arrays.asList( 1,2,3,4,5 );
		
		Stream<Integer> stream = list.stream(); // 컬렉션
		stream.distinct().limit(3).sorted().forEach(System.out::println);
			// ✔중간연산(중복제거),✔중간연산(3개자르기),✔중간연산(정렬), ✔최종연산 ( 출력 )h
		
		Stream<Integer> intStream = list.stream(); // 컬렉션
		Stream<String> strStream = Stream.of( new String[] {"a", "b", "c"}); // 배열
		Stream<Integer> evenStream = Stream.iterate( 0,  n->n+2); // 0,2,4,6 ...
		Stream<Double> randomStream = Stream.generate( Math::random); // 람다식
		IntStream intStream2 = new Random().ints(5); // 난수 스트림 ( 크기가 5 )
		
		/*
		 * 스트림의 특징
		 * - 원본변경은 하지 않는다. 데이터를 읽기만 할뿐 변경하지 않는다.
		 * - 스트림은 Iterator처럼 일회용이다. ( 필요하면 다시 생성해야함 )
		 * - 지연된 연산으로 최종연산 전까지 수행하지 않는다.
		 * */
		List<Integer> list2 = Arrays.asList( 3,1,5,4,2);
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList()); // list를 정렬해서 새로운 list에 저장
		System.out.println( list2 );     	// [ 3,1,5,4,2] ( 원본데이터 변경 X )
		System.out.println( sortedList );	// [ 1,2,3,4,5]로 변경
		
		strStream.forEach(System.out::println); // 모든 요소를 화면에 출력 ( 최종연산 )
		// int numOfStr = strStream.count(); // 에러. 스트림이 이미 닫혔음.		
		
		// 스트림의 작업을 병렬로 처리 - 병렬스트림
		Stream<String> strStream2 = Stream.of( "dd", "aaa", "CC" , "cc","b");
		int sum = strStream2.parallel().mapToInt( s -> s.length()).sum(); 
		                  // ✔ 병렬스트림으로 전환 ( 속성만 변경 )
		
		// 기본형 스트림 - IntStream, LongStream, DoubleStream
		// 데이터소스가 기본형일때 사용
		// 오토박싱&언박싱의 비효율이 제거됨 ( Stream<Integer> 대신 IntStream사용 )
		// 기본형으로 변환 : 언박싱
		// 참조형으로 변환 : 오토박싱 ( 객체로 변환 )
		
		
		
		
		
		
		
		
	}
}
