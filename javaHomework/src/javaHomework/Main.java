package javaHomework;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "Beg�m", "Mu�dal", "begum@begum.com", "123456", 90);
		Instructor instructor = new Instructor(1, "Engin", "Demiro�", "engin@engin.com", "121212", null);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
	}
}


