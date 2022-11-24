package yoo;

public class ArrayStudy {

	public static void main(String[] args) {
		
		int[] array = new int[] {3,4,5,6,7};
		
		// # 1. �迭�� ���� ���ϱ�
		System.out.println( array.length); // 5
		System.out.println();
		
		// # 2. ����ϱ� 1:
		System.out.println( array[0]);
		System.out.println( array[1]);
		System.out.println( array[2]);
		System.out.println( array[3]);
		System.out.println( array[4]);
		System.out.println();
		
		// # 3. ����ϱ� 2:
		for( int i=0; i<array.length; i++) {
			System.out.println( array[i]);
		}
		System.out.println();
		
		// # 4. ����ϱ� 3:
		// for-Each ���� : for( ���� �ϳ��ǿ��Ҹ� ������ �� �ִ� ���� : ���հ�ü ) {}
		for ( int k : array ) {
			System.out.println( k );
		}
		
		// int[][] a = new int[2][3]; 2�� 3�� 2�����迭 ����
		// a[0][0] = 1;
		// a[0][1] = 2;
		// a[0][2] = 3;
		// a[1][0] = 4;
		// int[][] a; = int[]�� �����ϴ� 1���� �迭
		// 2���� �迭 : 1�����迭�� ���ҷ� ������ 1���� �迭
		
		
		// int[][] a = new int[2][];
		// a[0] = new int[3]; // 2���߿� ù��° �ε����� 1�����迭 3������
		// a[0][0] = 1;     a[0][1] = 2;     a[0][2] = 3;
		// a[0] = new int[] {1,2,3};
		
		
		// a[1] = new int[2]; // 2���߿� �ι��� �ε����� 1�����迭 2������
		
		// int [][] a = new[][]{1,2,3}{4,5,6} // 2�� 3�� 2�����迭
		// int [][] a = {{1,2,3},{4,5,6}} // �̰͵� ����
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
		
		// ���ڿ� -> ���� : Integer.parseInt(���ڿ�);
		// ���ڿ� -> �Ǽ� : Double.parseDouble(���ڿ�);
		// int a = Integer.parseInt( b );
		// int a = Integer.valueOf(b); ( ��Ȳ�� �°� ��ȯ���� )
		
	}
}
