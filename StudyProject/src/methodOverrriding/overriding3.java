package methodOverrriding;



// 메서드 오버라이딩은 접근지정자가 같거나 넓어야한다. A1이 protected라서 public, protected만 오버라이딩이 가능하다.
class A1{
	protected void abc() {}
}

class B1 extends A1{
	protected void abc() {}
}
class B2 extends A1{
	public void abc() {}
}
//class B3 extends A1{
//	 void abc() {} 좁아져서 불가능
//}
//class B4 extends A1{
//	private void abc() {} 좁아져서 불가능
//}


public class overriding3 {

	public static void main(String[] args) {
		
		
	}
	
}
	
	

