package constructor;

public class MemberConstructor {
	
	private int memberNumber;
	private String memberName;
	private String memberAddress;
	
	
	public MemberConstructor(int memberNumber){
        this.memberNumber = memberNumber;
    }
	
	public MemberConstructor(int memberNumber,String memberName){
        super();
        this.memberNumber = memberNumber;
        this.memberName = memberName;
    }
	
	   public MemberConstructor(int memberNumber, String memberName, String memberAddress){
	        super();
	        this.memberNumber = memberNumber;
	        this.memberName = memberName;
	        this.memberAddress = memberAddress;
	}
	   
	   
	   
	 
	
	public void displayMember() {
		
		System.out.println( "멤버번호 :" + memberNumber );
		System.out.println( "멤버주소 :" + memberAddress );
		System.out.println( "멤버이름 :" + memberName );
	}

	public static void main(String[] args) {
		   MemberConstructor m2 = new MemberConstructor(2000);
		    m2.displayMember();
		    System.out.println("====================");

		    MemberConstructor m3 = new MemberConstructor(3000,"임꺽정");
		    m3.displayMember();
		    System.out.println("====================");

		    MemberConstructor m4 = new MemberConstructor(4000,"전우치","부천시 원미구");

		    m4.displayMember();
		    System.out.println("====================");
		    
		    //생성자가 선언되어 있지 않으면 인스턴스를 생성 할 수 없다.
		    //MemberConstructor m5 = new MemberConstructor(400,"영미","군포시","영");
	}
	
	

}
 