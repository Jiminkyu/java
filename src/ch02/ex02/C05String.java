package ch02.ex02;

public class C05String {
	public static void main(String[] args) {
		// text block
		String comment = """
				이 식당에 방문하길 잘했네요.
				"참 맛있다."
				라는 말이 절로 나오네요.
				""";
		System.out.println(comment);
		
		String color = """
				red
				green
				blue
				""";
		System.out.println(color);
		//\s전까지의 \n갑은 전부 공간을차지한다.
		color = """
				red  \s  
				green\s
				blue \s
				""";
		System.out.println(color);
		
		String type = "int";
		String code = """
				public void print(""" + type + """
				 val)
				 System.out.println(val);
				""";
		System.out.println(code);
		
		code = """
				<html>
					<body>
						<p>Hello, Java</p>
					</body>
				</html>""";
		System.out.println("|" + code + "|");
	}
}
