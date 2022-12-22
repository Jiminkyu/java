package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3;//final은 변수를 상수로만들어버린다.
		// Max = 1;
		double area = 3.14 * 3 * 3;
		
		final double PI = 3.14;
		int r = 3;
		area = PI * r * r;
	}
}
