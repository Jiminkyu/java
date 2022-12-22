package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;
		b = (2 > 1) && (2 > 1);
		b = 2 < 1 && 2 > 1;
		b = 2 < 1 || 2 > 1;
		b = 2 < 1 || 2 < 1;
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y <0;
		//x에서이미 false가 판정됫기때문에 뒤에는계산을안하므로 y는0이된다.
		x = 0;
		y = 0;
		b = ++x < 0 & ++y <0;
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y <0;
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y <0;
		//이것도마찬가지로 앞에서  true가판정낫기때문에 뒤엔계산안한다.
		x = 0;
		y = 0;
		b = ++x > 0 | ++y <0;
		
		System.out.printf("x: %d, y: %d, b: %b", x, y, b);
	}
}
