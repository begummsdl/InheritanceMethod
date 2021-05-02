package javaHomework;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " kullanýcýsý eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " kullanýcýsý silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " kullanýcýsý güncellendi.");
	}

}
