package Fibonacci;




public class Fibonacci {
	
	public static void main(String[] args) {
		
		

		int input = 8; // 8�� ���

		for (int i = 1; i <= input; i++) {
			System.out.println(fibo(i));
		}
	}

	public static int fibo(int n) {
		if (n <= 1) //1�ϋ��� 1, 2�϶��� else�� Ÿ����
			return n;
		else 
                        return fibo(n-2) + fibo(n-1);
	}
	
	

}
