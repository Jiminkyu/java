package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String op ="";
		int result = 0;
		
		String tmp = "";
		boolean isGood = false;
		String errMsg = "input 0 or natural number.";
		
		do {
			do {
				isGood = false;
				System.out.print("a: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) a = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: "); op = sc.nextLine();
				isGood = op.matches("[+-/\\*]");// regular expression
				if(!isGood) System.out.println("input one of them(+, -, *, /)");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) b = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			
			System.out.println("continue(y/n)? ");
		} while(sc.nextLine().equalsIgnoreCase("y"));
		
		System.out.println("end.");
	}
}
/* 실패
과제: 계산기를 만들어라.
연산자는 +, -, *, / 이다.
/는 몫만을 구한다.
  
 continue(y/n)? 에서 y 또는 y를 입력하면 계산 작업을 재수행한다.
 y 또는 Y 외를 입력하면 앱을 종료한다.
--

a: 1
op: +
b: 2
1 + 2 = 3
continue(y/n)? y
a: 2
op: *
b: 2
2 * 2 = 4
continue(y/n)? n
end.
Scanner sc = new Scanner(System.in);
	String op = "";
	boolean isGood = false;
	boolean isGood1 = false;
	String input1 = "";
	String input2 = "";
	String input3 = "";
	int result = 0;
	int num1 = 0;
	int num2 = 0;
	
	do {
		do {
			System.out.print("a: ");
			input1 = sc.nextLine();
			isGood = input1.matches("[0-9]*");
			
			if(!isGood) System.out.println("0 또는 자연수를 입력하세요.");
		} while(!isGood);

		do {
			System.out.print("op: ");
			op = sc.nextLine();
			isGood = op.matches("[+ * / -]");
			
			if(!isGood) System.out.println("+, -, *, /중 하나를 입력하세요.");
		} while(!isGood);
		
		do {
			System.out.print("b: ");
			input2 = sc.nextLine();
			isGood = input2.matches("[0-9]*");
			
			if(!isGood) System.out.println("0 또는 자연수를 입력하세요.");
		} while(!isGood);
		
		num1 = Integer.parseInt(input1);
		num2 = Integer.parseInt(input2);
		
		result = switch(op) {
		case "+" -> num1 + num2;
		case "-" -> num1 - num2;
		case "*" -> num1 * num2;
		default -> num1 / num2;
		};
		
		System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
			
		do{
			System.out.print("continue(y/n)? ");
			input3 = sc.nextLine();
			isGood = input3.matches("[y Y n N]");
			isGood1 = input3.matches("[y Y]");
			if(!isGood) System.out.println("y 또는 Y를 입력해 다시계산할지 n 또는 N을입력해 앱을 종료할지 선택하세요.");
		} while(!isGood); 
	}while(isGood1);
	
	System.out.print("end.");
*/