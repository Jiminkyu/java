package CH05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {}
	
	public Baby(String babyName) {
		this.babyName = babyName;
	}// new로만 호출할수잇다. 
	
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}// 객체가잇다면 그객체를 통해 호출할수잇다. 
}
