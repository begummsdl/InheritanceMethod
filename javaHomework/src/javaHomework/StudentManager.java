package javaHomework;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli ��renci eklendi.");
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli ��renci silindi.");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli ��renci g�ncellendi.");
	}
	
	public void sendHomework() {
		System.out.println("�dev g�nderildi");
	}

}
