package CH05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private String userName;
	private int age;
	private LocalDate joinDate;
	
	public void setUserName(String userName) {
		this.userName = userName; 
	}
	
	public void setAge(int age) {
		this.age = age;
	}	
	
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate; 
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public int getAge() {
		return this.age;
	}

	public LocalDate getJoinDate() {
		return this.joinDate; 
	}
}
