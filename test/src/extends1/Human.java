package extends1;

public class Human {
	
	String name;
	int age;
	
	 void eat() {
		
	}
	 
	 void sleep() {
		 
	 }
	 
	 public static void main(String[] args) {
		
		 Human h = new Human();  // 휴면 객체 ( 필드 2개, 메서드 2개 )
		 h.name="홍길동";
		 h.age=30;
		 h.eat();
		 h.sleep();
		 
		 Student s = new Student(); // 학생 객체 ( 필드 2+1개, 메서드 2+1개 )
		 s.name="이승기";
		 s.age=32;
		 s.eat();
		 s.sleep();
		 s.gotoSchool();
		 s.Studentid=5;
		 
		 Worker w = new Worker();  // 직장인 객체 ( 필드 2+1개, 메서드 2+1개 )
		 w.name="이지은";
		 w.age=30;
		 w.eat();
		 w.sleep();
		 w.goTOwork();
		 w.workerid=7;
	}

}
