package method;

public class Static {

	int a=1; // �ν��Ͻ� �ʵ�
	static int b=2; // static(����) �ʵ�
	
	public static void main(String[] args) {
		
		// # 1. �ν��Ͻ� �ʵ� Ȱ���� ( �׻� ��ü ���� ���� ��밡�� )
		Static a1 = new Static();
		System.out.println( a1.a);
		
		// # 2. static ( ���� ) �ʵ� Ȱ����
		// # 1 ( ��ü �������� Ŭ���� �̸����� �ٷ�Ȱ�� )
		System.out.println(Static.b);
		
		// # 2 ( ��ü ���� �� Ȱ��, �ν��Ͻ��� �����ϰ� : ������ ����)
		
		Static a2 = new Static();
		System.out.println( a2.b);
		
		
	}
}
