package InterFace3;



// 접근지정자 
interface A {
	public abstract void abc();
}

interface B{
	void bcd(); // public abstract 생략시 컴파일러가 자동추가
}

class C implements A{
	@Override
	public void abc() { // 완성의 기준은 중괄호{} 
		
	}
}

//class D implements B{
//	// void bcd() { // public접근지정자가 -> defalut로 바뀜	
//	//}
//}



public interface InterFace1 {
	public static void main(String[] args) {
		
	
	}
	

}
