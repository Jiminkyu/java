package CH05.home.ex06.case02;

import CH05.ex06.case02.Console;

public class Main {
	public static void main(String[] args) {
		Console.inStr("문자를 입력하세요.");
		Console.inNum("자연수를 입력하세요.");
		
		Console.info("끝.");
	}
	
}
/*
과제: ch05.ex06.case02.Console 을 고도화 하라.
Console.inStr(): 문자를 입력한다.
Console.inStr(): 자연수를 입력한다.
--

문자를 입력하세요.
>
ERROR] 문자가 아닙니다.
문자를 입력하세요.
> hello
자연수를 입력하세요.
> 
ERROR] 자연수가 아닙니다.
자연수를 입력하세요.
> 12
ERROR] 자연수가 아닙니다.
자연수를 입력하세요.
> 1
끝.
*/