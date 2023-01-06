package ch07.ex05.case01;

public class Basket<E> {
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
//<>이안에문자를덯으면 generic type이된다.