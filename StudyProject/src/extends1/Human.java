package extends1;

public class Human {
	
	String name;
	int age;
	
	 void eat() {
		
	}
	 
	 void sleep() {
		 
	 }
	 
	 public static void main(String[] args) {
		
		 Human h = new Human();  // �޸� ��ü ( �ʵ� 2��, �޼��� 2�� )
		 h.name="ȫ�浿";
		 h.age=30;
		 h.eat();
		 h.sleep();
		 
		 Student s = new Student(); // �л� ��ü ( �ʵ� 2+1��, �޼��� 2+1�� )
		 s.name="�̽±�";
		 s.age=32;
		 s.eat();
		 s.sleep();
		 s.gotoSchool();
		 s.Studentid=5;
		 
		 Worker w = new Worker();  // ������ ��ü ( �ʵ� 2+1��, �޼��� 2+1�� )
		 w.name="������";
		 w.age=30;
		 w.eat();
		 w.sleep();
		 w.goTOwork();
		 w.workerid=7;
	}

}
