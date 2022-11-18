package yoo;

public class ArrayStudy {

	public static void main(String[] args) {
		
		int[] array = new int[] {3,4,5,6,7};
		
		// # 1. 배열의 길이 구하기
		System.out.println( array.length); // 5
		System.out.println();
		
		// # 2. 출력하기 1:
		System.out.println( array[0]);
		System.out.println( array[1]);
		System.out.println( array[2]);
		System.out.println( array[3]);
		System.out.println( array[4]);
		System.out.println();
		
		// # 3. 출력하기 2:
		for( int i=0; i<array.length; i++) {
			System.out.println( array[i]);
		}
		System.out.println();
		
		// # 4. 출력하기 3:
		// for-Each 구문 : for( 꺼낸 하나의원소를 저장할 수 있는 변수 : 집합객체 ) {}
		for ( int k : array ) {
			System.out.println( k );
		}
		
		// int[][] a = new int[2][3]; 2행 3열 2차원배열 생성
		// a[0][0] = 1;
		// a[0][1] = 2;
		// a[0][2] = 3;
		// a[1][0] = 4;
		// int[][] a; = int[]를 저장하는 1차원 배열
		// 2차원 배열 : 1차원배열을 원소로 가지는 1차원 배열
		
		
		// int[][] a = new int[2][];
		// a[0] = new int[3]; // 2행중에 첫번째 인덱스에 1차원배열 3개생성
		// a[0][0] = 1;     a[0][1] = 2;     a[0][2] = 3;
		// a[0] = new int[] {1,2,3};
		
		
		// a[1] = new int[2]; // 2행중에 두번쨰 인덱스에 1차원배열 2개생성
		
		// int [][] a = new[][]{1,2,3}{4,5,6} // 2행 3열 2차원배열
		// int [][] a = {{1,2,3},{4,5,6}} // 이것도 가능
		System.out.println();
		int [][] a =  {{1,2} , {4,5,6}};
		for ( int i=0; i<a.length; i++) {
			for ( int j=0; j<a[i].length; j++) {
				System.out.println( a[i][j] );
			}
		}
		
		System.out.println();
		
		int [][] b = {{1,2} , {3,4,5}};
		for ( int[] m : b) {
			for( int n : m) {
				System.out.println( n );
			}
		}
		
		// 문자열 -> 정수 : Integer.parseInt(문자열);
		// 문자열 -> 실수 : Double.parseDouble(문자열);
		// int a = Integer.parseInt( b );
		// int a = Integer.valueOf(b); ( 상황에 맞게 변환해줌 )
		
	}
}
