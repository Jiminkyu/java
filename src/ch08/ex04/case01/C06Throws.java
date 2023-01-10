package ch08.ex04.case01;

public class C06Throws {
//	public void first() {
//		this.second();
//	}
//	
//	public void second() {
//		this.thrid();
//	}
//	
//	public void thrid() {
//		int i = 3 / 0;
//	}
	
	public void first() {
		this.second();
	}
	
	public void second() {
		try {
		this.thrid();
		} catch(Exception e) {
			System.out.println("second()");
		}
	}
	
	public void thrid() throws Exception {
		int i = 3 / 0;
	}
	
	public static void main(String[] args) {
		new C06Throws().first();
		System.out.println("end.");
	}
}
