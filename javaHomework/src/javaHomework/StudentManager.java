package javaHomework;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli öðrenci eklendi.");
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli öðrenci silindi.");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli öðrenci güncellendi.");
	}
	
	public void sendHomework() {
		System.out.println("Ödev gönderildi");
	}

}
