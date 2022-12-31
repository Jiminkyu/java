package ch02.ex02;

public class C02Char {
	public static void main(String[] args) {
		char c = 'A';//A는 65 a는 97 0 은 48
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = 65;
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = 0x0041;
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = '\u0041';
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
	}
}
