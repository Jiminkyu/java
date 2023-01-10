package ch08.ex04.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "gambit";
		
		try {// exception을 발생시키는 실행문이잇을땐 반드시 try블록으로묶어야한다.
			if(userId.length() > 3)
				throw new LengthException("문자 길이가 초과되었습니다.");
		} catch(LengthException e) {
			e.printStackTrace();
		}
		
		throw new NumberException("숫자가 아닙니다.");
	}
}