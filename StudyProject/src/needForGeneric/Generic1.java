package needForGeneric;


class Apple{}

class Goods1{
	private Apple apple = new Apple();

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
	
}

class Pencil{}

class Goods2{
	private Pencil pencil = new Pencil();

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
}


public class Generic1 {

	public static void main(String[] args) {
		
		// # 1. Goods1�� ���ؼ� Apple ��ü �߰� �� ��������
		Goods1 goods1 = new Goods1();
		goods1.setApple( new Apple() ); // apple���θ� ���� ���� �� �ִ� (����) ( set )
		Apple apple = goods1.getApple(); // Apple�θ� �����ϴϱ� apple Ÿ������ �޾ƾ���. appleŸ�����θ� ���� �� �ִ� ( get )
		
		// # 1. Goods2�� ���ؼ� Pencil ��ü �߰� �� ��������
		Goods2 goods2 = new Goods2();
		goods2.setPencil( new Pencil());
		Pencil pencil = goods2.getPencil();
		
		
	}
}
