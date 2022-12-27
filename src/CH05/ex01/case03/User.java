package CH05.ex01.case03;

public class User {
	private String userName;
	private int age;
//  공공 return x  
	public void setUserName(String userName) {
		this.userName = userName;  // this는 class 타입의 객체다.
	}
	
	public void setAge(int age) {// setter
		this.age = age;
	}//쓰기는 set 읽기는 get
	
	public String getUserName() {
		return this.userName;
	}
	
	public int getAge() {//getter
		return this.age;
	} // accessor 접근자 
	
}   
