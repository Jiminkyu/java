package CH05.ex09.case01;

import CH05.home.ex06.case02.Console;

public class Init {
	private static int s;
	private int i;
	
	static {
		Init.s = 1;
		//this.i = 1;
		Console.info("static{}");
	}
	
	{
		this.i = 1;
		Init.s = 1;
		Console.info("{}");
	}
	
	{
		Console.info("{}2");
	}
	
	public Init() {
		Console.info("init()");
	}
	
	public Init(int i) {
		Console.info("Init(int)");
	}
}
