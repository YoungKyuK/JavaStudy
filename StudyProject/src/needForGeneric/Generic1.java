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
		
		// # 1. Goods1을 통해서 Apple 객체 추가 및 가져오기
		Goods1 goods1 = new Goods1();
		goods1.setApple( new Apple() ); // apple으로만 집어 넣을 수 있다 (세팅) ( set )
		Apple apple = goods1.getApple(); // Apple로만 리턴하니까 apple 타입으로 받아야함. apple타입으로만 꺼낼 수 있다 ( get )
		
		// # 1. Goods2을 통해서 Pencil 객체 추가 및 가져오기
		Goods2 goods2 = new Goods2();
		goods2.setPencil( new Pencil());
		Pencil pencil = goods2.getPencil();
		
		
	}
}
