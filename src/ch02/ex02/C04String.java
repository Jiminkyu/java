package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
		String s = "|" + " a happy ".trim() + "|";
		// trim으로 공백을 지웟다.
		s = s.concat(" dog");//주어에 목적어를 붙히는 역할을한다.
		s = s.substring(2);//2인덱스 이하의 문자열을 리턴한다.
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n", s.charAt(1));
		//문자하나를 뜯어낼때는 chartAt을 쓴다.
		int i = "apple".codePointAt(1);//유니코드로나타낸다.
		i = "a".hashCode();
		i = "b".hashCode();
		i = "b".compareTo("a");//앞의문자와 비교한값을나타낸다.
		i = "a".compareTo("b");//앞의문자가 더크면 양수 작으면음수로나타낸다.
		i = "A".compareTo("a");
		i = "A".compareToIgnoreCase("a");
		i = s.indexOf("l");//문자가중복될땐 첫번째문자를 먼저읽는다.
		i = s.lastIndexOf("l");
		i = s.length();
		System.out.println(i);
		
		s = "develop";
		boolean b = s.startsWith("de");
		b = s.endsWith("lop");
		b = s.equals("develop");
		b = s.equals("Develop");
		b = s.equalsIgnoreCase("Develop");
		//ignoreCase는 대소문자구분을 무시한다.
		b = "".isEmpty();
		b = s.matches("[a-zA-Z]*");//문자를썻느냐를묻는것이다.
		b = s.matches("[0-9]*");//숫자를썻느냐를묻는것이다.
		
		System.out.println(b);
	}
}
