package CH05.ex09.case01;

public class Main {
	public static void main(String[] args) {
		new Init();
		new Init();
		
		new Init(1);
	}
}
// static block - instance block - 생성자가 실행된다.