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
		
		System.out.println( "�����ȣ :" + memberNumber );
		System.out.println( "����ּ� :" + memberAddress );
		System.out.println( "����̸� :" + memberName );
	}

	public static void main(String[] args) {
		   MemberConstructor m2 = new MemberConstructor(2000);
		    m2.displayMember();
		    System.out.println("====================");

		    MemberConstructor m3 = new MemberConstructor(3000,"�Ӳ���");
		    m3.displayMember();
		    System.out.println("====================");

		    MemberConstructor m4 = new MemberConstructor(4000,"����ġ","��õ�� ���̱�");

		    m4.displayMember();
		    System.out.println("====================");
		    
		    //�����ڰ� ����Ǿ� ���� ������ �ν��Ͻ��� ���� �� �� ����.
		    //MemberConstructor m5 = new MemberConstructor(400,"����","������","��");
	}
	
	

}
 