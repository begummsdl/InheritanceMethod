package javaHomework;

public class Instructor extends User{
	private String instructorInfo;
	
	public Instructor() {

	}
	
	public Instructor(int id, String firstName, String lastName, String email, String password, String instructorInfo) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.instructorInfo = instructorInfo;
	}

	public String getInstructorInfo() {
		return instructorInfo;
	}

	public void setInstructorInfo(String instructorInfo) {
		this.instructorInfo = instructorInfo;
	}

}
