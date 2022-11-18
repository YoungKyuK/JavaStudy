package yoo;

import java.util.Arrays;

import javax.management.ValueExp;

public class StringStudy {

	public static void main(String[] args) {

		// #1. String클래스는 객체내의 값 변경 불가능 -> 새로운 객체 생성 후 변경

		String str1 = new String("안녕");
		String str2 = str1;

		str1 = "안녕하세요";
		System.out.println(str1);
		System.out.println(str2);

		// #2. 리터럴로 바로 입력한 경우에는 문자열이 같은 경우 하나의 객체를 공유 할 수 있다

		String str3 = "안녕";
		String str4 = "안녕";
		System.out.println(str3 == str4);

		// String.valueOf (기본자료형) => 기본자료형을 String으로 변환
		String str5 = "안녕" + String.valueOf("!");
		System.out.println(str5);

		System.out.println();

		String str6 = "Hello Java!";
		System.out.println(str6.indexOf('a')); // 7번째
		System.out.println(str6.indexOf("Java")); // 6번째
		System.out.println(str6.lastIndexOf('H')); //
		System.out.println();

		// String의 주요 메서드
		// 문자열 수정 ( toUpperCase() , toLowerCase(),
		String str10 = "Java Study";
		System.out.println(str10.toUpperCase()); // JAVA STUDY
		System.out.println(str10.toLowerCase()); // java study

		// replace
		System.out.println(str10.replace("Study", "공부")); // Java 공부

		// substring
		System.out.println(str10.substring(0, 5)); // 0부터 5까지 Java

		// split
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray)); // / - 공백 제거 후 열거

		// trim
		System.out.println("    abc    ".trim());

		// 문자열 내용비교 ( equals(),equalsIgnoreCase( 대소문자 구분 X ) )
		String str11 = new String("java");
		String str12 = new String("java");
		System.out.println(str11.equals(str12));
		System.out.println(str11.equalsIgnoreCase(str12));

	}
}
