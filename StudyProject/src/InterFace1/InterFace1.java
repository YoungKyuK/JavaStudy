package InterFace1;


// ����ʵ尡 public static final�� ����
// ��� �޼��尡 public abstract���� ����
// ����Ʈ �޼���� public���� ����

// ��ü������ ��ü���� �Ұ�

interface A {
	
	int a = 3; //������ public static final �ڵ����� �߰�
	void abc(); //������ public abstract �ڵ����� �߰�
}

interface B {
	
	public static final int b = 3; 
	public abstract void bcd(); 
}

public interface InterFace1 {
	public static void main(String[] args) {
		
		// # 1. �ʵ��� static Ư¡ Ȯ�� ( Ŭ����/�������̽� �̸����� �ٷ� ���ٰ���)
		System.out.println( A.a);
		System.out.println( B.b);
		
		// # 2. �ʵ��� final Ư¡ Ȯ�� ( �� ���� �Ұ� )
		// A.a=4;
		// B.b=4;
	}
	

}
