package yoo;

import java.nio.file.Files;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy2 {
	public static void main(String[] args) {
		
		// 스트림 생성 - 컬렉션
		
		// Stream<E> stream() ( Collection인터페이스의 메서드 )
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Stream<Integer> intStream = list.stream(); // list를 스트림으로 변환
//		
//		// 스트림의 모든 요소를 출력
//		intStream.forEach( System.out::print); // 12345 forEach() 최종연산
//		// Stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
//		
//		intStream = list.stream(); // list로부터 stream을 새로 생성
//		intStream.forEach(System.out::print); // 
		
		
		// 스트림 만들기 - 배열
		
		String[] strArr = {"a", "b", "c", "d"};
		// Stream<String> strStream = Stream.of( new String[] {"a", "b", "c", "d"} ); // 합칠떄는 new를 써줘야함.
		//Stream<String> strStream = Stream.of( strArr );
		Stream<String> strStream = Arrays.stream( strArr );
		strStream.forEach(System.out::println);
		
		int[] intArr = { 1,2,3,4,5 };
		IntStream intStream = Arrays.stream( intArr );
		// intStream.forEach( System.out::println);
		//System.out.println( "count = " + intStream.count());
		//System.out.println( "sum = " + intStream.sum());
		System.out.println( "average = " + intStream.average());
		
//		Integer[] intArr = { 1 , 2, 3, 4, 5 };
//		Stream<Integer> intStream = Stream.of( intArr );
//		//intStream.forEach( System.out::println);
//		//System.out.println( "count = " + intStream.count()); //최종연산
		
		// 스트림 만들기 - 난수 ( 임의의 수 )
		IntStream intStream2 = new Random().ints( 1, 46); // 무한스트림
		intStream2
		.distinct()
		.limit(6) // 6개만 자르기
		.forEach( System.out::println);
		
		// 특정 범위의 정수
		IntStream intStream3 = IntStream.range(1, 5); //1,2,3,4
		IntStream intStream4 = IntStream.rangeClosed(1, 5); //1,2,3,4,5
		
		//intStream3.forEach(System.out::println);
		//intStream4.forEach(System.out::print);
		
		
		// 람다식							// 이전 요소에 종속적 ( iterate )
										// 이전 요소에 독립적 ( generate )
		// iterate ( T seed, UnaryOperator f ) 단항 연산자
		Stream<Integer> intStream5 = Stream.iterate(1 , n-> n + 2 );
		intStream5.limit(5).forEach(System.out::println);
		
		// generate( Supplier s : 주기만 하는것 입력x, 출력o
		Stream<Integer> intStream6 = Stream.generate( ()->1);
		intStream6.limit(5).forEach(System.out::println);
		
		// 파일과 빈 스트림
		// Stream<Path> files = Files.list( Path dir ); Path 파일 또는 디렉토리
		
		
		
	}
}
