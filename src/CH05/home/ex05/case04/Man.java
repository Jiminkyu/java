package CH05.home.ex05.case04;

import java.time.LocalDate;

public class Man {
	private String manName;
	private int age;
	private LocalDate birthDay;
	
	public void setManName(String manName) {
		this.manName = manName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	
	public void sing() {}
	public void eat() {}
	public void run() {}
	
}
