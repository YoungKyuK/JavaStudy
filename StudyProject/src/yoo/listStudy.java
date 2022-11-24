package yoo;

import java.util.ArrayList;
import java.util.List;

public class listStudy {
	public static void main(String[] args) {
		
		// 리스트는 중복이 가능하다
		List<String> list = new ArrayList<>();
		
		// list 안에 120개의 정보를 넣어줘 
		
		// 내용
		// 흑곰 0 ~ 120개까지
		
		// 순서 초기화(1) , 조건문(2), 증감식(4)
		for( int i = 0 ; i < 120; i++) {
			// (3)
			list.add("흑곰" + i);
		}
		
		System.out.println( "사이즈는 ?? " + list.size());
		
		list.stream().forEach( i-> {
			System.out.println( i );
		});
		
	}
}
