package ch03.ex07;

public class C02StringCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a";
		b = s == "a";
		
		s = new String("a");
		System.out.println(s);
		b = s == "a";
		
		b = s.equals("a");
		
		System.out.println(b);
	}
}
