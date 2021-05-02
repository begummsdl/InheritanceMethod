package javaHomework;

public class Student extends User{
	private int percentageOfProgress;
	
	public Student() {

	}

	public Student(int id, String firstName, String lastName, String email, String password, int percentageOfProgress) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.percentageOfProgress = percentageOfProgress;
	}

	public int getPercentageOfProgress() {
		return percentageOfProgress;
	}

	public void setPercentageOfProgress(int percentageOfProgress) {
		this.percentageOfProgress = percentageOfProgress;
	}

}
