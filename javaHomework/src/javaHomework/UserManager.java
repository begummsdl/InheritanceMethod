package javaHomework;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " kullanıcısı eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " kullanıcısı silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " kullanıcısı güncellendi.");
	}

}
