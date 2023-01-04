package ch06.ex02.case01;

public class A {
	private int a;
	int b; // default 같은 패키지 안에서만 보인다.
	protected int c;//default와 동일하지만 상속관계에잇다면 보인다.
	public int d;
	
	private void m1() {}
	void m2() {}
	protected void m3() {}
	public void m4() {}
}
