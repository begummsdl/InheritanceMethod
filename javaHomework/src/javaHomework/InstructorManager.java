package javaHomework;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli eðitmen eklendi.");
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli eðitmen silindi.");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli eðitmen güncellendi.");
	}
	
	public void addCourse() {
		System.out.println("Kurs eklendi.");
	}

}
