package javaHomework;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli e�itmen eklendi.");
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli e�itmen silindi.");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli e�itmen g�ncellendi.");
	}
	
	public void addCourse() {
		System.out.println("Kurs eklendi.");
	}

}
