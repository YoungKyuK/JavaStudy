package FinalandAbstract;

class A1{
	int a = 3;
	final int b = 5;
	A1(){
		int b = 9; // �Ұ���
	}
}
	
	
class A2{
	int a = 3;
	final int b;
	A2(){
		a = 3 ;
		b = 5 ;
	}
}

	public class finalA {

	public static void main(String[] args) {
		
		// # 1. ��ü ����
		A1 a1 = new A1();
		A2 a2 = new A2();
		a1.a = 7;
     // a1.b = 9; ���̳��ʵ�� �ѹ� ������ ���� �ٽ� �ٲ� �� ����.
		
		a2.a = 7;
	// a2.b = 9; ���̳��ʵ�� �ѹ� ������ ���� �ٽ� �ٲ� �� ����.
		
		
	}
}
