package CH05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
	
	
	public static String inStr(String msg) {
		boolean isGood = false;
		String tmp = "";
		do {
			Console.inMsg(msg);
			tmp = sc.nextLine();
			isGood = tmp.matches("[a-zA-Z가-힣]+");
			if(!isGood) Console.err("문자가 아닙니다.");
		} while(!isGood);
		return tmp;
	}
	public static int inNum(String msg) {
		boolean isGood = false;
		String tmp = "";
		do {
			Console.inMsg(msg);
			isGood = sc.nextLine().matches("[0-9]+");
			Console.err(msg);
		} while(!isGood);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
}
