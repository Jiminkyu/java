package ch08.ex02.case05;

public class User {
	private String userName;
	private Level level;
	
	public User(String userName, Level level) {
		this.userName = userName;
		this.level =level;
	}
	
	public void upgradeLevel() {
		Level nextLevel = level.next();
		if(nextLevel != null) this.level = nextLevel;
	}//도메인에잇는데이터만으로 업무수행이가능하면 서비스에들어갈
//	알고리즘은 도메인안에다 구현해도된다.
	
	@Override
	public String toString() {
		return String.format("%s %s", userName, level)	;
	}
}
