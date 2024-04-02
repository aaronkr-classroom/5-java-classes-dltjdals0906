
public class Ex704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.id = 20221004;
		s1.name = "유재석";
		s1.printinfo();
		
		s2.insertRecord(20021005, "마동석"); // Don Lee
		s2.printinfo();
		
		Student s3 = new Student(20221006, "김유석");
		s3.printinfo();
		
		Student s4 = new Student(20000906, "이성민"); // It's me
		s4.printinfo();
	}

}
