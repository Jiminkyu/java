package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object";
		System.out.println(msg);
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg += "Object";
		System.out.println(msg);
		
//extends나implements 의관계에잇는건 instanceof를썻을때 컴파일에러가안난다
//		if(b instanceof F)
//		if(c instanceof F)
		
		F f = new F();
		msg = "";
//		if(f instanceof C) 
		if(f instanceof A) msg += "A";//interface는가능하다.
		System.out.println(msg);
	}
}
