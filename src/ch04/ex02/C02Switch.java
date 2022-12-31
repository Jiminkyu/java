package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		
		switch(grade) {
		case "gold" -> coupon = "5만원";
		case "silver" -> coupon = "1만원";
		default -> coupon = "1천원";
		}//유지보수를 위해 code중복을 피하자.
		//case뒤에는 switch와 같은 타입을써야한다.
		switch(grade) {
		case "gold", "silver" -> coupon = "5만원";
		default -> coupon = "1천원";
		}
		
		System.out.println(coupon);
	}
}
